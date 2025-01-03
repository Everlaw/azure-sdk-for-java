// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.ApiCollection;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApiCollectionsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"displayName\":\"xapeqiscrpi\",\"discoveredVia\":\"ftr\",\"baseUrl\":\"ejdaahuqimld\",\"numberOfApiEndpoints\":5717922508892024559,\"numberOfInactiveApiEndpoints\":8586070490644256683,\"numberOfUnauthenticatedApiEndpoints\":5811937101736568092,\"numberOfExternalApiEndpoints\":7269381240300955404,\"numberOfApiEndpointsWithSensitiveDataExposed\":1360712294441035838,\"sensitivityLabel\":\"snc\"},\"id\":\"kiioshj\",\"name\":\"cz\",\"type\":\"tybnxgztlcgctj\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ApiCollection> response = manager.apiCollections().list(com.azure.core.util.Context.NONE);

    }
}
