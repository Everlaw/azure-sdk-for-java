// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.kusto.fluent.models.AzureResourceSkuInner;
import java.io.IOException;
import java.util.List;

/**
 * List of available SKUs for a Kusto Cluster.
 */
@Fluent
public final class ListResourceSkusResult implements JsonSerializable<ListResourceSkusResult> {
    /*
     * The collection of available SKUs for an existing resource.
     */
    private List<AzureResourceSkuInner> value;

    /**
     * Creates an instance of ListResourceSkusResult class.
     */
    public ListResourceSkusResult() {
    }

    /**
     * Get the value property: The collection of available SKUs for an existing resource.
     * 
     * @return the value value.
     */
    public List<AzureResourceSkuInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection of available SKUs for an existing resource.
     * 
     * @param value the value value to set.
     * @return the ListResourceSkusResult object itself.
     */
    public ListResourceSkusResult withValue(List<AzureResourceSkuInner> value) {
        this.value = value;
        return this;
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ListResourceSkusResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListResourceSkusResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ListResourceSkusResult.
     */
    public static ListResourceSkusResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ListResourceSkusResult deserializedListResourceSkusResult = new ListResourceSkusResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AzureResourceSkuInner> value
                        = reader.readArray(reader1 -> AzureResourceSkuInner.fromJson(reader1));
                    deserializedListResourceSkusResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedListResourceSkusResult;
        });
    }
}
