// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventgrid.models.PermissionBindingProvisioningState;
import com.azure.resourcemanager.eventgrid.models.PermissionType;
import java.io.IOException;

/**
 * The properties of permission binding.
 */
@Fluent
public final class PermissionBindingProperties implements JsonSerializable<PermissionBindingProperties> {
    /*
     * Description for the Permission Binding resource.
     */
    private String description;

    /*
     * The name of the Topic Space resource that the permission is bound to.
     * The Topic space needs to be a resource under the same namespace the permission binding is a part of.
     */
    private String topicSpaceName;

    /*
     * The allowed permission.
     */
    private PermissionType permission;

    /*
     * The name of the client group resource that the permission is bound to.
     * The client group needs to be a resource under the same namespace the permission binding is a part of.
     */
    private String clientGroupName;

    /*
     * Provisioning state of the PermissionBinding resource.
     */
    private PermissionBindingProvisioningState provisioningState;

    /**
     * Creates an instance of PermissionBindingProperties class.
     */
    public PermissionBindingProperties() {
    }

    /**
     * Get the description property: Description for the Permission Binding resource.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description for the Permission Binding resource.
     * 
     * @param description the description value to set.
     * @return the PermissionBindingProperties object itself.
     */
    public PermissionBindingProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the topicSpaceName property: The name of the Topic Space resource that the permission is bound to.
     * The Topic space needs to be a resource under the same namespace the permission binding is a part of.
     * 
     * @return the topicSpaceName value.
     */
    public String topicSpaceName() {
        return this.topicSpaceName;
    }

    /**
     * Set the topicSpaceName property: The name of the Topic Space resource that the permission is bound to.
     * The Topic space needs to be a resource under the same namespace the permission binding is a part of.
     * 
     * @param topicSpaceName the topicSpaceName value to set.
     * @return the PermissionBindingProperties object itself.
     */
    public PermissionBindingProperties withTopicSpaceName(String topicSpaceName) {
        this.topicSpaceName = topicSpaceName;
        return this;
    }

    /**
     * Get the permission property: The allowed permission.
     * 
     * @return the permission value.
     */
    public PermissionType permission() {
        return this.permission;
    }

    /**
     * Set the permission property: The allowed permission.
     * 
     * @param permission the permission value to set.
     * @return the PermissionBindingProperties object itself.
     */
    public PermissionBindingProperties withPermission(PermissionType permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get the clientGroupName property: The name of the client group resource that the permission is bound to.
     * The client group needs to be a resource under the same namespace the permission binding is a part of.
     * 
     * @return the clientGroupName value.
     */
    public String clientGroupName() {
        return this.clientGroupName;
    }

    /**
     * Set the clientGroupName property: The name of the client group resource that the permission is bound to.
     * The client group needs to be a resource under the same namespace the permission binding is a part of.
     * 
     * @param clientGroupName the clientGroupName value to set.
     * @return the PermissionBindingProperties object itself.
     */
    public PermissionBindingProperties withClientGroupName(String clientGroupName) {
        this.clientGroupName = clientGroupName;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the PermissionBinding resource.
     * 
     * @return the provisioningState value.
     */
    public PermissionBindingProvisioningState provisioningState() {
        return this.provisioningState;
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
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("topicSpaceName", this.topicSpaceName);
        jsonWriter.writeStringField("permission", this.permission == null ? null : this.permission.toString());
        jsonWriter.writeStringField("clientGroupName", this.clientGroupName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PermissionBindingProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PermissionBindingProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PermissionBindingProperties.
     */
    public static PermissionBindingProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PermissionBindingProperties deserializedPermissionBindingProperties = new PermissionBindingProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedPermissionBindingProperties.description = reader.getString();
                } else if ("topicSpaceName".equals(fieldName)) {
                    deserializedPermissionBindingProperties.topicSpaceName = reader.getString();
                } else if ("permission".equals(fieldName)) {
                    deserializedPermissionBindingProperties.permission = PermissionType.fromString(reader.getString());
                } else if ("clientGroupName".equals(fieldName)) {
                    deserializedPermissionBindingProperties.clientGroupName = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedPermissionBindingProperties.provisioningState
                        = PermissionBindingProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPermissionBindingProperties;
        });
    }
}
