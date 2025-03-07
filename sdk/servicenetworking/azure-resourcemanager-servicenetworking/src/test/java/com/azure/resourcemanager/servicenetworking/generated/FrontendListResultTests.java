// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicenetworking.implementation.models.FrontendListResult;
import org.junit.jupiter.api.Assertions;

public final class FrontendListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FrontendListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"fqdn\":\"v\",\"provisioningState\":\"Deleting\"},\"location\":\"ihnhun\",\"tags\":{\"gxg\":\"jzrnf\",\"fublj\":\"spemvtzfk\",\"aeqjhqjbasvms\":\"fxqeof\",\"gsntnbybkzgcwr\":\"jqul\"},\"id\":\"clxxwrljdo\",\"name\":\"skcqvkocrcjd\",\"type\":\"wtnhxbnjbiksqr\"},{\"properties\":{\"fqdn\":\"sainqpjwnzl\",\"provisioningState\":\"Deleting\"},\"location\":\"ppeebvmgxsab\",\"tags\":{\"c\":\"duuji\",\"dhkrwpdappdsbdk\":\"czdzev\",\"nhutjeltmrldhugj\":\"wrwjfeu\",\"ablgphuticndvk\":\"zdatqxhocdg\"},\"id\":\"ozwyiftyhxhuro\",\"name\":\"ftyxolniw\",\"type\":\"wcukjfkgiawxk\"},{\"properties\":{\"fqdn\":\"plwckbas\",\"provisioningState\":\"Deleting\"},\"location\":\"ddhsgcbacphe\",\"tags\":{\"ndlik\":\"tynqgoul\"},\"id\":\"yqkgfg\",\"name\":\"bmadgak\",\"type\":\"qsrxybzqqed\"}],\"nextLink\":\"tbciqfouflmm\"}")
            .toObject(FrontendListResult.class);
        Assertions.assertEquals("ihnhun", model.value().get(0).location());
        Assertions.assertEquals("jzrnf", model.value().get(0).tags().get("gxg"));
        Assertions.assertEquals("tbciqfouflmm", model.nextLink());
    }
}
