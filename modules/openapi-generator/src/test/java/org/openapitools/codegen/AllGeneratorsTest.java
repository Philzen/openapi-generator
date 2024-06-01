/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen;

import org.openapitools.codegen.config.CodegenConfigurator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class AllGeneratorsTest {

    @DataProvider(name = "generators") Iterator<CodegenConfig> generators() {
        return CodegenConfigLoader.getAll().iterator();
    }
    
    @Test
    public void testEachWithPetstore() throws IOException {
        for (final CodegenConfig codegenConfig : CodegenConfigLoader.getAll()) {
            final File output = Files.createTempDirectory("test").toFile();
            output.deleteOnExit();

            final CodegenConfigurator configurator = new CodegenConfigurator()
                    .setGeneratorName(codegenConfig.getName())
                    .setInputSpec("src/test/resources/3_0/petstore.yaml")
                    .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

            final ClientOptInput clientOptInput = configurator.toClientOptInput();
            List<File> files = List.of();
            try {
                DefaultGenerator generator = new DefaultGenerator();
                files = generator.opts(clientOptInput).generate();
            } catch (Exception e) {
                Assert.fail("Generator " + codegenConfig.getName() + " threw an exception (generating " + codegenConfig.getInputSpec() + "): " + e.getMessage(), e);
            }
            
            // Main intention of this test is to check that nothing crashes. Besides, we check here that
            // at least 1 file is generated, besides the common ".openapi-generator-ignore", "FILES" and "VERSION" files.
            Assert.assertTrue(files.size() >= 4);
        }
    }

    /**
     * Regression test for <a href="https://github.com/OpenAPITools/openapi-generator/issues/18810">#18810</a>
     * <br>
     * Nice: currently fails for PythonFastAPIServerCodegen 
     */
    @Test(dataProvider = "generators") void noDuplicateCliOptions(CodegenConfig codegenConfig) {
        final List<String> cliOptionKeys = codegenConfig.cliOptions()
            .stream().map(CliOption::getOpt).collect(Collectors.toList()); 
        
        assertThat(cliOptionKeys).allSatisfy(
            opt -> assertThat(cliOptionKeys)
                .as("Generator '%s' defines CliOption '%s' more than once!", codegenConfig.getName(), opt)
                .containsOnlyOnce(opt)
        );
    }
    
    // TODO while we're at it – additional tests for supportedLibraries, additionalProperties, supportingFiles, …younameit…
}
