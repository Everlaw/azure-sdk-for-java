// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

/**
 * Additional information of DPM Protected item.
 */
@Fluent
public final class DpmProtectedItemExtendedInfo implements JsonSerializable<DpmProtectedItemExtendedInfo> {
    /*
     * Attribute to provide information on various DBs.
     */
    private Map<String, String> protectableObjectLoadPath;

    /*
     * To check if backup item is disk protected.
     */
    private Boolean protectedProperty;

    /*
     * To check if backup item is cloud protected.
     */
    private Boolean isPresentOnCloud;

    /*
     * Last backup status information on backup item.
     */
    private String lastBackupStatus;

    /*
     * Last refresh time on backup item.
     */
    private OffsetDateTime lastRefreshedAt;

    /*
     * Oldest cloud recovery point time.
     */
    private OffsetDateTime oldestRecoveryPoint;

    /*
     * cloud recovery point count.
     */
    private Integer recoveryPointCount;

    /*
     * Oldest disk recovery point time.
     */
    private OffsetDateTime onPremiseOldestRecoveryPoint;

    /*
     * latest disk recovery point time.
     */
    private OffsetDateTime onPremiseLatestRecoveryPoint;

    /*
     * disk recovery point count.
     */
    private Integer onPremiseRecoveryPointCount;

    /*
     * To check if backup item is collocated.
     */
    private Boolean isCollocated;

    /*
     * Protection group name of the backup item.
     */
    private String protectionGroupName;

    /*
     * Used Disk storage in bytes.
     */
    private String diskStorageUsedInBytes;

    /*
     * total Disk storage in bytes.
     */
    private String totalDiskStorageSizeInBytes;

    /**
     * Creates an instance of DpmProtectedItemExtendedInfo class.
     */
    public DpmProtectedItemExtendedInfo() {
    }

    /**
     * Get the protectableObjectLoadPath property: Attribute to provide information on various DBs.
     * 
     * @return the protectableObjectLoadPath value.
     */
    public Map<String, String> protectableObjectLoadPath() {
        return this.protectableObjectLoadPath;
    }

    /**
     * Set the protectableObjectLoadPath property: Attribute to provide information on various DBs.
     * 
     * @param protectableObjectLoadPath the protectableObjectLoadPath value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withProtectableObjectLoadPath(Map<String, String> protectableObjectLoadPath) {
        this.protectableObjectLoadPath = protectableObjectLoadPath;
        return this;
    }

    /**
     * Get the protectedProperty property: To check if backup item is disk protected.
     * 
     * @return the protectedProperty value.
     */
    public Boolean protectedProperty() {
        return this.protectedProperty;
    }

    /**
     * Set the protectedProperty property: To check if backup item is disk protected.
     * 
     * @param protectedProperty the protectedProperty value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withProtectedProperty(Boolean protectedProperty) {
        this.protectedProperty = protectedProperty;
        return this;
    }

    /**
     * Get the isPresentOnCloud property: To check if backup item is cloud protected.
     * 
     * @return the isPresentOnCloud value.
     */
    public Boolean isPresentOnCloud() {
        return this.isPresentOnCloud;
    }

    /**
     * Set the isPresentOnCloud property: To check if backup item is cloud protected.
     * 
     * @param isPresentOnCloud the isPresentOnCloud value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withIsPresentOnCloud(Boolean isPresentOnCloud) {
        this.isPresentOnCloud = isPresentOnCloud;
        return this;
    }

    /**
     * Get the lastBackupStatus property: Last backup status information on backup item.
     * 
     * @return the lastBackupStatus value.
     */
    public String lastBackupStatus() {
        return this.lastBackupStatus;
    }

    /**
     * Set the lastBackupStatus property: Last backup status information on backup item.
     * 
     * @param lastBackupStatus the lastBackupStatus value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withLastBackupStatus(String lastBackupStatus) {
        this.lastBackupStatus = lastBackupStatus;
        return this;
    }

    /**
     * Get the lastRefreshedAt property: Last refresh time on backup item.
     * 
     * @return the lastRefreshedAt value.
     */
    public OffsetDateTime lastRefreshedAt() {
        return this.lastRefreshedAt;
    }

    /**
     * Set the lastRefreshedAt property: Last refresh time on backup item.
     * 
     * @param lastRefreshedAt the lastRefreshedAt value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withLastRefreshedAt(OffsetDateTime lastRefreshedAt) {
        this.lastRefreshedAt = lastRefreshedAt;
        return this;
    }

    /**
     * Get the oldestRecoveryPoint property: Oldest cloud recovery point time.
     * 
     * @return the oldestRecoveryPoint value.
     */
    public OffsetDateTime oldestRecoveryPoint() {
        return this.oldestRecoveryPoint;
    }

