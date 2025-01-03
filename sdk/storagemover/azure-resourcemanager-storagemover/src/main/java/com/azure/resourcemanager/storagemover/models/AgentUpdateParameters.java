// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storagemover.fluent.models.AgentUpdateProperties;
import java.io.IOException;

/**
 * The Agent resource.
 */
@Fluent
public final class AgentUpdateParameters implements JsonSerializable<AgentUpdateParameters> {
    /*
     * The properties property.
     */
    private AgentUpdateProperties innerProperties;

    /**
     * Creates an instance of AgentUpdateParameters class.
     */
    public AgentUpdateParameters() {
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private AgentUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: A description for the Agent.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description for the Agent.
     * 
     * @param description the description value to set.
     * @return the AgentUpdateParameters object itself.
     */
    public AgentUpdateParameters withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentUpdateProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the uploadLimitSchedule property: The WAN-link upload limit schedule that applies to any Job Run the agent
     * executes. Data plane operations (migrating files) are affected. Control plane operations ensure seamless
     * migration functionality and are not limited by this schedule. The schedule is interpreted with the agent's local
     * time.
     * 
     * @return the uploadLimitSchedule value.
     */
    public UploadLimitSchedule uploadLimitSchedule() {
        return this.innerProperties() == null ? null : this.innerProperties().uploadLimitSchedule();
    }

    /**
     * Set the uploadLimitSchedule property: The WAN-link upload limit schedule that applies to any Job Run the agent
     * executes. Data plane operations (migrating files) are affected. Control plane operations ensure seamless
     * migration functionality and are not limited by this schedule. The schedule is interpreted with the agent's local
     * time.
     * 
     * @param uploadLimitSchedule the uploadLimitSchedule value to set.
     * @return the AgentUpdateParameters object itself.
     */
    public AgentUpdateParameters withUploadLimitSchedule(UploadLimitSchedule uploadLimitSchedule) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentUpdateProperties();
        }
        this.innerProperties().withUploadLimitSchedule(uploadLimitSchedule);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AgentUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AgentUpdateParameters if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AgentUpdateParameters.
     */
    public static AgentUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AgentUpdateParameters deserializedAgentUpdateParameters = new AgentUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedAgentUpdateParameters.innerProperties = AgentUpdateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAgentUpdateParameters;
        });
    }
}
