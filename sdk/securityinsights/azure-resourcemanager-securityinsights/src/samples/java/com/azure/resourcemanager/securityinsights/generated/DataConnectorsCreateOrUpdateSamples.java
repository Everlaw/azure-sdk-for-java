// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.resourcemanager.securityinsights.models.DataTypeState;
import com.azure.resourcemanager.securityinsights.models.OfficeDataConnector;
import com.azure.resourcemanager.securityinsights.models.OfficeDataConnectorDataTypes;
import com.azure.resourcemanager.securityinsights.models.OfficeDataConnectorDataTypesExchange;
import com.azure.resourcemanager.securityinsights.models.OfficeDataConnectorDataTypesSharePoint;
import com.azure.resourcemanager.securityinsights.models.OfficeDataConnectorDataTypesTeams;
import com.azure.resourcemanager.securityinsights.models.TIDataConnector;
import com.azure.resourcemanager.securityinsights.models.TIDataConnectorDataTypes;
import com.azure.resourcemanager.securityinsights.models.TIDataConnectorDataTypesIndicators;
import java.time.OffsetDateTime;

/**
 * Samples for DataConnectors CreateOrUpdate.
 */
public final class DataConnectorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/securityinsights/resource-manager/Microsoft.SecurityInsights/stable/2022-11-01/examples/
     * dataConnectors/CreateOfficeDataConnetor.json
     */
    /**
     * Sample code: Creates or updates an Office365 data connector.
     * 
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void createsOrUpdatesAnOffice365DataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.dataConnectors()
            .createOrUpdateWithResponse("myRg", "myWorkspace", "73e01a99-5cd7-4139-a149-9f2736ff2ab5",
                new OfficeDataConnector().withEtag("\"0300bf09-0000-0000-0000-5c37296e0000\"")
                    .withTenantId("2070ecc9-b4d5-4ae4-adaa-936fa1954fa8")
                    .withDataTypes(new OfficeDataConnectorDataTypes()
                        .withExchange(new OfficeDataConnectorDataTypesExchange().withState(DataTypeState.ENABLED))
                        .withSharePoint(new OfficeDataConnectorDataTypesSharePoint().withState(DataTypeState.ENABLED))
                        .withTeams(new OfficeDataConnectorDataTypesTeams().withState(DataTypeState.ENABLED))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/securityinsights/resource-manager/Microsoft.SecurityInsights/stable/2022-11-01/examples/
     * dataConnectors/CreateThreatIntelligenceDataConnector.json
     */
    /**
     * Sample code: Creates or updates an Threat Intelligence Platform data connector.
     * 
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void createsOrUpdatesAnThreatIntelligencePlatformDataConnector(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.dataConnectors()
            .createOrUpdateWithResponse("myRg", "myWorkspace", "73e01a99-5cd7-4139-a149-9f2736ff2ab5",
                new TIDataConnector().withTenantId("06b3ccb8-1384-4bcc-aec7-852f6d57161b")
                    .withTipLookbackPeriod(OffsetDateTime.parse("2020-01-01T13:00:30.123Z"))
                    .withDataTypes(new TIDataConnectorDataTypes()
                        .withIndicators(new TIDataConnectorDataTypesIndicators().withState(DataTypeState.ENABLED))),
                com.azure.core.util.Context.NONE);
    }
}
