// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the vault.
 */
@Fluent
public final class VaultProperties implements JsonSerializable<VaultProperties> {
    /*
     * Provisioning State.
     */
    private String provisioningState;

    /*
     * Details for upgrading vault.
     */
    private UpgradeDetails upgradeDetails;

    /*
     * List of private endpoint connection.
     */
    private List<PrivateEndpointConnectionVaultProperties> privateEndpointConnections;

    /*
     * Private endpoint state for backup.
     */
    private VaultPrivateEndpointState privateEndpointStateForBackup;

    /*
     * Private endpoint state for site recovery.
     */
    private VaultPrivateEndpointState privateEndpointStateForSiteRecovery;

    /*
     * Customer Managed Key details of the resource.
     */
    private VaultPropertiesEncryption encryption;

    /*
     * The details of the latest move operation performed on the Azure Resource
     */
    private VaultPropertiesMoveDetails moveDetails;

    /*
     * The State of the Resource after the move operation
     */
    private ResourceMoveState moveState;

    /*
     * Backup storage version
     */
    private BackupStorageVersion backupStorageVersion;

    /*
     * property to enable or disable resource provider inbound network traffic from public clients
     */
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Monitoring Settings of the vault
     */
    private MonitoringSettings monitoringSettings;

    /*
     * Restore Settings of the vault
     */
    private RestoreSettings restoreSettings;

    /*
     * The redundancy Settings of a Vault
     */
    private VaultPropertiesRedundancySettings redundancySettings;

    /*
     * Security Settings of the vault
     */
    private SecuritySettings securitySettings;

    /*
     * Secure Score of Recovery Services Vault
     */
    private SecureScoreLevel secureScore;

    /*
     * Security levels of Recovery Services Vault for business continuity and disaster recovery
     */
    private BcdrSecurityLevel bcdrSecurityLevel;

    /*
     * ResourceGuardOperationRequests on which LAC check will be performed
     */
    private List<String> resourceGuardOperationRequests;

    /**
     * Creates an instance of VaultProperties class.
     */
    public VaultProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning State.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the upgradeDetails property: Details for upgrading vault.
     * 
     * @return the upgradeDetails value.
     */
    public UpgradeDetails upgradeDetails() {
        return this.upgradeDetails;
    }

    /**
     * Set the upgradeDetails property: Details for upgrading vault.
     * 
     * @param upgradeDetails the upgradeDetails value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withUpgradeDetails(UpgradeDetails upgradeDetails) {
        this.upgradeDetails = upgradeDetails;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connection.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionVaultProperties> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the privateEndpointStateForBackup property: Private endpoint state for backup.
     * 
     * @return the privateEndpointStateForBackup value.
     */
    public VaultPrivateEndpointState privateEndpointStateForBackup() {
        return this.privateEndpointStateForBackup;
    }

    /**
     * Get the privateEndpointStateForSiteRecovery property: Private endpoint state for site recovery.
     * 
     * @return the privateEndpointStateForSiteRecovery value.
     */
    public VaultPrivateEndpointState privateEndpointStateForSiteRecovery() {
        return this.privateEndpointStateForSiteRecovery;
    }

