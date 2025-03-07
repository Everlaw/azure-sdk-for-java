// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.logic.fluent.WorkflowTriggerHistoriesClient;
import com.azure.resourcemanager.logic.fluent.models.WorkflowTriggerHistoryInner;
import com.azure.resourcemanager.logic.models.WorkflowTriggerHistoryListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in WorkflowTriggerHistoriesClient.
 */
public final class WorkflowTriggerHistoriesClientImpl implements WorkflowTriggerHistoriesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final WorkflowTriggerHistoriesService service;

    /**
     * The service client containing this operation class.
     */
    private final LogicManagementClientImpl client;

    /**
     * Initializes an instance of WorkflowTriggerHistoriesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    WorkflowTriggerHistoriesClientImpl(LogicManagementClientImpl client) {
        this.service = RestProxy.create(WorkflowTriggerHistoriesService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for LogicManagementClientWorkflowTriggerHistories to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "LogicManagementClien")
    public interface WorkflowTriggerHistoriesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/triggers/{triggerName}/histories")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<WorkflowTriggerHistoryListResult>> list(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("workflowName") String workflowName,
            @PathParam("triggerName") String triggerName, @QueryParam("api-version") String apiVersion,
            @QueryParam("$top") Integer top, @QueryParam("$filter") String filter, @HeaderParam("Accept") String accept,
            Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/triggers/{triggerName}/histories/{historyName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<WorkflowTriggerHistoryInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("workflowName") String workflowName,
            @PathParam("triggerName") String triggerName, @PathParam("historyName") String historyName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/triggers/{triggerName}/histories/{historyName}/resubmit")
        @ExpectedResponses({ 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> resubmit(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("workflowName") String workflowName,
            @PathParam("triggerName") String triggerName, @PathParam("historyName") String historyName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<WorkflowTriggerHistoryListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets a list of workflow trigger histories.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: Status, StartTime, and
     * ClientTrackingId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow trigger histories along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkflowTriggerHistoryInner>> listSinglePageAsync(String resourceGroupName,
        String workflowName, String triggerName, Integer top, String filter) {
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
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (triggerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter triggerName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.list(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
                    workflowName, triggerName, this.client.getApiVersion(), top, filter, accept, context))
            .<PagedResponse<WorkflowTriggerHistoryInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of workflow trigger histories.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: Status, StartTime, and
     * ClientTrackingId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow trigger histories along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkflowTriggerHistoryInner>> listSinglePageAsync(String resourceGroupName,
        String workflowName, String triggerName, Integer top, String filter, Context context) {
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
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (triggerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter triggerName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, workflowName,
                triggerName, this.client.getApiVersion(), top, filter, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Gets a list of workflow trigger histories.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: Status, StartTime, and
     * ClientTrackingId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow trigger histories as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<WorkflowTriggerHistoryInner> listAsync(String resourceGroupName, String workflowName,
        String triggerName, Integer top, String filter) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, workflowName, triggerName, top, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of workflow trigger histories.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow trigger histories as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<WorkflowTriggerHistoryInner> listAsync(String resourceGroupName, String workflowName,
        String triggerName) {
        final Integer top = null;
        final String filter = null;
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, workflowName, triggerName, top, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of workflow trigger histories.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: Status, StartTime, and
     * ClientTrackingId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow trigger histories as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<WorkflowTriggerHistoryInner> listAsync(String resourceGroupName, String workflowName,
        String triggerName, Integer top, String filter, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, workflowName, triggerName, top, filter, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of workflow trigger histories.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow trigger histories as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WorkflowTriggerHistoryInner> list(String resourceGroupName, String workflowName,
        String triggerName) {
        final Integer top = null;
        final String filter = null;
        return new PagedIterable<>(listAsync(resourceGroupName, workflowName, triggerName, top, filter));
    }

    /**
     * Gets a list of workflow trigger histories.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: Status, StartTime, and
     * ClientTrackingId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workflow trigger histories as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WorkflowTriggerHistoryInner> list(String resourceGroupName, String workflowName,
        String triggerName, Integer top, String filter, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, workflowName, triggerName, top, filter, context));
    }

    /**
     * Gets a workflow trigger history.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     * run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow trigger history along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<WorkflowTriggerHistoryInner>> getWithResponseAsync(String resourceGroupName,
        String workflowName, String triggerName, String historyName) {
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
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (triggerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter triggerName is required and cannot be null."));
        }
        if (historyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter historyName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
                    workflowName, triggerName, historyName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a workflow trigger history.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     * run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow trigger history along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<WorkflowTriggerHistoryInner>> getWithResponseAsync(String resourceGroupName,
        String workflowName, String triggerName, String historyName, Context context) {
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
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (triggerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter triggerName is required and cannot be null."));
        }
        if (historyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter historyName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, workflowName,
            triggerName, historyName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Gets a workflow trigger history.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     * run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow trigger history on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<WorkflowTriggerHistoryInner> getAsync(String resourceGroupName, String workflowName,
        String triggerName, String historyName) {
        return getWithResponseAsync(resourceGroupName, workflowName, triggerName, historyName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a workflow trigger history.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     * run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow trigger history along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<WorkflowTriggerHistoryInner> getWithResponse(String resourceGroupName, String workflowName,
        String triggerName, String historyName, Context context) {
        return getWithResponseAsync(resourceGroupName, workflowName, triggerName, historyName, context).block();
    }

    /**
     * Gets a workflow trigger history.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     * run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workflow trigger history.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkflowTriggerHistoryInner get(String resourceGroupName, String workflowName, String triggerName,
        String historyName) {
        return getWithResponse(resourceGroupName, workflowName, triggerName, historyName, Context.NONE).getValue();
    }

    /**
     * Resubmits a workflow run based on the trigger history.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     * run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> resubmitWithResponseAsync(String resourceGroupName, String workflowName,
        String triggerName, String historyName) {
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
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (triggerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter triggerName is required and cannot be null."));
        }
        if (historyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter historyName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.resubmit(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, workflowName, triggerName, historyName, this.client.getApiVersion(), accept,
                context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Resubmits a workflow run based on the trigger history.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     * run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> resubmitWithResponseAsync(String resourceGroupName, String workflowName,
        String triggerName, String historyName, Context context) {
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
        if (workflowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workflowName is required and cannot be null."));
        }
        if (triggerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter triggerName is required and cannot be null."));
        }
        if (historyName == null) {
            return Mono.error(new IllegalArgumentException("Parameter historyName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.resubmit(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            workflowName, triggerName, historyName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Resubmits a workflow run based on the trigger history.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     * run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> resubmitAsync(String resourceGroupName, String workflowName, String triggerName,
        String historyName) {
        return resubmitWithResponseAsync(resourceGroupName, workflowName, triggerName, historyName)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Resubmits a workflow run based on the trigger history.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     * run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> resubmitWithResponse(String resourceGroupName, String workflowName, String triggerName,
        String historyName, Context context) {
        return resubmitWithResponseAsync(resourceGroupName, workflowName, triggerName, historyName, context).block();
    }

    /**
     * Resubmits a workflow run based on the trigger history.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a
     * run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void resubmit(String resourceGroupName, String workflowName, String triggerName, String historyName) {
        resubmitWithResponse(resourceGroupName, workflowName, triggerName, historyName, Context.NONE);
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workflow trigger histories along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkflowTriggerHistoryInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<WorkflowTriggerHistoryInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
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
     * @return the list of workflow trigger histories along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<WorkflowTriggerHistoryInner>> listNextSinglePageAsync(String nextLink, Context context) {
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
