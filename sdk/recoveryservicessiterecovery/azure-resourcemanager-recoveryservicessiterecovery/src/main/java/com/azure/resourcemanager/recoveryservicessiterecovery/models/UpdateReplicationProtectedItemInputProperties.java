// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Update protected item input properties.
 */
@Fluent
public final class UpdateReplicationProtectedItemInputProperties
    implements JsonSerializable<UpdateReplicationProtectedItemInputProperties> {
    /*
     * Target Azure VM name given by the user.
     */
    private String recoveryAzureVMName;

    /*
     * Target Azure VM size.
     */
    private String recoveryAzureVMSize;

    /*
     * Target Azure Network Id.
     */
    private String selectedRecoveryAzureNetworkId;

    /*
     * The Azure Network Id for test failover.
     */
    private String selectedTfoAzureNetworkId;

    /*
     * The selected source nic Id which will be used as the primary nic during failover.
     */
    private String selectedSourceNicId;

    /*
     * The selected option to enable RDP\SSH on target vm after failover. String value of
     * SrsDataContract.EnableRDPOnTargetOption enum.
     */
    private String enableRdpOnTargetOption;

    /*
     * The list of VM nic details.
     */
    private List<VMNicInputDetails> vmNics;

    /*
     * License type.
     */
    private LicenseType licenseType;

    /*
     * The target availability set Id.
     */
    private String recoveryAvailabilitySetId;

    /*
     * The provider specific input to update replication protected item.
     */
    private UpdateReplicationProtectedItemProviderInput providerSpecificDetails;

    /**
     * Creates an instance of UpdateReplicationProtectedItemInputProperties class.
     */
    public UpdateReplicationProtectedItemInputProperties() {
    }

    /**
     * Get the recoveryAzureVMName property: Target Azure VM name given by the user.
     * 
     * @return the recoveryAzureVMName value.
     */
    public String recoveryAzureVMName() {
        return this.recoveryAzureVMName;
    }

    /**
     * Set the recoveryAzureVMName property: Target Azure VM name given by the user.
     * 
     * @param recoveryAzureVMName the recoveryAzureVMName value to set.
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withRecoveryAzureVMName(String recoveryAzureVMName) {
        this.recoveryAzureVMName = recoveryAzureVMName;
        return this;
    }

    /**
     * Get the recoveryAzureVMSize property: Target Azure VM size.
     * 
     * @return the recoveryAzureVMSize value.
     */
    public String recoveryAzureVMSize() {
        return this.recoveryAzureVMSize;
    }

    /**
     * Set the recoveryAzureVMSize property: Target Azure VM size.
     * 
     * @param recoveryAzureVMSize the recoveryAzureVMSize value to set.
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withRecoveryAzureVMSize(String recoveryAzureVMSize) {
        this.recoveryAzureVMSize = recoveryAzureVMSize;
        return this;
    }

    /**
     * Get the selectedRecoveryAzureNetworkId property: Target Azure Network Id.
     * 
     * @return the selectedRecoveryAzureNetworkId value.
     */
    public String selectedRecoveryAzureNetworkId() {
        return this.selectedRecoveryAzureNetworkId;
    }

    /**
     * Set the selectedRecoveryAzureNetworkId property: Target Azure Network Id.
     * 
     * @param selectedRecoveryAzureNetworkId the selectedRecoveryAzureNetworkId value to set.
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties
        withSelectedRecoveryAzureNetworkId(String selectedRecoveryAzureNetworkId) {
        this.selectedRecoveryAzureNetworkId = selectedRecoveryAzureNetworkId;
        return this;
    }

    /**
     * Get the selectedTfoAzureNetworkId property: The Azure Network Id for test failover.
     * 
     * @return the selectedTfoAzureNetworkId value.
     */
    public String selectedTfoAzureNetworkId() {
        return this.selectedTfoAzureNetworkId;
    }

    /**
     * Set the selectedTfoAzureNetworkId property: The Azure Network Id for test failover.
     * 
     * @param selectedTfoAzureNetworkId the selectedTfoAzureNetworkId value to set.
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties
        withSelectedTfoAzureNetworkId(String selectedTfoAzureNetworkId) {
        this.selectedTfoAzureNetworkId = selectedTfoAzureNetworkId;
        return this;
    }

    /**
     * Get the selectedSourceNicId property: The selected source nic Id which will be used as the primary nic during
     * failover.
     * 
     * @return the selectedSourceNicId value.
     */
    public String selectedSourceNicId() {
        return this.selectedSourceNicId;
    }

    /**
     * Set the selectedSourceNicId property: The selected source nic Id which will be used as the primary nic during
     * failover.
     * 
     * @param selectedSourceNicId the selectedSourceNicId value to set.
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withSelectedSourceNicId(String selectedSourceNicId) {
        this.selectedSourceNicId = selectedSourceNicId;
        return this;
    }

    /**
     * Get the enableRdpOnTargetOption property: The selected option to enable RDP\SSH on target vm after failover.
     * String value of SrsDataContract.EnableRDPOnTargetOption enum.
     * 
     * @return the enableRdpOnTargetOption value.
     */
    public String enableRdpOnTargetOption() {
        return this.enableRdpOnTargetOption;
    }

    /**
     * Set the enableRdpOnTargetOption property: The selected option to enable RDP\SSH on target vm after failover.
     * String value of SrsDataContract.EnableRDPOnTargetOption enum.
     * 
     * @param enableRdpOnTargetOption the enableRdpOnTargetOption value to set.
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withEnableRdpOnTargetOption(String enableRdpOnTargetOption) {
        this.enableRdpOnTargetOption = enableRdpOnTargetOption;
        return this;
    }

    /**
     * Get the vmNics property: The list of VM nic details.
     * 
     * @return the vmNics value.
     */
    public List<VMNicInputDetails> vmNics() {
        return this.vmNics;
    }

    /**
     * Set the vmNics property: The list of VM nic details.
     * 
     * @param vmNics the vmNics value to set.
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withVmNics(List<VMNicInputDetails> vmNics) {
        this.vmNics = vmNics;
        return this;
    }

    /**
     * Get the licenseType property: License type.
     * 
     * @return the licenseType value.
     */
    public LicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: License type.
     * 
     * @param licenseType the licenseType value to set.
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the recoveryAvailabilitySetId property: The target availability set Id.
     * 
     * @return the recoveryAvailabilitySetId value.
     */
    public String recoveryAvailabilitySetId() {
        return this.recoveryAvailabilitySetId;
    }

    /**
     * Set the recoveryAvailabilitySetId property: The target availability set Id.
     * 
     * @param recoveryAvailabilitySetId the recoveryAvailabilitySetId value to set.
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties
        withRecoveryAvailabilitySetId(String recoveryAvailabilitySetId) {
        this.recoveryAvailabilitySetId = recoveryAvailabilitySetId;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: The provider specific input to update replication protected item.
     * 
     * @return the providerSpecificDetails value.
     */
    public UpdateReplicationProtectedItemProviderInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: The provider specific input to update replication protected item.
     * 
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties
        withProviderSpecificDetails(UpdateReplicationProtectedItemProviderInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmNics() != null) {
            vmNics().forEach(e -> e.validate());
        }
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("recoveryAzureVMName", this.recoveryAzureVMName);
        jsonWriter.writeStringField("recoveryAzureVMSize", this.recoveryAzureVMSize);
        jsonWriter.writeStringField("selectedRecoveryAzureNetworkId", this.selectedRecoveryAzureNetworkId);
        jsonWriter.writeStringField("selectedTfoAzureNetworkId", this.selectedTfoAzureNetworkId);
        jsonWriter.writeStringField("selectedSourceNicId", this.selectedSourceNicId);
        jsonWriter.writeStringField("enableRdpOnTargetOption", this.enableRdpOnTargetOption);
        jsonWriter.writeArrayField("vmNics", this.vmNics, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("licenseType", this.licenseType == null ? null : this.licenseType.toString());
        jsonWriter.writeStringField("recoveryAvailabilitySetId", this.recoveryAvailabilitySetId);
        jsonWriter.writeJsonField("providerSpecificDetails", this.providerSpecificDetails);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UpdateReplicationProtectedItemInputProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdateReplicationProtectedItemInputProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UpdateReplicationProtectedItemInputProperties.
     */
    public static UpdateReplicationProtectedItemInputProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdateReplicationProtectedItemInputProperties deserializedUpdateReplicationProtectedItemInputProperties
                = new UpdateReplicationProtectedItemInputProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("recoveryAzureVMName".equals(fieldName)) {
                    deserializedUpdateReplicationProtectedItemInputProperties.recoveryAzureVMName = reader.getString();
                } else if ("recoveryAzureVMSize".equals(fieldName)) {
                    deserializedUpdateReplicationProtectedItemInputProperties.recoveryAzureVMSize = reader.getString();
                } else if ("selectedRecoveryAzureNetworkId".equals(fieldName)) {
                    deserializedUpdateReplicationProtectedItemInputProperties.selectedRecoveryAzureNetworkId
                        = reader.getString();
                } else if ("selectedTfoAzureNetworkId".equals(fieldName)) {
                    deserializedUpdateReplicationProtectedItemInputProperties.selectedTfoAzureNetworkId
                        = reader.getString();
                } else if ("selectedSourceNicId".equals(fieldName)) {
                    deserializedUpdateReplicationProtectedItemInputProperties.selectedSourceNicId = reader.getString();
                } else if ("enableRdpOnTargetOption".equals(fieldName)) {
                    deserializedUpdateReplicationProtectedItemInputProperties.enableRdpOnTargetOption
                        = reader.getString();
                } else if ("vmNics".equals(fieldName)) {
                    List<VMNicInputDetails> vmNics = reader.readArray(reader1 -> VMNicInputDetails.fromJson(reader1));
                    deserializedUpdateReplicationProtectedItemInputProperties.vmNics = vmNics;
                } else if ("licenseType".equals(fieldName)) {
                    deserializedUpdateReplicationProtectedItemInputProperties.licenseType
                        = LicenseType.fromString(reader.getString());
                } else if ("recoveryAvailabilitySetId".equals(fieldName)) {
                    deserializedUpdateReplicationProtectedItemInputProperties.recoveryAvailabilitySetId
                        = reader.getString();
                } else if ("providerSpecificDetails".equals(fieldName)) {
                    deserializedUpdateReplicationProtectedItemInputProperties.providerSpecificDetails
                        = UpdateReplicationProtectedItemProviderInput.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUpdateReplicationProtectedItemInputProperties;
        });
    }
}