    /**
     * Get the encryption property: Customer Managed Key details of the resource.
     * 
     * @return the encryption value.
     */
    public VaultPropertiesEncryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Customer Managed Key details of the resource.
     * 
     * @param encryption the encryption value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withEncryption(VaultPropertiesEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the moveDetails property: The details of the latest move operation performed on the Azure Resource.
     * 
     * @return the moveDetails value.
     */
    public VaultPropertiesMoveDetails moveDetails() {
        return this.moveDetails;
    }

    /**
     * Set the moveDetails property: The details of the latest move operation performed on the Azure Resource.
     * 
     * @param moveDetails the moveDetails value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withMoveDetails(VaultPropertiesMoveDetails moveDetails) {
        this.moveDetails = moveDetails;
        return this;
    }

    /**
     * Get the moveState property: The State of the Resource after the move operation.
     * 
     * @return the moveState value.
     */
    public ResourceMoveState moveState() {
        return this.moveState;
    }

    /**
     * Get the backupStorageVersion property: Backup storage version.
     * 
     * @return the backupStorageVersion value.
     */
    public BackupStorageVersion backupStorageVersion() {
        return this.backupStorageVersion;
    }

    /**
     * Get the publicNetworkAccess property: property to enable or disable resource provider inbound network traffic
     * from public clients.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: property to enable or disable resource provider inbound network traffic
     * from public clients.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the monitoringSettings property: Monitoring Settings of the vault.
     * 
     * @return the monitoringSettings value.
     */
    public MonitoringSettings monitoringSettings() {
        return this.monitoringSettings;
    }

    /**
     * Set the monitoringSettings property: Monitoring Settings of the vault.
     * 
     * @param monitoringSettings the monitoringSettings value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withMonitoringSettings(MonitoringSettings monitoringSettings) {
        this.monitoringSettings = monitoringSettings;
        return this;
    }

    /**
     * Get the restoreSettings property: Restore Settings of the vault.
     * 
     * @return the restoreSettings value.
     */
    public RestoreSettings restoreSettings() {
        return this.restoreSettings;
    }

    /**
     * Set the restoreSettings property: Restore Settings of the vault.
     * 
     * @param restoreSettings the restoreSettings value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withRestoreSettings(RestoreSettings restoreSettings) {
        this.restoreSettings = restoreSettings;
        return this;
    }

    /**
     * Get the redundancySettings property: The redundancy Settings of a Vault.
     * 
     * @return the redundancySettings value.
     */
    public VaultPropertiesRedundancySettings redundancySettings() {
        return this.redundancySettings;
    }

    /**
     * Set the redundancySettings property: The redundancy Settings of a Vault.
     * 
     * @param redundancySettings the redundancySettings value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withRedundancySettings(VaultPropertiesRedundancySettings redundancySettings) {
        this.redundancySettings = redundancySettings;
        return this;
    }

    /**
     * Get the securitySettings property: Security Settings of the vault.
     * 
     * @return the securitySettings value.
     */
    public SecuritySettings securitySettings() {
        return this.securitySettings;
    }

    /**
     * Set the securitySettings property: Security Settings of the vault.
     * 
     * @param securitySettings the securitySettings value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withSecuritySettings(SecuritySettings securitySettings) {
        this.securitySettings = securitySettings;
        return this;
    }

    /**
     * Get the secureScore property: Secure Score of Recovery Services Vault.
     * 
     * @return the secureScore value.
     */
    public SecureScoreLevel secureScore() {
        return this.secureScore;
    }

    /**
     * Get the bcdrSecurityLevel property: Security levels of Recovery Services Vault for business continuity and
     * disaster recovery.
     * 
     * @return the bcdrSecurityLevel value.
     */
    public BcdrSecurityLevel bcdrSecurityLevel() {
        return this.bcdrSecurityLevel;
    }

    /**
     * Get the resourceGuardOperationRequests property: ResourceGuardOperationRequests on which LAC check will be
     * performed.
     * 
     * @return the resourceGuardOperationRequests value.
     */
    public List<String> resourceGuardOperationRequests() {
        return this.resourceGuardOperationRequests;
    }

    /**
     * Set the resourceGuardOperationRequests property: ResourceGuardOperationRequests on which LAC check will be
     * performed.
     * 
     * @param resourceGuardOperationRequests the resourceGuardOperationRequests value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        this.resourceGuardOperationRequests = resourceGuardOperationRequests;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (upgradeDetails() != null) {
            upgradeDetails().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (moveDetails() != null) {
            moveDetails().validate();
        }
        if (monitoringSettings() != null) {
            monitoringSettings().validate();
        }
        if (restoreSettings() != null) {
            restoreSettings().validate();
        }
        if (redundancySettings() != null) {
            redundancySettings().validate();
        }
        if (securitySettings() != null) {
            securitySettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("upgradeDetails", this.upgradeDetails);
        jsonWriter.writeJsonField("encryption", this.encryption);
        jsonWriter.writeJsonField("moveDetails", this.moveDetails);
        jsonWriter.writeStringField("publicNetworkAccess",
            this.publicNetworkAccess == null ? null : this.publicNetworkAccess.toString());
        jsonWriter.writeJsonField("monitoringSettings", this.monitoringSettings);
        jsonWriter.writeJsonField("restoreSettings", this.restoreSettings);
        jsonWriter.writeJsonField("redundancySettings", this.redundancySettings);
        jsonWriter.writeJsonField("securitySettings", this.securitySettings);
        jsonWriter.writeArrayField("resourceGuardOperationRequests", this.resourceGuardOperationRequests,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VaultProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VaultProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the VaultProperties.
     */
    public static VaultProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VaultProperties deserializedVaultProperties = new VaultProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedVaultProperties.provisioningState = reader.getString();
                } else if ("upgradeDetails".equals(fieldName)) {
                    deserializedVaultProperties.upgradeDetails = UpgradeDetails.fromJson(reader);
                } else if ("privateEndpointConnections".equals(fieldName)) {
                    List<PrivateEndpointConnectionVaultProperties> privateEndpointConnections
                        = reader.readArray(reader1 -> PrivateEndpointConnectionVaultProperties.fromJson(reader1));
                    deserializedVaultProperties.privateEndpointConnections = privateEndpointConnections;
                } else if ("privateEndpointStateForBackup".equals(fieldName)) {
                    deserializedVaultProperties.privateEndpointStateForBackup
                        = VaultPrivateEndpointState.fromString(reader.getString());
                } else if ("privateEndpointStateForSiteRecovery".equals(fieldName)) {
                    deserializedVaultProperties.privateEndpointStateForSiteRecovery
                        = VaultPrivateEndpointState.fromString(reader.getString());
                } else if ("encryption".equals(fieldName)) {
                    deserializedVaultProperties.encryption = VaultPropertiesEncryption.fromJson(reader);
                } else if ("moveDetails".equals(fieldName)) {
                    deserializedVaultProperties.moveDetails = VaultPropertiesMoveDetails.fromJson(reader);
                } else if ("moveState".equals(fieldName)) {
                    deserializedVaultProperties.moveState = ResourceMoveState.fromString(reader.getString());
                } else if ("backupStorageVersion".equals(fieldName)) {
                    deserializedVaultProperties.backupStorageVersion
                        = BackupStorageVersion.fromString(reader.getString());
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedVaultProperties.publicNetworkAccess
                        = PublicNetworkAccess.fromString(reader.getString());
                } else if ("monitoringSettings".equals(fieldName)) {
                    deserializedVaultProperties.monitoringSettings = MonitoringSettings.fromJson(reader);
                } else if ("restoreSettings".equals(fieldName)) {
                    deserializedVaultProperties.restoreSettings = RestoreSettings.fromJson(reader);
                } else if ("redundancySettings".equals(fieldName)) {
                    deserializedVaultProperties.redundancySettings = VaultPropertiesRedundancySettings.fromJson(reader);
                } else if ("securitySettings".equals(fieldName)) {
                    deserializedVaultProperties.securitySettings = SecuritySettings.fromJson(reader);
                } else if ("secureScore".equals(fieldName)) {
                    deserializedVaultProperties.secureScore = SecureScoreLevel.fromString(reader.getString());
                } else if ("bcdrSecurityLevel".equals(fieldName)) {
                    deserializedVaultProperties.bcdrSecurityLevel = BcdrSecurityLevel.fromString(reader.getString());
                } else if ("resourceGuardOperationRequests".equals(fieldName)) {
                    List<String> resourceGuardOperationRequests = reader.readArray(reader1 -> reader1.getString());
                    deserializedVaultProperties.resourceGuardOperationRequests = resourceGuardOperationRequests;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVaultProperties;
        });
    }
}
