// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Project Database Details.
 */
@Fluent
public final class DatabaseInfo implements JsonSerializable<DatabaseInfo> {
    /*
     * Name of the database
     */
    private String sourceDatabaseName;

    /**
     * Creates an instance of DatabaseInfo class.
     */
    public DatabaseInfo() {
    }

    /**
     * Get the sourceDatabaseName property: Name of the database.
     * 
     * @return the sourceDatabaseName value.
     */
    public String sourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * Set the sourceDatabaseName property: Name of the database.
     * 
     * @param sourceDatabaseName the sourceDatabaseName value to set.
     * @return the DatabaseInfo object itself.
     */
    public DatabaseInfo withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceDatabaseName() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property sourceDatabaseName in model DatabaseInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabaseInfo.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sourceDatabaseName", this.sourceDatabaseName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DatabaseInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DatabaseInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DatabaseInfo.
     */
    public static DatabaseInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DatabaseInfo deserializedDatabaseInfo = new DatabaseInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceDatabaseName".equals(fieldName)) {
                    deserializedDatabaseInfo.sourceDatabaseName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDatabaseInfo;
        });
    }
}
