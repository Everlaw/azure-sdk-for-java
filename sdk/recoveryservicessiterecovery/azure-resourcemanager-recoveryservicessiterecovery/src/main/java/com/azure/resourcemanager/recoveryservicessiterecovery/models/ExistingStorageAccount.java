// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Existing storage account input.
 */
@Fluent
public final class ExistingStorageAccount extends StorageAccountCustomDetails {
    /*
     * The class type.
     */
    private String resourceType = "Existing";

    /*
     * The storage account Arm Id. Throw error, if resource does not exists.
     */
    private String azureStorageAccountId;

    /**
     * Creates an instance of ExistingStorageAccount class.
     */
    public ExistingStorageAccount() {
    }

    /**
     * Get the resourceType property: The class type.
     * 
     * @return the resourceType value.
     */
    @Override
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the azureStorageAccountId property: The storage account Arm Id. Throw error, if resource does not exists.
     * 
     * @return the azureStorageAccountId value.
     */
    public String azureStorageAccountId() {
        return this.azureStorageAccountId;
    }

    /**
     * Set the azureStorageAccountId property: The storage account Arm Id. Throw error, if resource does not exists.
     * 
     * @param azureStorageAccountId the azureStorageAccountId value to set.
     * @return the ExistingStorageAccount object itself.
     */
    public ExistingStorageAccount withAzureStorageAccountId(String azureStorageAccountId) {
        this.azureStorageAccountId = azureStorageAccountId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (azureStorageAccountId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property azureStorageAccountId in model ExistingStorageAccount"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExistingStorageAccount.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("azureStorageAccountId", this.azureStorageAccountId);
        jsonWriter.writeStringField("resourceType", this.resourceType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExistingStorageAccount from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExistingStorageAccount if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExistingStorageAccount.
     */
    public static ExistingStorageAccount fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExistingStorageAccount deserializedExistingStorageAccount = new ExistingStorageAccount();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("azureStorageAccountId".equals(fieldName)) {
                    deserializedExistingStorageAccount.azureStorageAccountId = reader.getString();
                } else if ("resourceType".equals(fieldName)) {
                    deserializedExistingStorageAccount.resourceType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExistingStorageAccount;
        });
    }
}
