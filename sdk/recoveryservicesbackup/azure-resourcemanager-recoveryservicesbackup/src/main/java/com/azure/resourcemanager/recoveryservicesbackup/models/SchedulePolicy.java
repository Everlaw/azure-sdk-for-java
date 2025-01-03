// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Base class for backup schedule.
 */
@Immutable
public class SchedulePolicy implements JsonSerializable<SchedulePolicy> {
    /*
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of
     * types.
     */
    private String schedulePolicyType = "SchedulePolicy";

    /**
     * Creates an instance of SchedulePolicy class.
     */
    public SchedulePolicy() {
    }

    /**
     * Get the schedulePolicyType property: This property will be used as the discriminator for deciding the specific
     * types in the polymorphic chain of types.
     * 
     * @return the schedulePolicyType value.
     */
    public String schedulePolicyType() {
        return this.schedulePolicyType;
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
        jsonWriter.writeStringField("schedulePolicyType", this.schedulePolicyType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SchedulePolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SchedulePolicy if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SchedulePolicy.
     */
    public static SchedulePolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("schedulePolicyType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("LogSchedulePolicy".equals(discriminatorValue)) {
                    return LogSchedulePolicy.fromJson(readerToUse.reset());
                } else if ("LongTermSchedulePolicy".equals(discriminatorValue)) {
                    return LongTermSchedulePolicy.fromJson(readerToUse.reset());
                } else if ("SimpleSchedulePolicy".equals(discriminatorValue)) {
                    return SimpleSchedulePolicy.fromJson(readerToUse.reset());
                } else if ("SimpleSchedulePolicyV2".equals(discriminatorValue)) {
                    return SimpleSchedulePolicyV2.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static SchedulePolicy fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SchedulePolicy deserializedSchedulePolicy = new SchedulePolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("schedulePolicyType".equals(fieldName)) {
                    deserializedSchedulePolicy.schedulePolicyType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSchedulePolicy;
        });
    }
}
