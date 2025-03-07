// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.RestoreStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupsGetVolumeLatestRestoreStatusWithResponseMockTests {
    @Test
    public void testGetVolumeLatestRestoreStatusWithResponse() throws Exception {
        String responseStr
            = "{\"healthy\":true,\"relationshipStatus\":\"Unknown\",\"mirrorState\":\"Broken\",\"unhealthyReason\":\"lvhbwrnf\",\"errorMessage\":\"gddpq\",\"totalTransferBytes\":5655380419005649480}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        RestoreStatus response = manager.backups()
            .getVolumeLatestRestoreStatusWithResponse("jcazt", "wsnsqowx", "comlikytwvczc", "wka",
                com.azure.core.util.Context.NONE)
            .getValue();

    }
}
