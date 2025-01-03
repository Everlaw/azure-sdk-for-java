// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager;
import com.azure.resourcemanager.vmwarecloudsimple.models.DedicatedCloudService;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DedicatedCloudServicesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"gatewaySubnet\":\"denxau\",\"isAccountOnboarded\":\"onBoarding\",\"nodes\":577057261,\"serviceURL\":\"kifmjn\"},\"location\":\"awtqabpxuckpgg\",\"tags\":{\"lqqmpiz\":\"eyirdhlisngw\"},\"id\":\"uwnpqxpxiwfcng\",\"name\":\"saasiixtmkzj\",\"type\":\"kv\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        VMwareCloudSimpleManager manager = VMwareCloudSimpleManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DedicatedCloudService response = manager.dedicatedCloudServices()
            .getByResourceGroupWithResponse("jkwrusnkq", "hsyrqunj", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("awtqabpxuckpgg", response.location());
        Assertions.assertEquals("eyirdhlisngw", response.tags().get("lqqmpiz"));
        Assertions.assertEquals("denxau", response.gatewaySubnet());
    }
}
