// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elastic.fluent.OrganizationsClient;
import com.azure.resourcemanager.elastic.fluent.models.ElasticOrganizationToAzureSubscriptionMappingResponseInner;
import com.azure.resourcemanager.elastic.fluent.models.UserApiKeyResponseInner;
import com.azure.resourcemanager.elastic.models.ElasticOrganizationToAzureSubscriptionMappingResponse;
import com.azure.resourcemanager.elastic.models.Organizations;
import com.azure.resourcemanager.elastic.models.UserApiKeyResponse;
import com.azure.resourcemanager.elastic.models.UserEmailId;

public final class OrganizationsImpl implements Organizations {
    private static final ClientLogger LOGGER = new ClientLogger(OrganizationsImpl.class);

    private final OrganizationsClient innerClient;

    private final com.azure.resourcemanager.elastic.ElasticManager serviceManager;

    public OrganizationsImpl(OrganizationsClient innerClient,
        com.azure.resourcemanager.elastic.ElasticManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<UserApiKeyResponse> getApiKeyWithResponse(UserEmailId body, Context context) {
        Response<UserApiKeyResponseInner> inner = this.serviceClient().getApiKeyWithResponse(body, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new UserApiKeyResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public UserApiKeyResponse getApiKey() {
        UserApiKeyResponseInner inner = this.serviceClient().getApiKey();
        if (inner != null) {
            return new UserApiKeyResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ElasticOrganizationToAzureSubscriptionMappingResponse>
        getElasticToAzureSubscriptionMappingWithResponse(Context context) {
        Response<ElasticOrganizationToAzureSubscriptionMappingResponseInner> inner
            = this.serviceClient().getElasticToAzureSubscriptionMappingWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ElasticOrganizationToAzureSubscriptionMappingResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ElasticOrganizationToAzureSubscriptionMappingResponse getElasticToAzureSubscriptionMapping() {
        ElasticOrganizationToAzureSubscriptionMappingResponseInner inner
            = this.serviceClient().getElasticToAzureSubscriptionMapping();
        if (inner != null) {
            return new ElasticOrganizationToAzureSubscriptionMappingResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private OrganizationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.elastic.ElasticManager manager() {
        return this.serviceManager;
    }
}
