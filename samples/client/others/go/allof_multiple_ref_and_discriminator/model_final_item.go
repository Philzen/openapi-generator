/*
Test

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"fmt"
	"bytes"
)

// checks if the FinalItem type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &FinalItem{}

// FinalItem struct for FinalItem
type FinalItem struct {
	BaseItem
	Prop1 string `json:"prop1"`
	Quantity int32 `json:"quantity"`
	UnitPrice float64 `json:"unitPrice"`
	TotalPrice float64 `json:"totalPrice"`
}

type _FinalItem FinalItem

// NewFinalItem instantiates a new FinalItem object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFinalItem(prop1 string, quantity int32, unitPrice float64, totalPrice float64, title string, type_ string) *FinalItem {
	this := FinalItem{}
	this.Title = title
	this.Type = type_
	this.Prop1 = prop1
	this.Quantity = quantity
	this.UnitPrice = unitPrice
	this.TotalPrice = totalPrice
	return &this
}

// NewFinalItemWithDefaults instantiates a new FinalItem object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFinalItemWithDefaults() *FinalItem {
	this := FinalItem{}
	return &this
}

// GetProp1 returns the Prop1 field value
func (o *FinalItem) GetProp1() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Prop1
}

// GetProp1Ok returns a tuple with the Prop1 field value
// and a boolean to check if the value has been set.
func (o *FinalItem) GetProp1Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Prop1, true
}

// SetProp1 sets field value
func (o *FinalItem) SetProp1(v string) {
	o.Prop1 = v
}

// GetQuantity returns the Quantity field value
func (o *FinalItem) GetQuantity() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Quantity
}

// GetQuantityOk returns a tuple with the Quantity field value
// and a boolean to check if the value has been set.
func (o *FinalItem) GetQuantityOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Quantity, true
}

// SetQuantity sets field value
func (o *FinalItem) SetQuantity(v int32) {
	o.Quantity = v
}

// GetUnitPrice returns the UnitPrice field value
func (o *FinalItem) GetUnitPrice() float64 {
	if o == nil {
		var ret float64
		return ret
	}

	return o.UnitPrice
}

// GetUnitPriceOk returns a tuple with the UnitPrice field value
// and a boolean to check if the value has been set.
func (o *FinalItem) GetUnitPriceOk() (*float64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.UnitPrice, true
}

// SetUnitPrice sets field value
func (o *FinalItem) SetUnitPrice(v float64) {
	o.UnitPrice = v
}

// GetTotalPrice returns the TotalPrice field value
func (o *FinalItem) GetTotalPrice() float64 {
	if o == nil {
		var ret float64
		return ret
	}

	return o.TotalPrice
}

// GetTotalPriceOk returns a tuple with the TotalPrice field value
// and a boolean to check if the value has been set.
func (o *FinalItem) GetTotalPriceOk() (*float64, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TotalPrice, true
}

// SetTotalPrice sets field value
func (o *FinalItem) SetTotalPrice(v float64) {
	o.TotalPrice = v
}

func (o FinalItem) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o FinalItem) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["prop1"] = o.Prop1
	toSerialize["quantity"] = o.Quantity
	toSerialize["unitPrice"] = o.UnitPrice
	toSerialize["totalPrice"] = o.TotalPrice
	return toSerialize, nil
}

func (o *FinalItem) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"prop1",
		"quantity",
		"unitPrice",
		"totalPrice",
		"title",
		"type",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varFinalItem := _FinalItem{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varFinalItem)

	if err != nil {
		return err
	}

	*o = FinalItem(varFinalItem)

	return err
}

type NullableFinalItem struct {
	value *FinalItem
	isSet bool
}

func (v NullableFinalItem) Get() *FinalItem {
	return v.value
}

func (v *NullableFinalItem) Set(val *FinalItem) {
	v.value = val
	v.isSet = true
}

func (v NullableFinalItem) IsSet() bool {
	return v.isSet
}

func (v *NullableFinalItem) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFinalItem(val *FinalItem) *NullableFinalItem {
	return &NullableFinalItem{value: val, isSet: true}
}

func (v NullableFinalItem) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFinalItem) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


