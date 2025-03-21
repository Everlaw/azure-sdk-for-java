// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * An array of administrator user identities.
 */
@Fluent
public final class DedicatedCapacityAdministrators implements JsonSerializable<DedicatedCapacityAdministrators> {
    /*
     * An array of administrator user identities.
     */
    private List<String> members;

    /**
     * Creates an instance of DedicatedCapacityAdministrators class.
     */
    public DedicatedCapacityAdministrators() {
    }

    /**
     * Get the members property: An array of administrator user identities.
     * 
     * @return the members value.
     */
    public List<String> members() {
        return this.members;
    }

    /**
     * Set the members property: An array of administrator user identities.
     * 
     * @param members the members value to set.
     * @return the DedicatedCapacityAdministrators object itself.
     */
    public DedicatedCapacityAdministrators withMembers(List<String> members) {
        this.members = members;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("members", this.members, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DedicatedCapacityAdministrators from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DedicatedCapacityAdministrators if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DedicatedCapacityAdministrators.
     */
    public static DedicatedCapacityAdministrators fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DedicatedCapacityAdministrators deserializedDedicatedCapacityAdministrators
                = new DedicatedCapacityAdministrators();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("members".equals(fieldName)) {
                    List<String> members = reader.readArray(reader1 -> reader1.getString());
                    deserializedDedicatedCapacityAdministrators.members = members;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDedicatedCapacityAdministrators;
        });
    }
}
