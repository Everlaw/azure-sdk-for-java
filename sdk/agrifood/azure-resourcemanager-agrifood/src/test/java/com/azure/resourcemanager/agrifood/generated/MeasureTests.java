// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.agrifood.models.Measure;
import org.junit.jupiter.api.Assertions;

public final class MeasureTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Measure model
            = BinaryData.fromString("{\"unit\":\"rncsdtclu\",\"value\":99.38934674886448}").toObject(Measure.class);
        Assertions.assertEquals("rncsdtclu", model.unit());
        Assertions.assertEquals(99.38934674886448D, model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Measure model = new Measure().withUnit("rncsdtclu").withValue(99.38934674886448D);
        model = BinaryData.fromObject(model).toObject(Measure.class);
        Assertions.assertEquals("rncsdtclu", model.unit());
        Assertions.assertEquals(99.38934674886448D, model.value());
    }
}