    /**
     * Set the oldestRecoveryPoint property: Oldest cloud recovery point time.
     * 
     * @param oldestRecoveryPoint the oldestRecoveryPoint value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withOldestRecoveryPoint(OffsetDateTime oldestRecoveryPoint) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        return this;
    }

    /**
     * Get the recoveryPointCount property: cloud recovery point count.
     * 
     * @return the recoveryPointCount value.
     */
    public Integer recoveryPointCount() {
        return this.recoveryPointCount;
    }

    /**
     * Set the recoveryPointCount property: cloud recovery point count.
     * 
     * @param recoveryPointCount the recoveryPointCount value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withRecoveryPointCount(Integer recoveryPointCount) {
        this.recoveryPointCount = recoveryPointCount;
        return this;
    }

    /**
     * Get the onPremiseOldestRecoveryPoint property: Oldest disk recovery point time.
     * 
     * @return the onPremiseOldestRecoveryPoint value.
     */
    public OffsetDateTime onPremiseOldestRecoveryPoint() {
        return this.onPremiseOldestRecoveryPoint;
    }

    /**
     * Set the onPremiseOldestRecoveryPoint property: Oldest disk recovery point time.
     * 
     * @param onPremiseOldestRecoveryPoint the onPremiseOldestRecoveryPoint value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withOnPremiseOldestRecoveryPoint(OffsetDateTime onPremiseOldestRecoveryPoint) {
        this.onPremiseOldestRecoveryPoint = onPremiseOldestRecoveryPoint;
        return this;
    }

    /**
     * Get the onPremiseLatestRecoveryPoint property: latest disk recovery point time.
     * 
     * @return the onPremiseLatestRecoveryPoint value.
     */
    public OffsetDateTime onPremiseLatestRecoveryPoint() {
        return this.onPremiseLatestRecoveryPoint;
    }

    /**
     * Set the onPremiseLatestRecoveryPoint property: latest disk recovery point time.
     * 
     * @param onPremiseLatestRecoveryPoint the onPremiseLatestRecoveryPoint value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withOnPremiseLatestRecoveryPoint(OffsetDateTime onPremiseLatestRecoveryPoint) {
        this.onPremiseLatestRecoveryPoint = onPremiseLatestRecoveryPoint;
        return this;
    }

    /**
     * Get the onPremiseRecoveryPointCount property: disk recovery point count.
     * 
     * @return the onPremiseRecoveryPointCount value.
     */
    public Integer onPremiseRecoveryPointCount() {
        return this.onPremiseRecoveryPointCount;
    }

    /**
     * Set the onPremiseRecoveryPointCount property: disk recovery point count.
     * 
     * @param onPremiseRecoveryPointCount the onPremiseRecoveryPointCount value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withOnPremiseRecoveryPointCount(Integer onPremiseRecoveryPointCount) {
        this.onPremiseRecoveryPointCount = onPremiseRecoveryPointCount;
        return this;
    }

    /**
     * Get the isCollocated property: To check if backup item is collocated.
     * 
     * @return the isCollocated value.
     */
    public Boolean isCollocated() {
        return this.isCollocated;
    }

    /**
     * Set the isCollocated property: To check if backup item is collocated.
     * 
     * @param isCollocated the isCollocated value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withIsCollocated(Boolean isCollocated) {
        this.isCollocated = isCollocated;
        return this;
    }

    /**
     * Get the protectionGroupName property: Protection group name of the backup item.
     * 
     * @return the protectionGroupName value.
     */
    public String protectionGroupName() {
        return this.protectionGroupName;
    }

    /**
     * Set the protectionGroupName property: Protection group name of the backup item.
     * 
     * @param protectionGroupName the protectionGroupName value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withProtectionGroupName(String protectionGroupName) {
        this.protectionGroupName = protectionGroupName;
        return this;
    }

    /**
     * Get the diskStorageUsedInBytes property: Used Disk storage in bytes.
     * 
     * @return the diskStorageUsedInBytes value.
     */
    public String diskStorageUsedInBytes() {
        return this.diskStorageUsedInBytes;
    }

    /**
     * Set the diskStorageUsedInBytes property: Used Disk storage in bytes.
     * 
     * @param diskStorageUsedInBytes the diskStorageUsedInBytes value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withDiskStorageUsedInBytes(String diskStorageUsedInBytes) {
        this.diskStorageUsedInBytes = diskStorageUsedInBytes;
        return this;
    }

    /**
     * Get the totalDiskStorageSizeInBytes property: total Disk storage in bytes.
     * 
     * @return the totalDiskStorageSizeInBytes value.
     */
    public String totalDiskStorageSizeInBytes() {
        return this.totalDiskStorageSizeInBytes;
    }

