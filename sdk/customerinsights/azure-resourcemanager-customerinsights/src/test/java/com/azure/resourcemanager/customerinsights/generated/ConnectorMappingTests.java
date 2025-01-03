// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.customerinsights.fluent.models.ConnectorMapping;
import com.azure.resourcemanager.customerinsights.models.CompletionOperationTypes;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingAvailability;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingCompleteOperation;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingErrorManagement;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingFormat;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingProperties;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingStructure;
import com.azure.resourcemanager.customerinsights.models.ConnectorTypes;
import com.azure.resourcemanager.customerinsights.models.EntityTypes;
import com.azure.resourcemanager.customerinsights.models.ErrorManagementTypes;
import com.azure.resourcemanager.customerinsights.models.FrequencyTypes;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ConnectorMappingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectorMapping model = BinaryData.fromString(
            "{\"connectorName\":\"fppyogtieyujtvcz\",\"connectorType\":\"AzureBlob\",\"created\":\"2021-09-20T04:44:22Z\",\"lastModified\":\"2021-02-03T15:40:37Z\",\"entityType\":\"Relationship\",\"entityTypeName\":\"unjdx\",\"connectorMappingName\":\"lnkvxlx\",\"displayName\":\"glqivbgkcv\",\"description\":\"pzvuqdflvo\",\"dataFormatId\":\"yp\",\"mappingProperties\":{\"folderPath\":\"ubcpzgpxti\",\"fileFilter\":\"j\",\"hasHeader\":true,\"errorManagement\":{\"errorManagementType\":\"RejectAndContinue\",\"errorLimit\":1003924316},\"format\":{\"columnDelimiter\":\"qjxgpnrhgovfgp\",\"acceptLanguage\":\"qmhhaowj\",\"quoteCharacter\":\"zvuporqzdfuydz\",\"quoteEscapeCharacter\":\"fvxcnqmxqpswo\",\"arraySeparator\":\"vkhlggdhbemz\"},\"availability\":{\"frequency\":\"Day\",\"interval\":299424630},\"structure\":[{\"propertyName\":\"uwiwtglxxhljfpg\",\"columnName\":\"icrmnzh\",\"customFormatSpecifier\":\"mqgjsxvpq\",\"isEncrypted\":true}],\"completeOperation\":{\"completionOperationType\":\"DoNothing\",\"destinationFolder\":\"odth\"}},\"nextRunTime\":\"2021-11-01T20:48:18Z\",\"runId\":\"vriibakclacjfr\",\"state\":\"Expiring\",\"tenantId\":\"sxauzlwvsgmwohqf\"}")
            .toObject(ConnectorMapping.class);
        Assertions.assertEquals(ConnectorTypes.AZURE_BLOB, model.connectorType());
        Assertions.assertEquals(EntityTypes.RELATIONSHIP, model.entityType());
        Assertions.assertEquals("unjdx", model.entityTypeName());
        Assertions.assertEquals("glqivbgkcv", model.displayName());
        Assertions.assertEquals("pzvuqdflvo", model.description());
        Assertions.assertEquals("ubcpzgpxti", model.mappingProperties().folderPath());
        Assertions.assertEquals("j", model.mappingProperties().fileFilter());
        Assertions.assertEquals(true, model.mappingProperties().hasHeader());
        Assertions.assertEquals(ErrorManagementTypes.REJECT_AND_CONTINUE,
            model.mappingProperties().errorManagement().errorManagementType());
        Assertions.assertEquals(1003924316, model.mappingProperties().errorManagement().errorLimit());
        Assertions.assertEquals("qjxgpnrhgovfgp", model.mappingProperties().format().columnDelimiter());
        Assertions.assertEquals("qmhhaowj", model.mappingProperties().format().acceptLanguage());
        Assertions.assertEquals("zvuporqzdfuydz", model.mappingProperties().format().quoteCharacter());
        Assertions.assertEquals("fvxcnqmxqpswo", model.mappingProperties().format().quoteEscapeCharacter());
        Assertions.assertEquals("vkhlggdhbemz", model.mappingProperties().format().arraySeparator());
        Assertions.assertEquals(FrequencyTypes.DAY, model.mappingProperties().availability().frequency());
        Assertions.assertEquals(299424630, model.mappingProperties().availability().interval());
        Assertions.assertEquals("uwiwtglxxhljfpg", model.mappingProperties().structure().get(0).propertyName());
        Assertions.assertEquals("icrmnzh", model.mappingProperties().structure().get(0).columnName());
        Assertions.assertEquals("mqgjsxvpq", model.mappingProperties().structure().get(0).customFormatSpecifier());
        Assertions.assertEquals(true, model.mappingProperties().structure().get(0).isEncrypted());
        Assertions.assertEquals(CompletionOperationTypes.DO_NOTHING,
            model.mappingProperties().completeOperation().completionOperationType());
        Assertions.assertEquals("odth", model.mappingProperties().completeOperation().destinationFolder());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectorMapping model = new ConnectorMapping().withConnectorType(ConnectorTypes.AZURE_BLOB)
            .withEntityType(EntityTypes.RELATIONSHIP)
            .withEntityTypeName("unjdx")
            .withDisplayName("glqivbgkcv")
            .withDescription("pzvuqdflvo")
            .withMappingProperties(new ConnectorMappingProperties().withFolderPath("ubcpzgpxti")
                .withFileFilter("j")
                .withHasHeader(true)
                .withErrorManagement(new ConnectorMappingErrorManagement()
                    .withErrorManagementType(ErrorManagementTypes.REJECT_AND_CONTINUE)
                    .withErrorLimit(1003924316))
                .withFormat(new ConnectorMappingFormat().withColumnDelimiter("qjxgpnrhgovfgp")
                    .withAcceptLanguage("qmhhaowj")
                    .withQuoteCharacter("zvuporqzdfuydz")
                    .withQuoteEscapeCharacter("fvxcnqmxqpswo")
                    .withArraySeparator("vkhlggdhbemz"))
                .withAvailability(
                    new ConnectorMappingAvailability().withFrequency(FrequencyTypes.DAY).withInterval(299424630))
                .withStructure(Arrays.asList(new ConnectorMappingStructure().withPropertyName("uwiwtglxxhljfpg")
                    .withColumnName("icrmnzh")
                    .withCustomFormatSpecifier("mqgjsxvpq")
                    .withIsEncrypted(true)))
                .withCompleteOperation(new ConnectorMappingCompleteOperation()
                    .withCompletionOperationType(CompletionOperationTypes.DO_NOTHING)
                    .withDestinationFolder("odth")));
        model = BinaryData.fromObject(model).toObject(ConnectorMapping.class);
        Assertions.assertEquals(ConnectorTypes.AZURE_BLOB, model.connectorType());
        Assertions.assertEquals(EntityTypes.RELATIONSHIP, model.entityType());
        Assertions.assertEquals("unjdx", model.entityTypeName());
        Assertions.assertEquals("glqivbgkcv", model.displayName());
        Assertions.assertEquals("pzvuqdflvo", model.description());
        Assertions.assertEquals("ubcpzgpxti", model.mappingProperties().folderPath());
        Assertions.assertEquals("j", model.mappingProperties().fileFilter());
        Assertions.assertEquals(true, model.mappingProperties().hasHeader());
        Assertions.assertEquals(ErrorManagementTypes.REJECT_AND_CONTINUE,
            model.mappingProperties().errorManagement().errorManagementType());
        Assertions.assertEquals(1003924316, model.mappingProperties().errorManagement().errorLimit());
        Assertions.assertEquals("qjxgpnrhgovfgp", model.mappingProperties().format().columnDelimiter());
        Assertions.assertEquals("qmhhaowj", model.mappingProperties().format().acceptLanguage());
        Assertions.assertEquals("zvuporqzdfuydz", model.mappingProperties().format().quoteCharacter());
        Assertions.assertEquals("fvxcnqmxqpswo", model.mappingProperties().format().quoteEscapeCharacter());
        Assertions.assertEquals("vkhlggdhbemz", model.mappingProperties().format().arraySeparator());
        Assertions.assertEquals(FrequencyTypes.DAY, model.mappingProperties().availability().frequency());
        Assertions.assertEquals(299424630, model.mappingProperties().availability().interval());
        Assertions.assertEquals("uwiwtglxxhljfpg", model.mappingProperties().structure().get(0).propertyName());
        Assertions.assertEquals("icrmnzh", model.mappingProperties().structure().get(0).columnName());
        Assertions.assertEquals("mqgjsxvpq", model.mappingProperties().structure().get(0).customFormatSpecifier());
        Assertions.assertEquals(true, model.mappingProperties().structure().get(0).isEncrypted());
        Assertions.assertEquals(CompletionOperationTypes.DO_NOTHING,
            model.mappingProperties().completeOperation().completionOperationType());
        Assertions.assertEquals("odth", model.mappingProperties().completeOperation().destinationFolder());
    }
}
