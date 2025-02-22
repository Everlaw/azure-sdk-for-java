// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.TenantConfigurationSyncStateContractInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class TenantConfigurationSyncStateContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TenantConfigurationSyncStateContractInner model = BinaryData.fromString(
            "{\"properties\":{\"branch\":\"slhmgw\",\"commitId\":\"ivrxpfduiol\",\"isExport\":true,\"isSynced\":true,\"isGitEnabled\":false,\"syncDate\":\"2021-07-23T04:42:45Z\",\"configurationChangeDate\":\"2021-07-17T19:43:09Z\",\"lastOperationId\":\"z\"},\"id\":\"cfzlu\",\"name\":\"zdquurbo\",\"type\":\"mvhvz\"}")
            .toObject(TenantConfigurationSyncStateContractInner.class);
        Assertions.assertEquals("slhmgw", model.branch());
        Assertions.assertEquals("ivrxpfduiol", model.commitId());
        Assertions.assertEquals(true, model.isExport());
        Assertions.assertEquals(true, model.isSynced());
        Assertions.assertEquals(false, model.isGitEnabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-23T04:42:45Z"), model.syncDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-17T19:43:09Z"), model.configurationChangeDate());
        Assertions.assertEquals("z", model.lastOperationId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TenantConfigurationSyncStateContractInner model
            = new TenantConfigurationSyncStateContractInner().withBranch("slhmgw")
                .withCommitId("ivrxpfduiol")
                .withIsExport(true)
                .withIsSynced(true)
                .withIsGitEnabled(false)
                .withSyncDate(OffsetDateTime.parse("2021-07-23T04:42:45Z"))
                .withConfigurationChangeDate(OffsetDateTime.parse("2021-07-17T19:43:09Z"))
                .withLastOperationId("z");
        model = BinaryData.fromObject(model).toObject(TenantConfigurationSyncStateContractInner.class);
        Assertions.assertEquals("slhmgw", model.branch());
        Assertions.assertEquals("ivrxpfduiol", model.commitId());
        Assertions.assertEquals(true, model.isExport());
        Assertions.assertEquals(true, model.isSynced());
        Assertions.assertEquals(false, model.isGitEnabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-23T04:42:45Z"), model.syncDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-17T19:43:09Z"), model.configurationChangeDate());
        Assertions.assertEquals("z", model.lastOperationId());
    }
}
