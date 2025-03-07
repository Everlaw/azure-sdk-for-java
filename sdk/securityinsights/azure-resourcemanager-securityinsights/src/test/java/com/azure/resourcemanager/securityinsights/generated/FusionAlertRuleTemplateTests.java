// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.AlertRuleTemplateDataSource;
import com.azure.resourcemanager.securityinsights.models.AlertSeverity;
import com.azure.resourcemanager.securityinsights.models.AttackTactic;
import com.azure.resourcemanager.securityinsights.models.FusionAlertRuleTemplate;
import com.azure.resourcemanager.securityinsights.models.TemplateStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FusionAlertRuleTemplateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FusionAlertRuleTemplate model = BinaryData.fromString(
            "{\"kind\":\"Fusion\",\"properties\":{\"alertRulesCreatedByTemplateCount\":73539511,\"createdDateUTC\":\"2021-02-15T15:09:11Z\",\"lastUpdatedDateUTC\":\"2021-07-09T07:02:02Z\",\"description\":\"pshneekulfgslq\",\"displayName\":\"kwdlenrdsutujba\",\"requiredDataConnectors\":[{\"connectorId\":\"o\",\"dataTypes\":[\"nyfln\",\"rwm\",\"uvwpklvxwmyg\",\"xpgpq\"]},{\"connectorId\":\"isze\",\"dataTypes\":[\"bjcrxgibbdaxco\"]},{\"connectorId\":\"ozauorsukokwb\",\"dataTypes\":[\"hlvnuuepzlr\"]},{\"connectorId\":\"wzsoldweyuqdunv\",\"dataTypes\":[\"rwrbi\",\"rk\",\"alywjhhgdn\"]}],\"status\":\"NotAvailable\",\"severity\":\"Low\",\"tactics\":[\"PreAttack\",\"PreAttack\",\"Exfiltration\"],\"techniques\":[\"xggdufi\"]},\"id\":\"dieuzaofj\",\"name\":\"hvcyyysfg\",\"type\":\"otcubi\"}")
            .toObject(FusionAlertRuleTemplate.class);
        Assertions.assertEquals(73539511, model.alertRulesCreatedByTemplateCount());
        Assertions.assertEquals("pshneekulfgslq", model.description());
        Assertions.assertEquals("kwdlenrdsutujba", model.displayName());
        Assertions.assertEquals("o", model.requiredDataConnectors().get(0).connectorId());
        Assertions.assertEquals("nyfln", model.requiredDataConnectors().get(0).dataTypes().get(0));
        Assertions.assertEquals(TemplateStatus.NOT_AVAILABLE, model.status());
        Assertions.assertEquals(AlertSeverity.LOW, model.severity());
        Assertions.assertEquals(AttackTactic.PRE_ATTACK, model.tactics().get(0));
        Assertions.assertEquals("xggdufi", model.techniques().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FusionAlertRuleTemplate model = new FusionAlertRuleTemplate().withAlertRulesCreatedByTemplateCount(73539511)
            .withDescription("pshneekulfgslq")
            .withDisplayName("kwdlenrdsutujba")
            .withRequiredDataConnectors(Arrays.asList(
                new AlertRuleTemplateDataSource().withConnectorId("o")
                    .withDataTypes(Arrays.asList("nyfln", "rwm", "uvwpklvxwmyg", "xpgpq")),
                new AlertRuleTemplateDataSource().withConnectorId("isze")
                    .withDataTypes(Arrays.asList("bjcrxgibbdaxco")),
                new AlertRuleTemplateDataSource().withConnectorId("ozauorsukokwb")
                    .withDataTypes(Arrays.asList("hlvnuuepzlr")),
                new AlertRuleTemplateDataSource().withConnectorId("wzsoldweyuqdunv")
                    .withDataTypes(Arrays.asList("rwrbi", "rk", "alywjhhgdn"))))
            .withStatus(TemplateStatus.NOT_AVAILABLE)
            .withSeverity(AlertSeverity.LOW)
            .withTactics(Arrays.asList(AttackTactic.PRE_ATTACK, AttackTactic.PRE_ATTACK, AttackTactic.EXFILTRATION))
            .withTechniques(Arrays.asList("xggdufi"));
        model = BinaryData.fromObject(model).toObject(FusionAlertRuleTemplate.class);
        Assertions.assertEquals(73539511, model.alertRulesCreatedByTemplateCount());
        Assertions.assertEquals("pshneekulfgslq", model.description());
        Assertions.assertEquals("kwdlenrdsutujba", model.displayName());
        Assertions.assertEquals("o", model.requiredDataConnectors().get(0).connectorId());
        Assertions.assertEquals("nyfln", model.requiredDataConnectors().get(0).dataTypes().get(0));
        Assertions.assertEquals(TemplateStatus.NOT_AVAILABLE, model.status());
        Assertions.assertEquals(AlertSeverity.LOW, model.severity());
        Assertions.assertEquals(AttackTactic.PRE_ATTACK, model.tactics().get(0));
        Assertions.assertEquals("xggdufi", model.techniques().get(0));
    }
}
