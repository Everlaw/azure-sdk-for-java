// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.SparkConfigurationResourceInner;
import com.azure.resourcemanager.synapse.models.SparkConfigurationListResponse;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SparkConfigurationListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SparkConfigurationListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"description\":\"fdlpukhpyr\",\"configs\":{},\"annotations\":[],\"notes\":\"zjcpeogk\",\"createdBy\":\"mgbro\",\"created\":\"2021-10-26T06:11:35Z\",\"configMergeRule\":{}},\"etag\":\"hfhpfp\",\"id\":\"zjzoywjxhpdul\",\"name\":\"ntacn\",\"type\":\"qwtehtuevr\"},{\"properties\":{\"description\":\"ljyoogwx\",\"configs\":{},\"annotations\":[],\"notes\":\"duugwbsre\",\"createdBy\":\"fqkfuarenl\",\"created\":\"2021-11-15T21:51:51Z\",\"configMergeRule\":{}},\"etag\":\"lnvnafvvkyfedev\",\"id\":\"bo\",\"name\":\"lcqxypokk\",\"type\":\"minqcym\"},{\"properties\":{\"description\":\"ngnbdxxew\",\"configs\":{},\"annotations\":[],\"notes\":\"nvudbchaqdtvqecr\",\"createdBy\":\"tmxxdtddmflhuy\",\"created\":\"2021-10-16T00:35:13Z\",\"configMergeRule\":{}},\"etag\":\"zna\",\"id\":\"xbannovvoxc\",\"name\":\"ytprwnwvroev\",\"type\":\"tlyo\"},{\"properties\":{\"description\":\"rrouuxvnsasbcry\",\"configs\":{},\"annotations\":[],\"notes\":\"izrxklob\",\"createdBy\":\"nazpmk\",\"created\":\"2021-01-20T07:51:57Z\",\"configMergeRule\":{}},\"etag\":\"vfxzopjh\",\"id\":\"zxlioh\",\"name\":\"d\",\"type\":\"dtfgxqbawpcbb\"}],\"nextLink\":\"qcy\"}")
                .toObject(SparkConfigurationListResponse.class);
        Assertions.assertEquals("fdlpukhpyr", model.value().get(0).description());
        Assertions.assertEquals("zjcpeogk", model.value().get(0).notes());
        Assertions.assertEquals("mgbro", model.value().get(0).createdBy());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-26T06:11:35Z"), model.value().get(0).created());
        Assertions.assertEquals("qcy", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SparkConfigurationListResponse model =
            new SparkConfigurationListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new SparkConfigurationResourceInner()
                                .withDescription("fdlpukhpyr")
                                .withConfigs(mapOf())
                                .withAnnotations(Arrays.asList())
                                .withNotes("zjcpeogk")
                                .withCreatedBy("mgbro")
                                .withCreated(OffsetDateTime.parse("2021-10-26T06:11:35Z"))
                                .withConfigMergeRule(mapOf()),
                            new SparkConfigurationResourceInner()
                                .withDescription("ljyoogwx")
                                .withConfigs(mapOf())
                                .withAnnotations(Arrays.asList())
                                .withNotes("duugwbsre")
                                .withCreatedBy("fqkfuarenl")
                                .withCreated(OffsetDateTime.parse("2021-11-15T21:51:51Z"))
                                .withConfigMergeRule(mapOf()),
                            new SparkConfigurationResourceInner()
                                .withDescription("ngnbdxxew")
                                .withConfigs(mapOf())
                                .withAnnotations(Arrays.asList())
                                .withNotes("nvudbchaqdtvqecr")
                                .withCreatedBy("tmxxdtddmflhuy")
                                .withCreated(OffsetDateTime.parse("2021-10-16T00:35:13Z"))
                                .withConfigMergeRule(mapOf()),
                            new SparkConfigurationResourceInner()
                                .withDescription("rrouuxvnsasbcry")
                                .withConfigs(mapOf())
                                .withAnnotations(Arrays.asList())
                                .withNotes("izrxklob")
                                .withCreatedBy("nazpmk")
                                .withCreated(OffsetDateTime.parse("2021-01-20T07:51:57Z"))
                                .withConfigMergeRule(mapOf())))
                .withNextLink("qcy");
        model = BinaryData.fromObject(model).toObject(SparkConfigurationListResponse.class);
        Assertions.assertEquals("fdlpukhpyr", model.value().get(0).description());
        Assertions.assertEquals("zjcpeogk", model.value().get(0).notes());
        Assertions.assertEquals("mgbro", model.value().get(0).createdBy());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-26T06:11:35Z"), model.value().get(0).created());
        Assertions.assertEquals("qcy", model.nextLink());
    }

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