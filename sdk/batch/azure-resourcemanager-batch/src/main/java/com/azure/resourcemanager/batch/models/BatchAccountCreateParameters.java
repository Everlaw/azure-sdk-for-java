// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.batch.fluent.models.BatchAccountCreateProperties;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Parameters supplied to the Create operation.
 */
@Fluent
public final class BatchAccountCreateParameters implements JsonSerializable<BatchAccountCreateParameters> {
    /*
     * The region in which to create the account.
     */
    private String location;

    /*
     * The user-specified tags associated with the account.
     */
    private Map<String, String> tags;

    /*
     * The properties of the Batch account.
     */
    private BatchAccountCreateProperties innerProperties;

    /*
     * The identity of the Batch account.
     */
    private BatchAccountIdentity identity;

    /**
     * Creates an instance of BatchAccountCreateParameters class.
     */
    public BatchAccountCreateParameters() {
    }

    /**
     * Get the location property: The region in which to create the account.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The region in which to create the account.
     * 
     * @param location the location value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: The user-specified tags associated with the account.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The user-specified tags associated with the account.
     * 
     * @param tags the tags value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of the Batch account.
     * 
     * @return the innerProperties value.
     */
    private BatchAccountCreateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The identity of the Batch account.
     * 
     * @return the identity value.
     */
    public BatchAccountIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the Batch account.
     * 
     * @param identity the identity value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withIdentity(BatchAccountIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the autoStorage property: The properties related to the auto-storage account.
     * 
     * @return the autoStorage value.
     */
    public AutoStorageBaseProperties autoStorage() {
        return this.innerProperties() == null ? null : this.innerProperties().autoStorage();
    }

    /**
     * Set the autoStorage property: The properties related to the auto-storage account.
     * 
     * @param autoStorage the autoStorage value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withAutoStorage(AutoStorageBaseProperties autoStorage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountCreateProperties();
        }
        this.innerProperties().withAutoStorage(autoStorage);
        return this;
    }

    /**
     * Get the poolAllocationMode property: The pool allocation mode also affects how clients may authenticate to the
     * Batch Service API. If the mode is BatchService, clients may authenticate using access keys or Microsoft Entra ID.
     * If the mode is UserSubscription, clients must use Microsoft Entra ID. The default is BatchService.
     * 
     * @return the poolAllocationMode value.
     */
    public PoolAllocationMode poolAllocationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().poolAllocationMode();
    }

    /**
     * Set the poolAllocationMode property: The pool allocation mode also affects how clients may authenticate to the
     * Batch Service API. If the mode is BatchService, clients may authenticate using access keys or Microsoft Entra ID.
     * If the mode is UserSubscription, clients must use Microsoft Entra ID. The default is BatchService.
     * 
     * @param poolAllocationMode the poolAllocationMode value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withPoolAllocationMode(PoolAllocationMode poolAllocationMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountCreateProperties();
        }
        this.innerProperties().withPoolAllocationMode(poolAllocationMode);
        return this;
    }

    /**
     * Get the keyVaultReference property: A reference to the Azure key vault associated with the Batch account.
     * 
     * @return the keyVaultReference value.
     */
    public KeyVaultReference keyVaultReference() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultReference();
    }

    /**
     * Set the keyVaultReference property: A reference to the Azure key vault associated with the Batch account.
     * 
     * @param keyVaultReference the keyVaultReference value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withKeyVaultReference(KeyVaultReference keyVaultReference) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountCreateProperties();
        }
        this.innerProperties().withKeyVaultReference(keyVaultReference);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: If not specified, the default value is 'enabled'.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccessType publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: If not specified, the default value is 'enabled'.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withPublicNetworkAccess(PublicNetworkAccessType publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountCreateProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the networkProfile property: The network profile only takes effect when publicNetworkAccess is enabled.
     * 
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().networkProfile();
    }

    /**
     * Set the networkProfile property: The network profile only takes effect when publicNetworkAccess is enabled.
     * 
     * @param networkProfile the networkProfile value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withNetworkProfile(NetworkProfile networkProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountCreateProperties();
        }
        this.innerProperties().withNetworkProfile(networkProfile);
        return this;
    }

    /**
     * Get the encryption property: Configures how customer data is encrypted inside the Batch account. By default,
     * accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used
     * instead.
     * 
     * @return the encryption value.
     */
    public EncryptionProperties encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Configures how customer data is encrypted inside the Batch account. By default,
     * accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used
     * instead.
     * 
     * @param encryption the encryption value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters withEncryption(EncryptionProperties encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountCreateProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the allowedAuthenticationModes property: List of allowed authentication modes for the Batch account that can
     * be used to authenticate with the data plane. This does not affect authentication with the control plane.
     * 
     * @return the allowedAuthenticationModes value.
     */
    public List<AuthenticationMode> allowedAuthenticationModes() {
        return this.innerProperties() == null ? null : this.innerProperties().allowedAuthenticationModes();
    }

    /**
     * Set the allowedAuthenticationModes property: List of allowed authentication modes for the Batch account that can
     * be used to authenticate with the data plane. This does not affect authentication with the control plane.
     * 
     * @param allowedAuthenticationModes the allowedAuthenticationModes value to set.
     * @return the BatchAccountCreateParameters object itself.
     */
    public BatchAccountCreateParameters
        withAllowedAuthenticationModes(List<AuthenticationMode> allowedAuthenticationModes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BatchAccountCreateProperties();
        }
        this.innerProperties().withAllowedAuthenticationModes(allowedAuthenticationModes);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property location in model BatchAccountCreateParameters"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BatchAccountCreateParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchAccountCreateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchAccountCreateParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchAccountCreateParameters.
     */
    public static BatchAccountCreateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchAccountCreateParameters deserializedBatchAccountCreateParameters = new BatchAccountCreateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedBatchAccountCreateParameters.location = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedBatchAccountCreateParameters.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedBatchAccountCreateParameters.innerProperties
                        = BatchAccountCreateProperties.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedBatchAccountCreateParameters.identity = BatchAccountIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBatchAccountCreateParameters;
        });
    }
}
