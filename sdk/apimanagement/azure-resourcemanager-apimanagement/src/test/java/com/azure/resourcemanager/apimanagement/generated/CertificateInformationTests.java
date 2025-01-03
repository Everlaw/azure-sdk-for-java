// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.CertificateInformation;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class CertificateInformationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CertificateInformation model = BinaryData
            .fromString("{\"expiry\":\"2021-06-29T09:59:30Z\",\"thumbprint\":\"zabwmvog\",\"subject\":\"jsvlpg\"}")
            .toObject(CertificateInformation.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-29T09:59:30Z"), model.expiry());
        Assertions.assertEquals("zabwmvog", model.thumbprint());
        Assertions.assertEquals("jsvlpg", model.subject());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CertificateInformation model
            = new CertificateInformation().withExpiry(OffsetDateTime.parse("2021-06-29T09:59:30Z"))
                .withThumbprint("zabwmvog")
                .withSubject("jsvlpg");
        model = BinaryData.fromObject(model).toObject(CertificateInformation.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-29T09:59:30Z"), model.expiry());
        Assertions.assertEquals("zabwmvog", model.thumbprint());
        Assertions.assertEquals("jsvlpg", model.subject());
    }
}
