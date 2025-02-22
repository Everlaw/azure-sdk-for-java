// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.streamanalytics.models.AuthenticationMode;
import com.azure.resourcemanager.streamanalytics.models.AzureSynapseDataSourceProperties;
import java.io.IOException;

/**
 * The properties that are associated with an Azure Synapse output.
 */
@Fluent
public final class AzureSynapseOutputDataSourceProperties extends AzureSynapseDataSourceProperties {
    /**
     * Creates an instance of AzureSynapseOutputDataSourceProperties class.
     */
    public AzureSynapseOutputDataSourceProperties() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSynapseOutputDataSourceProperties withServer(String server) {
        super.withServer(server);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSynapseOutputDataSourceProperties withDatabase(String database) {
        super.withDatabase(database);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSynapseOutputDataSourceProperties withTable(String table) {
        super.withTable(table);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSynapseOutputDataSourceProperties withUser(String user) {
        super.withUser(user);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSynapseOutputDataSourceProperties withPassword(String password) {
        super.withPassword(password);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureSynapseOutputDataSourceProperties withAuthenticationMode(AuthenticationMode authenticationMode) {
        super.withAuthenticationMode(authenticationMode);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("server", server());
        jsonWriter.writeStringField("database", database());
        jsonWriter.writeStringField("table", table());
        jsonWriter.writeStringField("user", user());
        jsonWriter.writeStringField("password", password());
        jsonWriter.writeStringField("authenticationMode",
            authenticationMode() == null ? null : authenticationMode().toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureSynapseOutputDataSourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureSynapseOutputDataSourceProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureSynapseOutputDataSourceProperties.
     */
    public static AzureSynapseOutputDataSourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureSynapseOutputDataSourceProperties deserializedAzureSynapseOutputDataSourceProperties
                = new AzureSynapseOutputDataSourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("server".equals(fieldName)) {
                    deserializedAzureSynapseOutputDataSourceProperties.withServer(reader.getString());
                } else if ("database".equals(fieldName)) {
                    deserializedAzureSynapseOutputDataSourceProperties.withDatabase(reader.getString());
                } else if ("table".equals(fieldName)) {
                    deserializedAzureSynapseOutputDataSourceProperties.withTable(reader.getString());
                } else if ("user".equals(fieldName)) {
                    deserializedAzureSynapseOutputDataSourceProperties.withUser(reader.getString());
                } else if ("password".equals(fieldName)) {
                    deserializedAzureSynapseOutputDataSourceProperties.withPassword(reader.getString());
                } else if ("authenticationMode".equals(fieldName)) {
                    deserializedAzureSynapseOutputDataSourceProperties
                        .withAuthenticationMode(AuthenticationMode.fromString(reader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureSynapseOutputDataSourceProperties;
        });
    }
}
