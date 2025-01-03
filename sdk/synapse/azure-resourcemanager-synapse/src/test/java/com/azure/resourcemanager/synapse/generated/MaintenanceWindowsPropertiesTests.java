// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.MaintenanceWindowsProperties;
import com.azure.resourcemanager.synapse.models.DayOfWeek;
import com.azure.resourcemanager.synapse.models.MaintenanceWindowTimeRange;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MaintenanceWindowsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MaintenanceWindowsProperties model = BinaryData.fromString(
            "{\"timeRanges\":[{\"dayOfWeek\":\"Monday\",\"startTime\":\"qzhv\",\"duration\":\"ibyfmo\"},{\"dayOfWeek\":\"Tuesday\",\"startTime\":\"kjpvdwxf\",\"duration\":\"iivwzjbhyzsxjrka\"},{\"dayOfWeek\":\"Saturday\",\"startTime\":\"negvmnvuqe\",\"duration\":\"lds\"},{\"dayOfWeek\":\"Monday\",\"startTime\":\"jbkkdmflvestmjl\",\"duration\":\"ril\"}]}")
            .toObject(MaintenanceWindowsProperties.class);
        Assertions.assertEquals(DayOfWeek.MONDAY, model.timeRanges().get(0).dayOfWeek());
        Assertions.assertEquals("qzhv", model.timeRanges().get(0).startTime());
        Assertions.assertEquals("ibyfmo", model.timeRanges().get(0).duration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MaintenanceWindowsProperties model = new MaintenanceWindowsProperties().withTimeRanges(Arrays.asList(
            new MaintenanceWindowTimeRange().withDayOfWeek(DayOfWeek.MONDAY)
                .withStartTime("qzhv")
                .withDuration("ibyfmo"),
            new MaintenanceWindowTimeRange().withDayOfWeek(DayOfWeek.TUESDAY)
                .withStartTime("kjpvdwxf")
                .withDuration("iivwzjbhyzsxjrka"),
            new MaintenanceWindowTimeRange().withDayOfWeek(DayOfWeek.SATURDAY)
                .withStartTime("negvmnvuqe")
                .withDuration("lds"),
            new MaintenanceWindowTimeRange().withDayOfWeek(DayOfWeek.MONDAY)
                .withStartTime("jbkkdmflvestmjl")
                .withDuration("ril")));
        model = BinaryData.fromObject(model).toObject(MaintenanceWindowsProperties.class);
        Assertions.assertEquals(DayOfWeek.MONDAY, model.timeRanges().get(0).dayOfWeek());
        Assertions.assertEquals("qzhv", model.timeRanges().get(0).startTime());
        Assertions.assertEquals("ibyfmo", model.timeRanges().get(0).duration());
    }
}
