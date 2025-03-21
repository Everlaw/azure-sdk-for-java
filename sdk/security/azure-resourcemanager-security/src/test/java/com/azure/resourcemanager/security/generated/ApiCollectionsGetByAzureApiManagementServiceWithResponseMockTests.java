// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.ApiCollection;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApiCollectionsGetByAzureApiManagementServiceWithResponseMockTests {
    @Test
    public void testGetByAzureApiManagementServiceWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Failed\",\"displayName\":\"ljtzx\",\"discoveredVia\":\"xsdobygoogxqapjx\",\"baseUrl\":\"zyjfuc\",\"numberOfApiEndpoints\":6458197894744757592,\"numberOfInactiveApiEndpoints\":7016588385682666603,\"numberOfUnauthenticatedApiEndpoints\":2106569430229843454,\"numberOfExternalApiEndpoints\":2270951030891698165,\"numberOfApiEndpointsWithSensitiveDataExposed\":2977721245192896961,\"sensitivityLabel\":\"matrnzpducd\"},\"id\":\"akt\",\"name\":\"jktzboimyfpq\",\"type\":\"owkppnwyytf\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ApiCollection response = manager.apiCollections()
            .getByAzureApiManagementServiceWithResponse("dcvxodkrvfsxxby", "e", "qlvge",
                com.azure.core.util.Context.NONE)
            .getValue();

    }
}
