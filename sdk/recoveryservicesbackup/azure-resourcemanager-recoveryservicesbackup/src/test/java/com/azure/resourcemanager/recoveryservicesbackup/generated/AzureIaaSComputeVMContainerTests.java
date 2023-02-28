// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSComputeVMContainer;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import org.junit.jupiter.api.Assertions;

public final class AzureIaaSComputeVMContainerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureIaaSComputeVMContainer model =
            BinaryData
                .fromString(
                    "{\"containerType\":\"Microsoft.Compute/virtualMachines\",\"virtualMachineId\":\"ychunsjlpjrtwszh\",\"virtualMachineVersion\":\"uic\",\"resourceGroup\":\"vtrrmhwrbfdpyflu\",\"friendlyName\":\"vjglrocuyzlwhhme\",\"backupManagementType\":\"DPM\",\"registrationStatus\":\"clutnpqme\",\"healthStatus\":\"zjkmmykyujxs\",\"protectableObjectType\":\"hsrrryejylmbkz\"}")
                .toObject(AzureIaaSComputeVMContainer.class);
        Assertions.assertEquals("vjglrocuyzlwhhme", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.DPM, model.backupManagementType());
        Assertions.assertEquals("clutnpqme", model.registrationStatus());
        Assertions.assertEquals("zjkmmykyujxs", model.healthStatus());
        Assertions.assertEquals("hsrrryejylmbkz", model.protectableObjectType());
        Assertions.assertEquals("ychunsjlpjrtwszh", model.virtualMachineId());
        Assertions.assertEquals("uic", model.virtualMachineVersion());
        Assertions.assertEquals("vtrrmhwrbfdpyflu", model.resourceGroup());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureIaaSComputeVMContainer model =
            new AzureIaaSComputeVMContainer()
                .withFriendlyName("vjglrocuyzlwhhme")
                .withBackupManagementType(BackupManagementType.DPM)
                .withRegistrationStatus("clutnpqme")
                .withHealthStatus("zjkmmykyujxs")
                .withProtectableObjectType("hsrrryejylmbkz")
                .withVirtualMachineId("ychunsjlpjrtwszh")
                .withVirtualMachineVersion("uic")
                .withResourceGroup("vtrrmhwrbfdpyflu");
        model = BinaryData.fromObject(model).toObject(AzureIaaSComputeVMContainer.class);
        Assertions.assertEquals("vjglrocuyzlwhhme", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.DPM, model.backupManagementType());
        Assertions.assertEquals("clutnpqme", model.registrationStatus());
        Assertions.assertEquals("zjkmmykyujxs", model.healthStatus());
        Assertions.assertEquals("hsrrryejylmbkz", model.protectableObjectType());
        Assertions.assertEquals("ychunsjlpjrtwszh", model.virtualMachineId());
        Assertions.assertEquals("uic", model.virtualMachineVersion());
        Assertions.assertEquals("vtrrmhwrbfdpyflu", model.resourceGroup());
    }
}