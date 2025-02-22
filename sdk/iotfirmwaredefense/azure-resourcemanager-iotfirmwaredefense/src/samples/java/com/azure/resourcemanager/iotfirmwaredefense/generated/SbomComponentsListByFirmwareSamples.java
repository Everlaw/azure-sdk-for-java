// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

/**
 * Samples for SbomComponents ListByFirmware.
 */
public final class SbomComponentsListByFirmwareSamples {
    /*
     * x-ms-original-file: specification/fist/resource-manager/Microsoft.IoTFirmwareDefense/stable/2024-01-10/examples/
     * SbomComponents_ListByFirmware_MinimumSet_Gen.json
     */
    /**
     * Sample code: SbomComponents_ListByFirmware_MinimumSet_Gen.
     * 
     * @param manager Entry point to IoTFirmwareDefenseManager.
     */
    public static void sbomComponentsListByFirmwareMinimumSetGen(
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager) {
        manager.sbomComponents()
            .listByFirmware("FirmwareAnalysisRG", "default", "109a9886-50bf-85a8-9d75-000000000000",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/fist/resource-manager/Microsoft.IoTFirmwareDefense/stable/2024-01-10/examples/
     * SbomComponents_ListByFirmware_MaximumSet_Gen.json
     */
    /**
     * Sample code: SbomComponents_ListByFirmware_MaximumSet_Gen.
     * 
     * @param manager Entry point to IoTFirmwareDefenseManager.
     */
    public static void sbomComponentsListByFirmwareMaximumSetGen(
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager) {
        manager.sbomComponents()
            .listByFirmware("FirmwareAnalysisRG", "default", "109a9886-50bf-85a8-9d75-000000000000",
                com.azure.core.util.Context.NONE);
    }
}
