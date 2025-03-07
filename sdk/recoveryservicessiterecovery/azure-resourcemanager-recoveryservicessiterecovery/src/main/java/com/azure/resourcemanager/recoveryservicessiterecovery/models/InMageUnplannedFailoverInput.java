// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Provider specific input for InMage unplanned failover.
 */
@Fluent
public final class InMageUnplannedFailoverInput extends UnplannedFailoverProviderSpecificInput {
    /*
     * The class type.
     */
    private String instanceType = "InMage";

    /*
     * The recovery point type. Values from LatestTime, LatestTag or Custom. In the case of custom, the recovery point
     * provided by RecoveryPointId will be used. In the other two cases, recovery point id will be ignored.
     */
    private RecoveryPointType recoveryPointType;

    /*
     * The recovery point id to be passed to failover to a particular recovery point. In case of latest recovery point,
     * null should be passed.
     */
    private String recoveryPointId;

    /**
     * Creates an instance of InMageUnplannedFailoverInput class.
     */
    public InMageUnplannedFailoverInput() {
    }

    /**
     * Get the instanceType property: The class type.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the recoveryPointType property: The recovery point type. Values from LatestTime, LatestTag or Custom. In the
     * case of custom, the recovery point provided by RecoveryPointId will be used. In the other two cases, recovery
     * point id will be ignored.
     * 
     * @return the recoveryPointType value.
     */
    public RecoveryPointType recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set the recoveryPointType property: The recovery point type. Values from LatestTime, LatestTag or Custom. In the
     * case of custom, the recovery point provided by RecoveryPointId will be used. In the other two cases, recovery
     * point id will be ignored.
     * 
     * @param recoveryPointType the recoveryPointType value to set.
     * @return the InMageUnplannedFailoverInput object itself.
     */
    public InMageUnplannedFailoverInput withRecoveryPointType(RecoveryPointType recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

    /**
     * Get the recoveryPointId property: The recovery point id to be passed to failover to a particular recovery point.
     * In case of latest recovery point, null should be passed.
     * 
     * @return the recoveryPointId value.
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recoveryPointId property: The recovery point id to be passed to failover to a particular recovery point.
     * In case of latest recovery point, null should be passed.
     * 
     * @param recoveryPointId the recoveryPointId value to set.
     * @return the InMageUnplannedFailoverInput object itself.
     */
    public InMageUnplannedFailoverInput withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeStringField("recoveryPointType",
            this.recoveryPointType == null ? null : this.recoveryPointType.toString());
        jsonWriter.writeStringField("recoveryPointId", this.recoveryPointId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InMageUnplannedFailoverInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InMageUnplannedFailoverInput if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the InMageUnplannedFailoverInput.
     */
    public static InMageUnplannedFailoverInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InMageUnplannedFailoverInput deserializedInMageUnplannedFailoverInput = new InMageUnplannedFailoverInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedInMageUnplannedFailoverInput.instanceType = reader.getString();
                } else if ("recoveryPointType".equals(fieldName)) {
                    deserializedInMageUnplannedFailoverInput.recoveryPointType
                        = RecoveryPointType.fromString(reader.getString());
                } else if ("recoveryPointId".equals(fieldName)) {
                    deserializedInMageUnplannedFailoverInput.recoveryPointId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInMageUnplannedFailoverInput;
        });
    }
}
