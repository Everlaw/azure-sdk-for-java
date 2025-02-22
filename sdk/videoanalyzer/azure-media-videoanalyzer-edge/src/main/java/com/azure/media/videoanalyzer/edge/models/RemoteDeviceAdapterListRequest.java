// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * List all existing remote device adapters.
 */
@Fluent
public final class RemoteDeviceAdapterListRequest extends MethodRequest {

    /*
     * method name
     */
    private String methodName;

    /**
     * Creates an instance of RemoteDeviceAdapterListRequest class.
     */
    public RemoteDeviceAdapterListRequest() {
    }

    /**
     * Get the methodName property: method name.
     *
     * @return the methodName value.
     */
    public String getMethodName() {
        return this.methodName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@apiVersion", getApiVersion());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RemoteDeviceAdapterListRequest from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RemoteDeviceAdapterListRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RemoteDeviceAdapterListRequest.
     */
    public static RemoteDeviceAdapterListRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RemoteDeviceAdapterListRequest deserializedRemoteDeviceAdapterListRequest
                = new RemoteDeviceAdapterListRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("@apiVersion".equals(fieldName)) {
                    deserializedRemoteDeviceAdapterListRequest.setApiVersion(reader.getString());
                } else if ("methodName".equals(fieldName)) {
                    deserializedRemoteDeviceAdapterListRequest.methodName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRemoteDeviceAdapterListRequest;
        });
    }
}
