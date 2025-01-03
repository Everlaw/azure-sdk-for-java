// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.costmanagement.models.ReportConfigDataset;
import com.azure.resourcemanager.costmanagement.models.ReportConfigTimePeriod;
import com.azure.resourcemanager.costmanagement.models.ReportTimeframeType;
import com.azure.resourcemanager.costmanagement.models.ReportType;
import java.io.IOException;

/**
 * The definition of a report config.
 */
@Fluent
public final class ReportConfigDefinition implements JsonSerializable<ReportConfigDefinition> {
    /*
     * The type of the report. Usage represents actual usage, forecast represents forecasted data and UsageAndForecast
     * represents both usage and forecasted data. Actual usage and forecasted data can be differentiated based on dates.
     */
    private ReportType type;

    /*
     * The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     */
    private ReportTimeframeType timeframe;

    /*
     * Has time period for pulling data for the report.
     */
    private ReportConfigTimePeriod timePeriod;

    /*
     * Has definition for data in this report config.
     */
    private ReportConfigDataset dataSet;

    /*
     * If true, report includes monetary commitment.
     */
    private Boolean includeMonetaryCommitment;

    /**
     * Creates an instance of ReportConfigDefinition class.
     */
    public ReportConfigDefinition() {
    }

    /**
     * Get the type property: The type of the report. Usage represents actual usage, forecast represents forecasted data
     * and UsageAndForecast represents both usage and forecasted data. Actual usage and forecasted data can be
     * differentiated based on dates.
     * 
     * @return the type value.
     */
    public ReportType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the report. Usage represents actual usage, forecast represents forecasted data
     * and UsageAndForecast represents both usage and forecasted data. Actual usage and forecasted data can be
     * differentiated based on dates.
     * 
     * @param type the type value to set.
     * @return the ReportConfigDefinition object itself.
     */
    public ReportConfigDefinition withType(ReportType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the timeframe property: The time frame for pulling data for the report. If custom, then a specific time
     * period must be provided.
     * 
     * @return the timeframe value.
     */
    public ReportTimeframeType timeframe() {
        return this.timeframe;
    }

    /**
     * Set the timeframe property: The time frame for pulling data for the report. If custom, then a specific time
     * period must be provided.
     * 
     * @param timeframe the timeframe value to set.
     * @return the ReportConfigDefinition object itself.
     */
    public ReportConfigDefinition withTimeframe(ReportTimeframeType timeframe) {
        this.timeframe = timeframe;
        return this;
    }

    /**
     * Get the timePeriod property: Has time period for pulling data for the report.
     * 
     * @return the timePeriod value.
     */
    public ReportConfigTimePeriod timePeriod() {
        return this.timePeriod;
    }

    /**
     * Set the timePeriod property: Has time period for pulling data for the report.
     * 
     * @param timePeriod the timePeriod value to set.
     * @return the ReportConfigDefinition object itself.
     */
    public ReportConfigDefinition withTimePeriod(ReportConfigTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * Get the dataSet property: Has definition for data in this report config.
     * 
     * @return the dataSet value.
     */
    public ReportConfigDataset dataSet() {
        return this.dataSet;
    }

    /**
     * Set the dataSet property: Has definition for data in this report config.
     * 
     * @param dataSet the dataSet value to set.
     * @return the ReportConfigDefinition object itself.
     */
    public ReportConfigDefinition withDataSet(ReportConfigDataset dataSet) {
        this.dataSet = dataSet;
        return this;
    }

    /**
     * Get the includeMonetaryCommitment property: If true, report includes monetary commitment.
     * 
     * @return the includeMonetaryCommitment value.
     */
    public Boolean includeMonetaryCommitment() {
        return this.includeMonetaryCommitment;
    }

    /**
     * Set the includeMonetaryCommitment property: If true, report includes monetary commitment.
     * 
     * @param includeMonetaryCommitment the includeMonetaryCommitment value to set.
     * @return the ReportConfigDefinition object itself.
     */
    public ReportConfigDefinition withIncludeMonetaryCommitment(Boolean includeMonetaryCommitment) {
        this.includeMonetaryCommitment = includeMonetaryCommitment;
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
                .log(new IllegalArgumentException("Missing required property type in model ReportConfigDefinition"));
        }
        if (timeframe() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property timeframe in model ReportConfigDefinition"));
        }
        if (timePeriod() != null) {
            timePeriod().validate();
        }
        if (dataSet() != null) {
            dataSet().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ReportConfigDefinition.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("timeframe", this.timeframe == null ? null : this.timeframe.toString());
        jsonWriter.writeJsonField("timePeriod", this.timePeriod);
        jsonWriter.writeJsonField("dataSet", this.dataSet);
        jsonWriter.writeBooleanField("includeMonetaryCommitment", this.includeMonetaryCommitment);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReportConfigDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReportConfigDefinition if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ReportConfigDefinition.
     */
    public static ReportConfigDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReportConfigDefinition deserializedReportConfigDefinition = new ReportConfigDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedReportConfigDefinition.type = ReportType.fromString(reader.getString());
                } else if ("timeframe".equals(fieldName)) {
                    deserializedReportConfigDefinition.timeframe = ReportTimeframeType.fromString(reader.getString());
                } else if ("timePeriod".equals(fieldName)) {
                    deserializedReportConfigDefinition.timePeriod = ReportConfigTimePeriod.fromJson(reader);
                } else if ("dataSet".equals(fieldName)) {
                    deserializedReportConfigDefinition.dataSet = ReportConfigDataset.fromJson(reader);
                } else if ("includeMonetaryCommitment".equals(fieldName)) {
                    deserializedReportConfigDefinition.includeMonetaryCommitment
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReportConfigDefinition;
        });
    }
}
