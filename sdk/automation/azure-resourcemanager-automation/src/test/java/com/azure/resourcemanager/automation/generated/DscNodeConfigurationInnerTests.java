// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.fluent.models.DscNodeConfigurationInner;
import com.azure.resourcemanager.automation.models.DscConfigurationAssociationProperty;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class DscNodeConfigurationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DscNodeConfigurationInner model = BinaryData.fromString(
            "{\"properties\":{\"lastModifiedTime\":\"2021-04-04T08:44:05Z\",\"creationTime\":\"2021-10-16T04:11:54Z\",\"configuration\":{\"name\":\"xbezyiuokktwh\"},\"source\":\"xw\",\"nodeCount\":9026620259515350080,\"incrementNodeConfigurationBuild\":true},\"id\":\"bsureximo\",\"name\":\"yocf\",\"type\":\"fksymddystki\"}")
            .toObject(DscNodeConfigurationInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-04T08:44:05Z"), model.lastModifiedTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-16T04:11:54Z"), model.creationTime());
        Assertions.assertEquals("xbezyiuokktwh", model.configuration().name());
        Assertions.assertEquals("xw", model.source());
        Assertions.assertEquals(9026620259515350080L, model.nodeCount());
        Assertions.assertEquals(true, model.incrementNodeConfigurationBuild());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DscNodeConfigurationInner model
            = new DscNodeConfigurationInner().withLastModifiedTime(OffsetDateTime.parse("2021-04-04T08:44:05Z"))
                .withCreationTime(OffsetDateTime.parse("2021-10-16T04:11:54Z"))
                .withConfiguration(new DscConfigurationAssociationProperty().withName("xbezyiuokktwh"))
                .withSource("xw")
                .withNodeCount(9026620259515350080L)
                .withIncrementNodeConfigurationBuild(true);
        model = BinaryData.fromObject(model).toObject(DscNodeConfigurationInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-04T08:44:05Z"), model.lastModifiedTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-16T04:11:54Z"), model.creationTime());
        Assertions.assertEquals("xbezyiuokktwh", model.configuration().name());
        Assertions.assertEquals("xw", model.source());
        Assertions.assertEquals(9026620259515350080L, model.nodeCount());
        Assertions.assertEquals(true, model.incrementNodeConfigurationBuild());
    }
}
