// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.quantum.jobs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;

/** Job details. */
@Fluent
public final class JobDetails implements JsonSerializable<JobDetails> {
    /*
     * The job id.
     */
    private String id;

    /*
     * The job name. Is not required for the name to be unique and it's only
     * used for display purposes.
     */
    private String name;

    /*
     * The blob container SAS uri, the container is used to host job data.
     */
    private String containerUri;

    /*
     * The input blob SAS uri, if specified, it will override the default input
     * blob in the container.
     */
    private String inputDataUri;

    /*
     * The format of the input data.
     */
    private String inputDataFormat;

    /*
     * The input parameters for the job. JSON object used by the target solver.
     * It is expected that the size of this object is small and only used to
     * specify parameters for the execution target, not the input data.
     */
    private Object inputParams;

    /*
     * The unique identifier for the provider.
     */
    private String providerId;

    /*
     * The target identifier to run the job.
     */
    private String target;

    /*
     * The job metadata. Metadata provides client the ability to store
     * client-specific information
     */
    private Map<String, String> metadata;

    /*
     * The output blob SAS uri. When a job finishes successfully, results will
     * be uploaded to this blob.
     */
    private String outputDataUri;

    /*
     * The format of the output data.
     */
    private String outputDataFormat;

    /*
     * The job status.
     */
    private JobStatus status;

    /*
     * The creation time of the job.
     */
    private OffsetDateTime creationTime;

    /*
     * The time when the job began execution.
     */
    private OffsetDateTime beginExecutionTime;

    /*
     * The time when the job finished execution.
     */
    private OffsetDateTime endExecutionTime;

    /*
     * The time when a job was successfully cancelled.
     */
    private OffsetDateTime cancellationTime;

    /*
     * The error data for the job. This is expected only when Status 'Failed'.
     */
    private ErrorData errorData;

    /**
     * Creates an instance of {@link JobDetails}.
     */
    public JobDetails() {
    }

    /**
     * Get the id property: The job id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The job id.
     *
     * @param id the id value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The job name. Is not required for the name to be unique and it's only used for display
     * purposes.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The job name. Is not required for the name to be unique and it's only used for display
     * purposes.
     *
     * @param name the name value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the containerUri property: The blob container SAS uri, the container is used to host job data.
     *
     * @return the containerUri value.
     */
    public String getContainerUri() {
        return this.containerUri;
    }

    /**
     * Set the containerUri property: The blob container SAS uri, the container is used to host job data.
     *
     * @param containerUri the containerUri value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setContainerUri(String containerUri) {
        this.containerUri = containerUri;
        return this;
    }

    /**
     * Get the inputDataUri property: The input blob SAS uri, if specified, it will override the default input blob in
     * the container.
     *
     * @return the inputDataUri value.
     */
    public String getInputDataUri() {
        return this.inputDataUri;
    }

    /**
     * Set the inputDataUri property: The input blob SAS uri, if specified, it will override the default input blob in
     * the container.
     *
     * @param inputDataUri the inputDataUri value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setInputDataUri(String inputDataUri) {
        this.inputDataUri = inputDataUri;
        return this;
    }

    /**
     * Get the inputDataFormat property: The format of the input data.
     *
     * @return the inputDataFormat value.
     */
    public String getInputDataFormat() {
        return this.inputDataFormat;
    }

    /**
     * Set the inputDataFormat property: The format of the input data.
     *
     * @param inputDataFormat the inputDataFormat value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setInputDataFormat(String inputDataFormat) {
        this.inputDataFormat = inputDataFormat;
        return this;
    }

    /**
     * Get the inputParams property: The input parameters for the job. JSON object used by the target solver. It is
     * expected that the size of this object is small and only used to specify parameters for the execution target, not
     * the input data.
     *
     * @return the inputParams value.
     */
    public Object getInputParams() {
        return this.inputParams;
    }

    /**
     * Set the inputParams property: The input parameters for the job. JSON object used by the target solver. It is
     * expected that the size of this object is small and only used to specify parameters for the execution target, not
     * the input data.
     *
     * @param inputParams the inputParams value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setInputParams(Object inputParams) {
        this.inputParams = inputParams;
        return this;
    }

    /**
     * Get the providerId property: The unique identifier for the provider.
     *
     * @return the providerId value.
     */
    public String getProviderId() {
        return this.providerId;
    }

    /**
     * Set the providerId property: The unique identifier for the provider.
     *
     * @param providerId the providerId value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * Get the target property: The target identifier to run the job.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: The target identifier to run the job.
     *
     * @param target the target value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the metadata property: The job metadata. Metadata provides client the ability to store client-specific
     * information.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The job metadata. Metadata provides client the ability to store client-specific
     * information.
     *
     * @param metadata the metadata value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the outputDataUri property: The output blob SAS uri. When a job finishes successfully, results will be
     * uploaded to this blob.
     *
     * @return the outputDataUri value.
     */
    public String getOutputDataUri() {
        return this.outputDataUri;
    }

