// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureSearchIndexDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureSearchIndexDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureSearchIndexDataset model = BinaryData.fromString(
            "{\"type\":\"AzureSearchIndex\",\"typeProperties\":{\"indexName\":\"dataofwuzeb\"},\"description\":\"vmpjbhzyen\",\"structure\":\"datapetxeudwkh\",\"schema\":\"datackdoxo\",\"linkedServiceName\":{\"referenceName\":\"jcdevzpfreor\",\"parameters\":{\"x\":\"datayjmgvrlh\"}},\"parameters\":{\"kdywkszavuafane\":{\"type\":\"Array\",\"defaultValue\":\"datanhbcjy\"},\"zw\":{\"type\":\"Float\",\"defaultValue\":\"datatptplkossjbzvx\"},\"nyuvbtcuhjcgjt\":{\"type\":\"SecureString\",\"defaultValue\":\"datauhfgtiaczhfjdcc\"},\"bszsbzrrxey\":{\"type\":\"Int\",\"defaultValue\":\"datatomnlzthc\"}},\"annotations\":[\"datacowlrmbdctqx\"],\"folder\":{\"name\":\"joezvw\"},\"\":{\"ndm\":\"datazgavp\",\"ek\":\"datafiekkiskyyy\",\"bjiutfofhoajjyl\":\"datafffyshdawjlmlcuf\"}}")
            .toObject(AzureSearchIndexDataset.class);
        Assertions.assertEquals("vmpjbhzyen", model.description());
        Assertions.assertEquals("jcdevzpfreor", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("kdywkszavuafane").type());
        Assertions.assertEquals("joezvw", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureSearchIndexDataset model = new AzureSearchIndexDataset().withDescription("vmpjbhzyen")
            .withStructure("datapetxeudwkh")
            .withSchema("datackdoxo")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("jcdevzpfreor")
                .withParameters(mapOf("x", "datayjmgvrlh")))
            .withParameters(mapOf("kdywkszavuafane",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datanhbcjy"), "zw",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datatptplkossjbzvx"),
                "nyuvbtcuhjcgjt",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING)
                    .withDefaultValue("datauhfgtiaczhfjdcc"),
                "bszsbzrrxey",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datatomnlzthc")))
            .withAnnotations(Arrays.asList("datacowlrmbdctqx"))
            .withFolder(new DatasetFolder().withName("joezvw"))
            .withIndexName("dataofwuzeb");
        model = BinaryData.fromObject(model).toObject(AzureSearchIndexDataset.class);
        Assertions.assertEquals("vmpjbhzyen", model.description());
        Assertions.assertEquals("jcdevzpfreor", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("kdywkszavuafane").type());
        Assertions.assertEquals("joezvw", model.folder().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
