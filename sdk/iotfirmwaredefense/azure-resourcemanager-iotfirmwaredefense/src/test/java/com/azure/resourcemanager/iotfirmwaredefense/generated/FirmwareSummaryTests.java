// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotfirmwaredefense.models.FirmwareSummary;
import org.junit.jupiter.api.Assertions;

public final class FirmwareSummaryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FirmwareSummary model = BinaryData.fromString(
            "{\"summaryType\":\"Firmware\",\"extractedSize\":5328487592567211708,\"fileSize\":8973268749707616780,\"extractedFileCount\":4408315824184510745,\"componentCount\":4532260686626458912,\"binaryCount\":3431496164141244398,\"analysisTimeSeconds\":7532014789770741104,\"rootFileSystems\":2762302346763758082}")
            .toObject(FirmwareSummary.class);
        Assertions.assertEquals(5328487592567211708L, model.extractedSize());
        Assertions.assertEquals(8973268749707616780L, model.fileSize());
        Assertions.assertEquals(4408315824184510745L, model.extractedFileCount());
        Assertions.assertEquals(4532260686626458912L, model.componentCount());
        Assertions.assertEquals(3431496164141244398L, model.binaryCount());
        Assertions.assertEquals(7532014789770741104L, model.analysisTimeSeconds());
        Assertions.assertEquals(2762302346763758082L, model.rootFileSystems());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FirmwareSummary model = new FirmwareSummary().withExtractedSize(5328487592567211708L)
            .withFileSize(8973268749707616780L)
            .withExtractedFileCount(4408315824184510745L)
            .withComponentCount(4532260686626458912L)
            .withBinaryCount(3431496164141244398L)
            .withAnalysisTimeSeconds(7532014789770741104L)
            .withRootFileSystems(2762302346763758082L);
        model = BinaryData.fromObject(model).toObject(FirmwareSummary.class);
        Assertions.assertEquals(5328487592567211708L, model.extractedSize());
        Assertions.assertEquals(8973268749707616780L, model.fileSize());
        Assertions.assertEquals(4408315824184510745L, model.extractedFileCount());
        Assertions.assertEquals(4532260686626458912L, model.componentCount());
        Assertions.assertEquals(3431496164141244398L, model.binaryCount());
        Assertions.assertEquals(7532014789770741104L, model.analysisTimeSeconds());
        Assertions.assertEquals(2762302346763758082L, model.rootFileSystems());
    }
}
