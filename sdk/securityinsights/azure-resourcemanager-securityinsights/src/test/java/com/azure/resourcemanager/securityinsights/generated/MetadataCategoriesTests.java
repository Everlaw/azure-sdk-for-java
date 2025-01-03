// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.MetadataCategories;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MetadataCategoriesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MetadataCategories model = BinaryData
            .fromString("{\"domains\":[\"tsjgqrsx\"],\"verticals\":[\"uuuybnchrsziz\",\"yuel\",\"etndnbfqyggagf\"]}")
            .toObject(MetadataCategories.class);
        Assertions.assertEquals("tsjgqrsx", model.domains().get(0));
        Assertions.assertEquals("uuuybnchrsziz", model.verticals().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MetadataCategories model = new MetadataCategories().withDomains(Arrays.asList("tsjgqrsx"))
            .withVerticals(Arrays.asList("uuuybnchrsziz", "yuel", "etndnbfqyggagf"));
        model = BinaryData.fromObject(model).toObject(MetadataCategories.class);
        Assertions.assertEquals("tsjgqrsx", model.domains().get(0));
        Assertions.assertEquals("uuuybnchrsziz", model.verticals().get(0));
    }
}
