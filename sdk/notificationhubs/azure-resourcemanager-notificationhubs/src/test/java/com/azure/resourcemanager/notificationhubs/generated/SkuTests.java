// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.notificationhubs.models.Sku;
import com.azure.resourcemanager.notificationhubs.models.SkuName;
import org.junit.jupiter.api.Assertions;

public final class SkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Sku model = BinaryData.fromString(
            "{\"name\":\"Standard\",\"tier\":\"vg\",\"size\":\"zsymglzufcyzkohd\",\"family\":\"hanufhfcbjysagi\",\"capacity\":1438180551}")
            .toObject(Sku.class);
        Assertions.assertEquals(SkuName.STANDARD, model.name());
        Assertions.assertEquals("vg", model.tier());
        Assertions.assertEquals("zsymglzufcyzkohd", model.size());
        Assertions.assertEquals("hanufhfcbjysagi", model.family());
        Assertions.assertEquals(1438180551, model.capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Sku model = new Sku().withName(SkuName.STANDARD)
            .withTier("vg")
            .withSize("zsymglzufcyzkohd")
            .withFamily("hanufhfcbjysagi")
            .withCapacity(1438180551);
        model = BinaryData.fromObject(model).toObject(Sku.class);
        Assertions.assertEquals(SkuName.STANDARD, model.name());
        Assertions.assertEquals("vg", model.tier());
        Assertions.assertEquals("zsymglzufcyzkohd", model.size());
        Assertions.assertEquals("hanufhfcbjysagi", model.family());
        Assertions.assertEquals(1438180551, model.capacity());
    }
}