    /**
     * Set the outputDataUri property: The output blob SAS uri. When a job finishes successfully, results will be
     * uploaded to this blob.
     *
     * @param outputDataUri the outputDataUri value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setOutputDataUri(String outputDataUri) {
        this.outputDataUri = outputDataUri;
        return this;
    }

    /**
     * Get the outputDataFormat property: The format of the output data.
     *
     * @return the outputDataFormat value.
     */
    public String getOutputDataFormat() {
        return this.outputDataFormat;
    }

    /**
     * Set the outputDataFormat property: The format of the output data.
     *
     * @param outputDataFormat the outputDataFormat value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setOutputDataFormat(String outputDataFormat) {
        this.outputDataFormat = outputDataFormat;
        return this;
    }

    /**
     * Get the status property: The job status.
     *
     * @return the status value.
     */
    public JobStatus getStatus() {
        return this.status;
    }

    /**
     * Get the creationTime property: The creation time of the job.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /**
     * Get the beginExecutionTime property: The time when the job began execution.
     *
     * @return the beginExecutionTime value.
     */
    public OffsetDateTime getBeginExecutionTime() {
        return this.beginExecutionTime;
    }

    /**
     * Get the endExecutionTime property: The time when the job finished execution.
     *
     * @return the endExecutionTime value.
     */
    public OffsetDateTime getEndExecutionTime() {
        return this.endExecutionTime;
    }

    /**
     * Get the cancellationTime property: The time when a job was successfully cancelled.
     *
     * @return the cancellationTime value.
     */
    public OffsetDateTime getCancellationTime() {
        return this.cancellationTime;
    }

    /**
     * Get the errorData property: The error data for the job. This is expected only when Status 'Failed'.
     *
     * @return the errorData value.
     */
    public ErrorData getErrorData() {
        return this.errorData;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        return jsonWriter.writeStartObject()
            .writeStringField("id", id)
            .writeStringField("name", name)
            .writeStringField("containerUri", containerUri)
            .writeStringField("inputDataUri", inputDataUri)
            .writeStringField("inputDataFormat", inputDataFormat)
            .writeUntypedField("inputParams", inputParams)
            .writeStringField("providerId", providerId)
            .writeStringField("target", target)
            .writeMapField("metadata", metadata, JsonWriter::writeString)
            .writeStringField("outputDataUri", outputDataUri)
            .writeStringField("outputDataFormat", outputDataFormat)
            .writeStringField("status", Objects.toString(status, null))
            .writeEndObject();
    }

    /**
     * Deserializes an instance of {@link JobDetails} from the passed {@link JsonReader}.
     *
     * @param jsonReader The {@link JsonReader} to read.
     * @return An instance of {@link JobDetails}, or null if {@link JsonReader} was pointing {@link JsonToken#NULL}.
     * @throws IOException If an error occurs while reading the {@link JsonReader}.
     */
    public static JobDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobDetails jobDetails = new JobDetails();

            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    jobDetails.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    jobDetails.name = reader.getString();
                } else if ("containerUri".equals(fieldName)) {
                    jobDetails.containerUri = reader.getString();
                } else if ("inputDataUri".equals(fieldName)) {
                    jobDetails.inputDataUri = reader.getString();
                } else if ("inputDataFormat".equals(fieldName)) {
                    jobDetails.inputDataFormat = reader.getString();
                } else if ("inputParams".equals(fieldName)) {
                    jobDetails.inputParams = reader.readUntyped();
                } else if ("providerId".equals(fieldName)) {
                    jobDetails.providerId = reader.getString();
                } else if ("target".equals(fieldName)) {
                    jobDetails.target = reader.getString();
                } else if ("metadata".equals(fieldName)) {
                    jobDetails.metadata = reader.readMap(JsonReader::getString);
                } else if ("outputDataUri".equals(fieldName)) {
                    jobDetails.outputDataUri = reader.getString();
                } else if ("outputDataFormat".equals(fieldName)) {
                    jobDetails.outputDataFormat = reader.getString();
                } else if ("status".equals(fieldName)) {
                    jobDetails.status = JobStatus.fromString(reader.getString());
                } else if ("creationTime".equals(fieldName)) {
                    jobDetails.creationTime = CoreUtils.parseBestOffsetDateTime(reader.getString());
                } else if ("beginExecutionTime".equals(fieldName)) {
                    jobDetails.beginExecutionTime = CoreUtils.parseBestOffsetDateTime(reader.getString());
                } else if ("endExecutionTime".equals(fieldName)) {
                    jobDetails.endExecutionTime = CoreUtils.parseBestOffsetDateTime(reader.getString());
                } else if ("cancellationTime".equals(fieldName)) {
                    jobDetails.cancellationTime = CoreUtils.parseBestOffsetDateTime(reader.getString());
                } else if ("errorData".equals(fieldName)) {
                    jobDetails.errorData = ErrorData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return jobDetails;
        });
    }
}
