// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupItemType;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabContainerExtendedInfo;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MabContainerExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MabContainerExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"lastRefreshedAt\":\"2021-10-22T17:25:28Z\",\"backupItemType\":\"FileFolder\",\"backupItems\":[\"bcdsziryrandoyp\",\"blto\",\"rmkfqlwxldykals\"],\"policyName\":\"aolnjpnnbmjk\",\"lastBackupStatus\":\"bjgsjjxxahmrn\"}")
                .toObject(MabContainerExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-22T17:25:28Z"), model.lastRefreshedAt());
        Assertions.assertEquals(BackupItemType.FILE_FOLDER, model.backupItemType());
        Assertions.assertEquals("bcdsziryrandoyp", model.backupItems().get(0));
        Assertions.assertEquals("aolnjpnnbmjk", model.policyName());
        Assertions.assertEquals("bjgsjjxxahmrn", model.lastBackupStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MabContainerExtendedInfo model =
            new MabContainerExtendedInfo()
                .withLastRefreshedAt(OffsetDateTime.parse("2021-10-22T17:25:28Z"))
                .withBackupItemType(BackupItemType.FILE_FOLDER)
                .withBackupItems(Arrays.asList("bcdsziryrandoyp", "blto", "rmkfqlwxldykals"))
                .withPolicyName("aolnjpnnbmjk")
                .withLastBackupStatus("bjgsjjxxahmrn");
        model = BinaryData.fromObject(model).toObject(MabContainerExtendedInfo.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-22T17:25:28Z"), model.lastRefreshedAt());
        Assertions.assertEquals(BackupItemType.FILE_FOLDER, model.backupItemType());
        Assertions.assertEquals("bcdsziryrandoyp", model.backupItems().get(0));
        Assertions.assertEquals("aolnjpnnbmjk", model.policyName());
        Assertions.assertEquals("bjgsjjxxahmrn", model.lastBackupStatus());
    }
}