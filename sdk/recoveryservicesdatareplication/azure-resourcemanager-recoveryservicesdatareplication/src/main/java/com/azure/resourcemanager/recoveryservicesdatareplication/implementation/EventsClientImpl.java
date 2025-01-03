// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.EventsClient;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.EventModelInner;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.EventModelCollection;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in EventsClient.
 */
public final class EventsClientImpl implements EventsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final EventsService service;

    /**
     * The service client containing this operation class.
     */
    private final DataReplicationMgmtClientImpl client;

    /**
     * Initializes an instance of EventsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    EventsClientImpl(DataReplicationMgmtClientImpl client) {
        this.service = RestProxy.create(EventsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataReplicationMgmtClientEvents to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataReplicationMgmtC")
    public interface EventsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataReplication/replicationVaults/{vaultName}/events/{eventName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EventModelInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vaultName") String vaultName,
            @PathParam("eventName") String eventName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataReplication/replicationVaults/{vaultName}/events")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EventModelCollection>> list(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vaultName") String vaultName,
            @QueryParam("$filter") String filter, @QueryParam("continuationToken") String continuationToken,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EventModelCollection>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets the event.
     * 
     * Gets the details of the event.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param eventName The event name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the event along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<EventModelInner>> getWithResponseAsync(String resourceGroupName, String vaultName,
        String eventName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (eventName == null) {
            return Mono.error(new IllegalArgumentException("Parameter eventName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, vaultName, eventName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the event.
     * 
     * Gets the details of the event.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param eventName The event name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the event along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<EventModelInner>> getWithResponseAsync(String resourceGroupName, String vaultName,
        String eventName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (eventName == null) {
            return Mono.error(new IllegalArgumentException("Parameter eventName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, vaultName,
            eventName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Gets the event.
     * 
     * Gets the details of the event.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param eventName The event name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the event on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<EventModelInner> getAsync(String resourceGroupName, String vaultName, String eventName) {
        return getWithResponseAsync(resourceGroupName, vaultName, eventName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the event.
     * 
     * Gets the details of the event.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param eventName The event name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the event along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<EventModelInner> getWithResponse(String resourceGroupName, String vaultName, String eventName,
        Context context) {
        return getWithResponseAsync(resourceGroupName, vaultName, eventName, context).block();
    }

    /**
     * Gets the event.
     * 
     * Gets the details of the event.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param eventName The event name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the event.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EventModelInner get(String resourceGroupName, String vaultName, String eventName) {
        return getWithResponse(resourceGroupName, vaultName, eventName, Context.NONE).getValue();
    }

    /**
     * Lists the events.
     * 
     * Gets the list of events in the given vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param filter Filter string.
     * @param continuationToken Continuation token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of events in the given vault along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventModelInner>> listSinglePageAsync(String resourceGroupName, String vaultName,
        String filter, String continuationToken) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, vaultName, filter, continuationToken, this.client.getApiVersion(), accept, context))
            .<PagedResponse<EventModelInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists the events.
     * 
     * Gets the list of events in the given vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param filter Filter string.
     * @param continuationToken Continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of events in the given vault along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventModelInner>> listSinglePageAsync(String resourceGroupName, String vaultName,
        String filter, String continuationToken, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, vaultName, filter,
                continuationToken, this.client.getApiVersion(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Lists the events.
     * 
     * Gets the list of events in the given vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param filter Filter string.
     * @param continuationToken Continuation token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of events in the given vault as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventModelInner> listAsync(String resourceGroupName, String vaultName, String filter,
        String continuationToken) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, vaultName, filter, continuationToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the events.
     * 
     * Gets the list of events in the given vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of events in the given vault as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventModelInner> listAsync(String resourceGroupName, String vaultName) {
        final String filter = null;
        final String continuationToken = null;
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, vaultName, filter, continuationToken),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists the events.
     * 
     * Gets the list of events in the given vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param filter Filter string.
     * @param continuationToken Continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of events in the given vault as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<EventModelInner> listAsync(String resourceGroupName, String vaultName, String filter,
        String continuationToken, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, vaultName, filter, continuationToken, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists the events.
     * 
     * Gets the list of events in the given vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of events in the given vault as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventModelInner> list(String resourceGroupName, String vaultName) {
        final String filter = null;
        final String continuationToken = null;
        return new PagedIterable<>(listAsync(resourceGroupName, vaultName, filter, continuationToken));
    }

    /**
     * Lists the events.
     * 
     * Gets the list of events in the given vault.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param filter Filter string.
     * @param continuationToken Continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of events in the given vault as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventModelInner> list(String resourceGroupName, String vaultName, String filter,
        String continuationToken, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, vaultName, filter, continuationToken, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event model collection along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventModelInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<EventModelInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event model collection along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<EventModelInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
