// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The ApiManagementSkuRestrictionInfo model.
 */
@Immutable
public final class ApiManagementSkuRestrictionInfo implements JsonSerializable<ApiManagementSkuRestrictionInfo> {
    /*
     * Locations where the SKU is restricted
     */
    private List<String> locations;

    /*
     * List of availability zones where the SKU is restricted.
     */
    private List<String> zones;

    /**
     * Creates an instance of ApiManagementSkuRestrictionInfo class.
     */
    public ApiManagementSkuRestrictionInfo() {
    }

    /**
     * Get the locations property: Locations where the SKU is restricted.
     * 
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Get the zones property: List of availability zones where the SKU is restricted.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApiManagementSkuRestrictionInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiManagementSkuRestrictionInfo if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApiManagementSkuRestrictionInfo.
     */
    public static ApiManagementSkuRestrictionInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApiManagementSkuRestrictionInfo deserializedApiManagementSkuRestrictionInfo
                = new ApiManagementSkuRestrictionInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("locations".equals(fieldName)) {
                    List<String> locations = reader.readArray(reader1 -> reader1.getString());
                    deserializedApiManagementSkuRestrictionInfo.locations = locations;
                } else if ("zones".equals(fieldName)) {
                    List<String> zones = reader.readArray(reader1 -> reader1.getString());
                    deserializedApiManagementSkuRestrictionInfo.zones = zones;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApiManagementSkuRestrictionInfo;
        });
    }
}
