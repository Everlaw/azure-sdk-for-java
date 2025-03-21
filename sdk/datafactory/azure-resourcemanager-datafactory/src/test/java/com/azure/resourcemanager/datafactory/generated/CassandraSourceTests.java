// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CassandraSource;
import com.azure.resourcemanager.datafactory.models.CassandraSourceReadConsistencyLevels;
import org.junit.jupiter.api.Assertions;

public final class CassandraSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CassandraSource model = BinaryData.fromString(
            "{\"type\":\"CassandraSource\",\"query\":\"dataaomy\",\"consistencyLevel\":\"EACH_QUORUM\",\"queryTimeout\":\"datawdjbyaav\",\"additionalColumns\":\"datasxamncuhxznmak\",\"sourceRetryCount\":\"datahuetztorhue\",\"sourceRetryWait\":\"datayssz\",\"maxConcurrentConnections\":\"dataewjqgzloorh\",\"disableMetricsCollection\":\"dataur\",\"\":{\"nmhvwgchgpbdkqw\":\"datajqpyxiaakgdk\"}}")
            .toObject(CassandraSource.class);
        Assertions.assertEquals(CassandraSourceReadConsistencyLevels.EACH_QUORUM, model.consistencyLevel());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CassandraSource model = new CassandraSource().withSourceRetryCount("datahuetztorhue")
            .withSourceRetryWait("datayssz")
            .withMaxConcurrentConnections("dataewjqgzloorh")
            .withDisableMetricsCollection("dataur")
            .withQueryTimeout("datawdjbyaav")
            .withAdditionalColumns("datasxamncuhxznmak")
            .withQuery("dataaomy")
            .withConsistencyLevel(CassandraSourceReadConsistencyLevels.EACH_QUORUM);
        model = BinaryData.fromObject(model).toObject(CassandraSource.class);
        Assertions.assertEquals(CassandraSourceReadConsistencyLevels.EACH_QUORUM, model.consistencyLevel());
    }
}
