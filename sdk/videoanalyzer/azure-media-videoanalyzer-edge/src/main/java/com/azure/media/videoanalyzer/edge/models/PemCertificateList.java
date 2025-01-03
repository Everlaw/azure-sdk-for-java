// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A list of PEM formatted certificates.
 */
@Immutable
public final class PemCertificateList extends CertificateSource {
    /*
     * Type discriminator for the derived types.
     */
    private String type = "#Microsoft.VideoAnalyzer.PemCertificateList";

    /*
     * PEM formatted public certificates. One certificate per entry.
     */
    private final List<String> certificates;

    /**
     * Creates an instance of PemCertificateList class.
     * 
     * @param certificates the certificates value to set.
     */
    public PemCertificateList(List<String> certificates) {
        this.certificates = certificates;
    }

    /**
     * Get the type property: Type discriminator for the derived types.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the certificates property: PEM formatted public certificates. One certificate per entry.
     * 
     * @return the certificates value.
     */
    public List<String> getCertificates() {
        return this.certificates;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("certificates", this.certificates, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("@type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PemCertificateList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PemCertificateList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PemCertificateList.
     */
    public static PemCertificateList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean certificatesFound = false;
            List<String> certificates = null;
            String type = "#Microsoft.VideoAnalyzer.PemCertificateList";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("certificates".equals(fieldName)) {
                    certificates = reader.readArray(reader1 -> reader1.getString());
                    certificatesFound = true;
                } else if ("@type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (certificatesFound) {
                PemCertificateList deserializedPemCertificateList = new PemCertificateList(certificates);
                deserializedPemCertificateList.type = type;

                return deserializedPemCertificateList;
            }
            throw new IllegalStateException("Missing required property: certificates");
        });
    }
}
