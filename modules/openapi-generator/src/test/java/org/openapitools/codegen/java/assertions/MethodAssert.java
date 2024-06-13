package org.openapitools.codegen.java.assertions;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import org.assertj.core.api.Assertions;

import java.util.Optional;

public class MethodAssert extends AbstractMethodAssert<MethodAssert> {

    private final JavaFileAssert fileAssert;

    MethodAssert(final JavaFileAssert fileAssert, final MethodDeclaration methodDeclaration) {
        super(methodDeclaration, MethodAssert.class);
        this.fileAssert = fileAssert;
    }

    public JavaFileAssert toFileAssert() {
        return fileAssert;
    }

    public MethodAnnotationAssert assertMethodAnnotations() {
        return new MethodAnnotationAssert(this, actual.getAnnotations());
    }

    // TODO move into base class so inner class method parameters can be asserted
    //  (may need some more Generics Kung-Fu applied to the ParameterAssert class,
    //  alternatively the f)
    public ParameterAssert hasParameter(final String paramName) {
        final Optional<Parameter> parameter = actual.getParameterByName(paramName);
        Assertions.assertThat(parameter)
            .withFailMessage("Method %s should have parameter %s, but it doesn't", methodSignature, paramName)
            .isPresent();

        return new ParameterAssert(this, parameter.get());
    }
}
