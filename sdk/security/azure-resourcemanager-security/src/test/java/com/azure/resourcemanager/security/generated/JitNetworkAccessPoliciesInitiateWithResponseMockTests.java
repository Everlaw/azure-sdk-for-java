// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicyInitiatePort;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicyInitiateRequest;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicyInitiateVirtualMachine;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequest;
import com.azure.resourcemanager.security.models.Status;
import com.azure.resourcemanager.security.models.StatusReason;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class JitNetworkAccessPoliciesInitiateWithResponseMockTests {
    @Test
    public void testInitiateWithResponse() throws Exception {
        String responseStr
            = "{\"virtualMachines\":[{\"id\":\"dtzmpype\",\"ports\":[{\"number\":297913100,\"allowedSourceAddressPrefix\":\"zshnuqndaizup\",\"allowedSourceAddressPrefixes\":[\"uytuszxhmtvtv\",\"gw\"],\"endTimeUtc\":\"2021-05-02T17:20:42Z\",\"status\":\"Initiated\",\"statusReason\":\"NewerRequestInitiated\",\"mappedPort\":1977737206},{\"number\":577504538,\"allowedSourceAddressPrefix\":\"dwttha\",\"allowedSourceAddressPrefixes\":[\"ksk\",\"i\",\"bs\"],\"endTimeUtc\":\"2021-12-03T16:10:12Z\",\"status\":\"Revoked\",\"statusReason\":\"Expired\",\"mappedPort\":561788405},{\"number\":121782295,\"allowedSourceAddressPrefix\":\"peexpgeumilhwuit\",\"allowedSourceAddressPrefixes\":[\"xyio\",\"ofninbdbz\",\"xcwqqrsmpc\",\"bprt\"],\"endTimeUtc\":\"2021-05-19T00:12:44Z\",\"status\":\"Revoked\",\"statusReason\":\"Expired\",\"mappedPort\":2066287030}]},{\"id\":\"bcyksivmfogd\",\"ports\":[{\"number\":17474614,\"allowedSourceAddressPrefix\":\"cmkrftsjcwjj\",\"allowedSourceAddressPrefixes\":[\"mb\",\"wvif\",\"xkecifhocj\"],\"endTimeUtc\":\"2021-11-01T17:33:31Z\",\"status\":\"Revoked\",\"statusReason\":\"Expired\",\"mappedPort\":1592395249},{\"number\":1087565729,\"allowedSourceAddressPrefix\":\"vtxvcmufun\",\"allowedSourceAddressPrefixes\":[\"xxvir\"],\"endTimeUtc\":\"2021-01-12T19:33:42Z\",\"status\":\"Initiated\",\"statusReason\":\"Expired\",\"mappedPort\":873495468}]},{\"id\":\"g\",\"ports\":[{\"number\":770458191,\"allowedSourceAddressPrefix\":\"vpygglp\",\"allowedSourceAddressPrefixes\":[\"dcueljtiahxmfq\",\"yarvsxzqbglcjk\",\"yspthzod\"],\"endTimeUtc\":\"2021-09-15T01:29:54Z\",\"status\":\"Revoked\",\"statusReason\":\"NewerRequestInitiated\",\"mappedPort\":2116969841}]}],\"startTimeUtc\":\"2021-06-28T08:42:43Z\",\"requestor\":\"gblioskkfmkm\",\"justification\":\"jxyxgb\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 202, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        JitNetworkAccessRequest response = manager.jitNetworkAccessPolicies()
            .initiateWithResponse("slojfkqidnqt", "qxjhqxcsqhtkbtnq", "rngl",
                new JitNetworkAccessPolicyInitiateRequest()
                    .withVirtualMachines(Arrays.asList(
                        new JitNetworkAccessPolicyInitiateVirtualMachine().withId("biipsnawwlqkznx")
                            .withPorts(Arrays.asList(
                                new JitNetworkAccessPolicyInitiatePort().withNumber(1702274407)
                                    .withAllowedSourceAddressPrefix("xricctkwmuqq")
                                    .withEndTimeUtc(OffsetDateTime.parse("2021-12-10T09:35:28Z")),
                                new JitNetworkAccessPolicyInitiatePort().withNumber(1312223901)
                                    .withAllowedSourceAddressPrefix("eiyglesrwvaexhdc")
                                    .withEndTimeUtc(OffsetDateTime.parse("2021-09-11T21:48:17Z")),
                                new JitNetworkAccessPolicyInitiatePort().withNumber(1400683190)
                                    .withAllowedSourceAddressPrefix("qnkbrupobehdm")
                                    .withEndTimeUtc(OffsetDateTime.parse("2021-03-13T10:45:29Z")))),
                        new JitNetworkAccessPolicyInitiateVirtualMachine().withId("zacvu")
                            .withPorts(Arrays.asList(new JitNetworkAccessPolicyInitiatePort().withNumber(399628097)
                                .withAllowedSourceAddressPrefix("pbibn")
                                .withEndTimeUtc(OffsetDateTime.parse("2021-07-09T06:00:41Z")))),
                        new JitNetworkAccessPolicyInitiateVirtualMachine().withId("phepifexleqirc")
                            .withPorts(Arrays.asList(
                                new JitNetworkAccessPolicyInitiatePort().withNumber(657869906)
                                    .withAllowedSourceAddressPrefix("ykcgxvrpjlvcz")
                                    .withEndTimeUtc(OffsetDateTime.parse("2021-01-19T12:24:20Z")),
                                new JitNetworkAccessPolicyInitiatePort().withNumber(477623616)
                                    .withAllowedSourceAddressPrefix("cpunettepdjx")
                                    .withEndTimeUtc(OffsetDateTime.parse("2021-02-06T18:03:26Z")))),
                        new JitNetworkAccessPolicyInitiateVirtualMachine().withId("skoynuiylpc")
                            .withPorts(Arrays.asList(
                                new JitNetworkAccessPolicyInitiatePort().withNumber(922180456)
                                    .withAllowedSourceAddressPrefix("sedveskwxegqphrg")
                                    .withEndTimeUtc(OffsetDateTime.parse("2021-09-07T02:28:33Z")),
                                new JitNetworkAccessPolicyInitiatePort().withNumber(1143125594)
                                    .withAllowedSourceAddressPrefix("ctmjtsghpbcbc")
                                    .withEndTimeUtc(OffsetDateTime.parse("2021-09-28T15:58:03Z"))))))
                    .withJustification("rpzeqac"),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("dtzmpype", response.virtualMachines().get(0).id());
        Assertions.assertEquals(297913100, response.virtualMachines().get(0).ports().get(0).number());
        Assertions.assertEquals("zshnuqndaizup",
            response.virtualMachines().get(0).ports().get(0).allowedSourceAddressPrefix());
        Assertions.assertEquals("uytuszxhmtvtv",
            response.virtualMachines().get(0).ports().get(0).allowedSourceAddressPrefixes().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-02T17:20:42Z"),
            response.virtualMachines().get(0).ports().get(0).endTimeUtc());
        Assertions.assertEquals(Status.INITIATED, response.virtualMachines().get(0).ports().get(0).status());
        Assertions.assertEquals(StatusReason.NEWER_REQUEST_INITIATED,
            response.virtualMachines().get(0).ports().get(0).statusReason());
        Assertions.assertEquals(1977737206, response.virtualMachines().get(0).ports().get(0).mappedPort());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-28T08:42:43Z"), response.startTimeUtc());
        Assertions.assertEquals("gblioskkfmkm", response.requestor());
        Assertions.assertEquals("jxyxgb", response.justification());
    }
}
