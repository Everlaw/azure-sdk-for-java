// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.automation.fluent.models.HybridRunbookWorkerGroupInner;
import java.io.IOException;
import java.util.List;

/**
 * The response model for the list hybrid runbook worker groups.
 */
@Fluent
public final class HybridRunbookWorkerGroupsListResult
    implements JsonSerializable<HybridRunbookWorkerGroupsListResult> {
    /*
     * Gets or sets a list of hybrid runbook worker groups.
     */
    private List<HybridRunbookWorkerGroupInner> value;

    /*
     * Gets or sets the next link.
     */
    private String nextLink;

    /**
     * Creates an instance of HybridRunbookWorkerGroupsListResult class.
     */
    public HybridRunbookWorkerGroupsListResult() {
    }

    /**
     * Get the value property: Gets or sets a list of hybrid runbook worker groups.
     * 
     * @return the value value.
     */
    public List<HybridRunbookWorkerGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets a list of hybrid runbook worker groups.
     * 
     * @param value the value value to set.
     * @return the HybridRunbookWorkerGroupsListResult object itself.
     */
    public HybridRunbookWorkerGroupsListResult withValue(List<HybridRunbookWorkerGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets or sets the next link.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets or sets the next link.
     * 
     * @param nextLink the nextLink value to set.
     * @return the HybridRunbookWorkerGroupsListResult object itself.
     */
    public HybridRunbookWorkerGroupsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HybridRunbookWorkerGroupsListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HybridRunbookWorkerGroupsListResult if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HybridRunbookWorkerGroupsListResult.
     */
    public static HybridRunbookWorkerGroupsListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HybridRunbookWorkerGroupsListResult deserializedHybridRunbookWorkerGroupsListResult
                = new HybridRunbookWorkerGroupsListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<HybridRunbookWorkerGroupInner> value
                        = reader.readArray(reader1 -> HybridRunbookWorkerGroupInner.fromJson(reader1));
                    deserializedHybridRunbookWorkerGroupsListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedHybridRunbookWorkerGroupsListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHybridRunbookWorkerGroupsListResult;
        });
    }
}