    /**
     * Set the totalDiskStorageSizeInBytes property: total Disk storage in bytes.
     * 
     * @param totalDiskStorageSizeInBytes the totalDiskStorageSizeInBytes value to set.
     * @return the DpmProtectedItemExtendedInfo object itself.
     */
    public DpmProtectedItemExtendedInfo withTotalDiskStorageSizeInBytes(String totalDiskStorageSizeInBytes) {
        this.totalDiskStorageSizeInBytes = totalDiskStorageSizeInBytes;
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
        jsonWriter.writeMapField("protectableObjectLoadPath", this.protectableObjectLoadPath,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("protected", this.protectedProperty);
        jsonWriter.writeBooleanField("isPresentOnCloud", this.isPresentOnCloud);
        jsonWriter.writeStringField("lastBackupStatus", this.lastBackupStatus);
        jsonWriter.writeStringField("lastRefreshedAt",
            this.lastRefreshedAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastRefreshedAt));
        jsonWriter.writeStringField("oldestRecoveryPoint",
            this.oldestRecoveryPoint == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.oldestRecoveryPoint));
        jsonWriter.writeNumberField("recoveryPointCount", this.recoveryPointCount);
        jsonWriter.writeStringField("onPremiseOldestRecoveryPoint",
            this.onPremiseOldestRecoveryPoint == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.onPremiseOldestRecoveryPoint));
        jsonWriter.writeStringField("onPremiseLatestRecoveryPoint",
            this.onPremiseLatestRecoveryPoint == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.onPremiseLatestRecoveryPoint));
        jsonWriter.writeNumberField("onPremiseRecoveryPointCount", this.onPremiseRecoveryPointCount);
        jsonWriter.writeBooleanField("isCollocated", this.isCollocated);
        jsonWriter.writeStringField("protectionGroupName", this.protectionGroupName);
        jsonWriter.writeStringField("diskStorageUsedInBytes", this.diskStorageUsedInBytes);
        jsonWriter.writeStringField("totalDiskStorageSizeInBytes", this.totalDiskStorageSizeInBytes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DpmProtectedItemExtendedInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DpmProtectedItemExtendedInfo if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DpmProtectedItemExtendedInfo.
     */
    public static DpmProtectedItemExtendedInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DpmProtectedItemExtendedInfo deserializedDpmProtectedItemExtendedInfo = new DpmProtectedItemExtendedInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("protectableObjectLoadPath".equals(fieldName)) {
                    Map<String, String> protectableObjectLoadPath = reader.readMap(reader1 -> reader1.getString());
                    deserializedDpmProtectedItemExtendedInfo.protectableObjectLoadPath = protectableObjectLoadPath;
                } else if ("protected".equals(fieldName)) {
                    deserializedDpmProtectedItemExtendedInfo.protectedProperty
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("isPresentOnCloud".equals(fieldName)) {
                    deserializedDpmProtectedItemExtendedInfo.isPresentOnCloud
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("lastBackupStatus".equals(fieldName)) {
                    deserializedDpmProtectedItemExtendedInfo.lastBackupStatus = reader.getString();
                } else if ("lastRefreshedAt".equals(fieldName)) {
                    deserializedDpmProtectedItemExtendedInfo.lastRefreshedAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("oldestRecoveryPoint".equals(fieldName)) {
                    deserializedDpmProtectedItemExtendedInfo.oldestRecoveryPoint = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("recoveryPointCount".equals(fieldName)) {
                    deserializedDpmProtectedItemExtendedInfo.recoveryPointCount
                        = reader.getNullable(JsonReader::getInt);
                } else if ("onPremiseOldestRecoveryPoint".equals(fieldName)) {
                    deserializedDpmProtectedItemExtendedInfo.onPremiseOldestRecoveryPoint = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("onPremiseLatestRecoveryPoint".equals(fieldName)) {
                    deserializedDpmProtectedItemExtendedInfo.onPremiseLatestRecoveryPoint = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("onPremiseRecoveryPointCount".equals(fieldName)) {
                    deserializedDpmProtectedItemExtendedInfo.onPremiseRecoveryPointCount
                        = reader.getNullable(JsonReader::getInt);
                } else if ("isCollocated".equals(fieldName)) {
                    deserializedDpmProtectedItemExtendedInfo.isCollocated = reader.getNullable(JsonReader::getBoolean);
                } else if ("protectionGroupName".equals(fieldName)) {
                    deserializedDpmProtectedItemExtendedInfo.protectionGroupName = reader.getString();
                } else if ("diskStorageUsedInBytes".equals(fieldName)) {
                    deserializedDpmProtectedItemExtendedInfo.diskStorageUsedInBytes = reader.getString();
                } else if ("totalDiskStorageSizeInBytes".equals(fieldName)) {
                    deserializedDpmProtectedItemExtendedInfo.totalDiskStorageSizeInBytes = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDpmProtectedItemExtendedInfo;
        });
    }
}
