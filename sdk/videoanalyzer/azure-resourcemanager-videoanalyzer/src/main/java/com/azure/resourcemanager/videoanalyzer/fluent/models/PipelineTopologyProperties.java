// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.videoanalyzer.models.ParameterDeclaration;
import com.azure.resourcemanager.videoanalyzer.models.ProcessorNodeBase;
import com.azure.resourcemanager.videoanalyzer.models.SinkNodeBase;
import com.azure.resourcemanager.videoanalyzer.models.SourceNodeBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the properties of a pipeline topology. */
@Fluent
public final class PipelineTopologyProperties {
    /*
     * An optional description of the pipeline topology. It is recommended that
     * the expected use of the topology to be described here.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * List of the topology parameter declarations. Parameters declared here
     * can be referenced throughout the topology nodes through the use of
     * "${PARAMETER_NAME}" string pattern. Parameters can have optional default
     * values and can later be defined in individual instances of the pipeline.
     */
    @JsonProperty(value = "parameters")
    private List<ParameterDeclaration> parameters;

    /*
     * List of the topology source nodes. Source nodes enable external data to
     * be ingested by the pipeline.
     */
    @JsonProperty(value = "sources", required = true)
    private List<SourceNodeBase> sources;

    /*
     * List of the topology processor nodes. Processor nodes enable pipeline
     * data to be analyzed, processed or transformed.
     */
    @JsonProperty(value = "processors")
    private List<ProcessorNodeBase> processors;

    /*
     * List of the topology sink nodes. Sink nodes allow pipeline data to be
     * stored or exported.
     */
    @JsonProperty(value = "sinks", required = true)
    private List<SinkNodeBase> sinks;

    /**
     * Get the description property: An optional description of the pipeline topology. It is recommended that the
     * expected use of the topology to be described here.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: An optional description of the pipeline topology. It is recommended that the
     * expected use of the topology to be described here.
     *
     * @param description the description value to set.
     * @return the PipelineTopologyProperties object itself.
     */
    public PipelineTopologyProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the parameters property: List of the topology parameter declarations. Parameters declared here can be
     * referenced throughout the topology nodes through the use of "${PARAMETER_NAME}" string pattern. Parameters can
     * have optional default values and can later be defined in individual instances of the pipeline.
     *
     * @return the parameters value.
     */
    public List<ParameterDeclaration> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: List of the topology parameter declarations. Parameters declared here can be
     * referenced throughout the topology nodes through the use of "${PARAMETER_NAME}" string pattern. Parameters can
     * have optional default values and can later be defined in individual instances of the pipeline.
     *
     * @param parameters the parameters value to set.
     * @return the PipelineTopologyProperties object itself.
     */
    public PipelineTopologyProperties withParameters(List<ParameterDeclaration> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the sources property: List of the topology source nodes. Source nodes enable external data to be ingested by
     * the pipeline.
     *
     * @return the sources value.
     */
    public List<SourceNodeBase> sources() {
        return this.sources;
    }

    /**
     * Set the sources property: List of the topology source nodes. Source nodes enable external data to be ingested by
     * the pipeline.
     *
     * @param sources the sources value to set.
     * @return the PipelineTopologyProperties object itself.
     */
    public PipelineTopologyProperties withSources(List<SourceNodeBase> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * Get the processors property: List of the topology processor nodes. Processor nodes enable pipeline data to be
     * analyzed, processed or transformed.
     *
     * @return the processors value.
     */
    public List<ProcessorNodeBase> processors() {
        return this.processors;
    }

    /**
     * Set the processors property: List of the topology processor nodes. Processor nodes enable pipeline data to be
     * analyzed, processed or transformed.
     *
     * @param processors the processors value to set.
     * @return the PipelineTopologyProperties object itself.
     */
    public PipelineTopologyProperties withProcessors(List<ProcessorNodeBase> processors) {
        this.processors = processors;
        return this;
    }

    /**
     * Get the sinks property: List of the topology sink nodes. Sink nodes allow pipeline data to be stored or exported.
     *
     * @return the sinks value.
     */
    public List<SinkNodeBase> sinks() {
        return this.sinks;
    }

    /**
     * Set the sinks property: List of the topology sink nodes. Sink nodes allow pipeline data to be stored or exported.
     *
     * @param sinks the sinks value to set.
     * @return the PipelineTopologyProperties object itself.
     */
    public PipelineTopologyProperties withSinks(List<SinkNodeBase> sinks) {
        this.sinks = sinks;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameters() != null) {
            parameters().forEach(e -> e.validate());
        }
        if (sources() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property sources in model PipelineTopologyProperties"));
        } else {
            sources().forEach(e -> e.validate());
        }
        if (processors() != null) {
            processors().forEach(e -> e.validate());
        }
        if (sinks() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property sinks in model PipelineTopologyProperties"));
        } else {
            sinks().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PipelineTopologyProperties.class);
}
