// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Data POST-ed to the nameAvailability action.
 */
@Fluent
public final class NameAvailabilityParameters implements JsonSerializable<NameAvailabilityParameters> {
    /*
     * The resource type. Can be "Microsoft.SignalRService/SignalR" or "Microsoft.SignalRService/webPubSub"
     */
    private String type;

    /*
     * The resource name to validate. e.g."my-resource-name"
     */
    private String name;

    /**
     * Creates an instance of NameAvailabilityParameters class.
     */
    public NameAvailabilityParameters() {
    }

    /**
     * Get the type property: The resource type. Can be "Microsoft.SignalRService/SignalR" or
     * "Microsoft.SignalRService/webPubSub".
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type. Can be "Microsoft.SignalRService/SignalR" or
     * "Microsoft.SignalRService/webPubSub".
     * 
     * @param type the type value to set.
     * @return the NameAvailabilityParameters object itself.
     */
    public NameAvailabilityParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The resource name to validate. e.g."my-resource-name".
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The resource name to validate. e.g."my-resource-name".
     * 
     * @param name the name value to set.
     * @return the NameAvailabilityParameters object itself.
     */
    public NameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property type in model NameAvailabilityParameters"));
        }
        if (name() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property name in model NameAvailabilityParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NameAvailabilityParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NameAvailabilityParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NameAvailabilityParameters if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NameAvailabilityParameters.
     */
    public static NameAvailabilityParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NameAvailabilityParameters deserializedNameAvailabilityParameters = new NameAvailabilityParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedNameAvailabilityParameters.type = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedNameAvailabilityParameters.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNameAvailabilityParameters;
        });
    }
}
