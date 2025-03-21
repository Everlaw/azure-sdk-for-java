// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.apicenter.fluent.models.ApiVersionInner;
import java.io.IOException;
import java.util.List;

/**
 * The response of a ApiVersion list operation.
 */
@Immutable
public final class ApiVersionListResult implements JsonSerializable<ApiVersionListResult> {
    /*
     * The ApiVersion items on this page
     */
    private List<ApiVersionInner> value;

    /*
     * The link to the next page of items
     */
    private String nextLink;

    /**
     * Creates an instance of ApiVersionListResult class.
     */
    public ApiVersionListResult() {
    }

    /**
     * Get the value property: The ApiVersion items on this page.
     * 
     * @return the value value.
     */
    public List<ApiVersionInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
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
     * Reads an instance of ApiVersionListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiVersionListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApiVersionListResult.
     */
    public static ApiVersionListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApiVersionListResult deserializedApiVersionListResult = new ApiVersionListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ApiVersionInner> value = reader.readArray(reader1 -> ApiVersionInner.fromJson(reader1));
                    deserializedApiVersionListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedApiVersionListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApiVersionListResult;
        });
    }
}
