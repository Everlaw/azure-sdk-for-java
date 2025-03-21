// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The status of the storage insight.
 */
@Fluent
public final class StorageInsightStatus implements JsonSerializable<StorageInsightStatus> {
    /*
     * The state of the storage insight connection to the workspace
     */
    private StorageInsightState state;

    /*
     * Description of the state of the storage insight.
     */
    private String description;

    /**
     * Creates an instance of StorageInsightStatus class.
     */
    public StorageInsightStatus() {
    }

    /**
     * Get the state property: The state of the storage insight connection to the workspace.
     * 
     * @return the state value.
     */
    public StorageInsightState state() {
        return this.state;
    }

    /**
     * Set the state property: The state of the storage insight connection to the workspace.
     * 
     * @param state the state value to set.
     * @return the StorageInsightStatus object itself.
     */
    public StorageInsightStatus withState(StorageInsightState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the description property: Description of the state of the storage insight.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the state of the storage insight.
     * 
     * @param description the description value to set.
     * @return the StorageInsightStatus object itself.
     */
    public StorageInsightStatus withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (state() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property state in model StorageInsightStatus"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageInsightStatus.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StorageInsightStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StorageInsightStatus if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StorageInsightStatus.
     */
    public static StorageInsightStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StorageInsightStatus deserializedStorageInsightStatus = new StorageInsightStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("state".equals(fieldName)) {
                    deserializedStorageInsightStatus.state = StorageInsightState.fromString(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedStorageInsightStatus.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStorageInsightStatus;
        });
    }
}
