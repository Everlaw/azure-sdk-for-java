// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.Level;
import com.azure.resourcemanager.appcontainers.models.LoggerSetting;
import com.azure.resourcemanager.appcontainers.models.Runtime;
import com.azure.resourcemanager.appcontainers.models.RuntimeDotnet;
import com.azure.resourcemanager.appcontainers.models.RuntimeJava;
import com.azure.resourcemanager.appcontainers.models.RuntimeJavaAgent;
import com.azure.resourcemanager.appcontainers.models.RuntimeJavaAgentLogging;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RuntimeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Runtime model = BinaryData.fromString(
            "{\"java\":{\"enableMetrics\":true,\"javaAgent\":{\"enabled\":true,\"logging\":{\"loggerSettings\":[{\"logger\":\"g\",\"level\":\"warn\"},{\"logger\":\"fvpdbo\",\"level\":\"warn\"},{\"logger\":\"cizsjqlhkrribdei\",\"level\":\"debug\"}]}}},\"dotnet\":{\"autoConfigureDataProtection\":false}}")
            .toObject(Runtime.class);
        Assertions.assertEquals(true, model.java().enableMetrics());
        Assertions.assertEquals(true, model.java().javaAgent().enabled());
        Assertions.assertEquals("g", model.java().javaAgent().logging().loggerSettings().get(0).logger());
        Assertions.assertEquals(Level.WARN, model.java().javaAgent().logging().loggerSettings().get(0).level());
        Assertions.assertEquals(false, model.dotnet().autoConfigureDataProtection());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Runtime model = new Runtime()
            .withJava(new RuntimeJava().withEnableMetrics(true)
                .withJavaAgent(new RuntimeJavaAgent().withEnabled(true)
                    .withLogging(new RuntimeJavaAgentLogging()
                        .withLoggerSettings(Arrays.asList(new LoggerSetting().withLogger("g").withLevel(Level.WARN),
                            new LoggerSetting().withLogger("fvpdbo").withLevel(Level.WARN),
                            new LoggerSetting().withLogger("cizsjqlhkrribdei").withLevel(Level.DEBUG))))))
            .withDotnet(new RuntimeDotnet().withAutoConfigureDataProtection(false));
        model = BinaryData.fromObject(model).toObject(Runtime.class);
        Assertions.assertEquals(true, model.java().enableMetrics());
        Assertions.assertEquals(true, model.java().javaAgent().enabled());
        Assertions.assertEquals("g", model.java().javaAgent().logging().loggerSettings().get(0).logger());
        Assertions.assertEquals(Level.WARN, model.java().javaAgent().logging().loggerSettings().get(0).level());
        Assertions.assertEquals(false, model.dotnet().autoConfigureDataProtection());
    }
}
