// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Condition to trigger an alert processing rule.
 */
@Fluent
public final class Condition implements JsonSerializable<Condition> {
    /*
     * Field for a given condition.
     */
    private Field field;

    /*
     * Operator for a given condition.
     */
    private Operator operator;

    /*
     * List of values to match for a given condition.
     */
    private List<String> values;

    /**
     * Creates an instance of Condition class.
     */
    public Condition() {
    }

    /**
     * Get the field property: Field for a given condition.
     * 
     * @return the field value.
     */
    public Field field() {
        return this.field;
    }

    /**
     * Set the field property: Field for a given condition.
     * 
     * @param field the field value to set.
     * @return the Condition object itself.
     */
    public Condition withField(Field field) {
        this.field = field;
        return this;
    }

    /**
     * Get the operator property: Operator for a given condition.
     * 
     * @return the operator value.
     */
    public Operator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: Operator for a given condition.
     * 
     * @param operator the operator value to set.
     * @return the Condition object itself.
     */
    public Condition withOperator(Operator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the values property: List of values to match for a given condition.
     * 
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values property: List of values to match for a given condition.
     * 
     * @param values the values value to set.
     * @return the Condition object itself.
     */
    public Condition withValues(List<String> values) {
        this.values = values;
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
        jsonWriter.writeStringField("field", this.field == null ? null : this.field.toString());
        jsonWriter.writeStringField("operator", this.operator == null ? null : this.operator.toString());
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Condition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Condition if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Condition.
     */
    public static Condition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Condition deserializedCondition = new Condition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("field".equals(fieldName)) {
                    deserializedCondition.field = Field.fromString(reader.getString());
                } else if ("operator".equals(fieldName)) {
                    deserializedCondition.operator = Operator.fromString(reader.getString());
                } else if ("values".equals(fieldName)) {
                    List<String> values = reader.readArray(reader1 -> reader1.getString());
                    deserializedCondition.values = values;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCondition;
        });
    }
}
