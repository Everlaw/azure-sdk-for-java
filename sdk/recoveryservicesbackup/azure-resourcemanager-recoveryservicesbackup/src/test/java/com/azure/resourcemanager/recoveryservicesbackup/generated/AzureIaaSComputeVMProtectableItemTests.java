// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSComputeVMProtectableItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;

public final class AzureIaaSComputeVMProtectableItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureIaaSComputeVMProtectableItem model =
            BinaryData
                .fromString(
                    "{\"protectableItemType\":\"Microsoft.Compute/virtualMachines\",\"virtualMachineId\":\"nigrfihotjewl\",\"virtualMachineVersion\":\"uzzjgnrefq\",\"resourceGroup\":\"qotoihiqakydiwfb\",\"backupManagementType\":\"wpzdqtvhcspo\",\"workloadType\":\"qaxsipietgbebjf\",\"friendlyName\":\"bmoichd\",\"protectionState\":\"Invalid\"}")
                .toObject(AzureIaaSComputeVMProtectableItem.class);
        Assertions.assertEquals("wpzdqtvhcspo", model.backupManagementType());
        Assertions.assertEquals("qaxsipietgbebjf", model.workloadType());
        Assertions.assertEquals("bmoichd", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.INVALID, model.protectionState());
        Assertions.assertEquals("nigrfihotjewl", model.virtualMachineId());
        Assertions.assertEquals("uzzjgnrefq", model.virtualMachineVersion());
        Assertions.assertEquals("qotoihiqakydiwfb", model.resourceGroup());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureIaaSComputeVMProtectableItem model =
            new AzureIaaSComputeVMProtectableItem()
                .withBackupManagementType("wpzdqtvhcspo")
                .withWorkloadType("qaxsipietgbebjf")
                .withFriendlyName("bmoichd")
                .withProtectionState(ProtectionStatus.INVALID)
                .withVirtualMachineId("nigrfihotjewl")
                .withVirtualMachineVersion("uzzjgnrefq")
                .withResourceGroup("qotoihiqakydiwfb");
        model = BinaryData.fromObject(model).toObject(AzureIaaSComputeVMProtectableItem.class);
        Assertions.assertEquals("wpzdqtvhcspo", model.backupManagementType());
        Assertions.assertEquals("qaxsipietgbebjf", model.workloadType());
        Assertions.assertEquals("bmoichd", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.INVALID, model.protectionState());
        Assertions.assertEquals("nigrfihotjewl", model.virtualMachineId());
        Assertions.assertEquals("uzzjgnrefq", model.virtualMachineVersion());
        Assertions.assertEquals("qotoihiqakydiwfb", model.resourceGroup());
    }
}