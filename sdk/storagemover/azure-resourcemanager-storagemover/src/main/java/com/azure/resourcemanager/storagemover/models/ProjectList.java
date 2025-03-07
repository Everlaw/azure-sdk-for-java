// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storagemover.fluent.models.ProjectInner;
import java.io.IOException;
import java.util.List;

/**
 * List of Project resources.
 */
@Immutable
public final class ProjectList implements JsonSerializable<ProjectList> {
    /*
     * The value property.
     */
    private List<ProjectInner> value;

    /*
     * Request URL that can be used to query next page of containers. Returned when total number of requested containers
     * exceed maximum page size.
     */
    private String nextLink;

    /**
     * Creates an instance of ProjectList class.
     */
    public ProjectList() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public List<ProjectInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Request URL that can be used to query next page of containers. Returned when total
     * number of requested containers exceed maximum page size.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProjectList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProjectList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProjectList.
     */
    public static ProjectList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProjectList deserializedProjectList = new ProjectList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ProjectInner> value = reader.readArray(reader1 -> ProjectInner.fromJson(reader1));
                    deserializedProjectList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedProjectList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProjectList;
        });
    }
}
