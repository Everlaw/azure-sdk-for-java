// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.alertsmanagement.fluent.models.PrometheusRuleGroupResourceInner;
import com.azure.resourcemanager.alertsmanagement.models.PrometheusRule;
import com.azure.resourcemanager.alertsmanagement.models.PrometheusRuleGroupAction;
import com.azure.resourcemanager.alertsmanagement.models.PrometheusRuleGroupResourceCollection;
import com.azure.resourcemanager.alertsmanagement.models.PrometheusRuleResolveConfiguration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PrometheusRuleGroupResourceCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrometheusRuleGroupResourceCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"description\":\"bowsk\",\"enabled\":false,\"clusterName\":\"tzlcuiywgqywgn\",\"scopes\":[\"vynhzgpphrcg\",\"nc\",\"cpecfvmmcoofs\"],\"interval\":\"zevgb\",\"rules\":[{\"record\":\"qabcypm\",\"alert\":\"kwlzuvccfwnfn\",\"enabled\":false,\"expression\":\"fionl\",\"severity\":10134075,\"for\":\"tqgtzxdpnqbqq\",\"labels\":{\"snjampmng\":\"jfeallnwsub\",\"chcbonqvpkvlrxnj\":\"zscxaqwo\",\"pheoflokeyy\":\"ase\",\"jp\":\"enjbdlwtgrhp\"},\"annotations\":{\"xhejjzzvdud\":\"asxazjpqyegualhb\",\"pwlbjnpg\":\"wdslfhotwmcy\",\"nltyfsoppusuesnz\":\"cftadeh\",\"xzdmohctb\":\"dejbavo\"},\"actions\":[{},{},{},{}],\"resolveConfiguration\":{}},{\"record\":\"xdn\",\"alert\":\"vo\",\"enabled\":true,\"expression\":\"jjugwdkcglhslaz\",\"severity\":24046342,\"for\":\"gdtjixhbkuofqwey\",\"labels\":{\"vyvdcs\":\"enevfyexfwhybci\",\"scjeypv\":\"tynnaamdectehfi\",\"gm\":\"ezrkgqhcjrefo\"},\"annotations\":{\"qjpkcattpngjcrc\":\"leyyvx\"},\"actions\":[{},{},{}],\"resolveConfiguration\":{}},{\"record\":\"jh\",\"alert\":\"daj\",\"enabled\":false,\"expression\":\"sounqecanoaeu\",\"severity\":453736827,\"for\":\"hltrpmopjmcmatuo\",\"labels\":{\"uaodsfcpk\":\"fu\",\"xbezyiuokktwh\":\"xodpuozmyzydagfu\",\"o\":\"dxwzywqsmbsurexi\"},\"annotations\":{\"s\":\"cfsf\"},\"actions\":[{},{},{},{}],\"resolveConfiguration\":{}},{\"record\":\"stkiiuxhqyud\",\"alert\":\"rrqnbpoczvyifqrv\",\"enabled\":true,\"expression\":\"jsllrmv\",\"severity\":146352395,\"for\":\"atkpnp\",\"labels\":{\"wiqzbqjvsovmyo\":\"xxbczwtr\",\"zdobpxjmflbvvnch\":\"acspkwl\",\"ajiwkuo\":\"kcciwwzjuqkhr\"},\"annotations\":{\"sauuimj\":\"kg\",\"rfbyaosvexcso\":\"vxieduugidyj\",\"vleggzfbuhfmvfax\":\"pclhocohslk\"},\"actions\":[{},{},{}],\"resolveConfiguration\":{}}]},\"location\":\"ithlvmezyvshxm\",\"tags\":{\"burvjxxjnspy\":\"bzoggigrx\",\"udwtiukbl\":\"ptkoenkoukn\"},\"id\":\"ngkpocipazy\",\"name\":\"o\",\"type\":\"gukgjnpiucgygevq\"},{\"properties\":{\"description\":\"typmrbpizcdrqjsd\",\"enabled\":true,\"clusterName\":\"fyhxde\",\"scopes\":[\"jzicwifsjt\",\"gzfbishcbk\",\"ajdeyeamdphaga\"],\"interval\":\"buxwgip\",\"rules\":[{\"record\":\"nowkgshw\",\"alert\":\"kix\",\"enabled\":false,\"expression\":\"njeputtmrywn\",\"severity\":1133422967,\"for\":\"ftiyqzrnkcq\",\"labels\":{\"lsicohoqqnwv\":\"lwh\",\"yxzk\":\"ryavwhheunmmqh\",\"koklya\":\"noc\"},\"annotations\":{\"zf\":\"onuq\",\"vjektcxsenh\":\"beypewrmjmw\",\"rzpwvlqdqgbiq\":\"lrsf\",\"vf\":\"lihkaetcktvfc\"},\"actions\":[{},{},{},{}],\"resolveConfiguration\":{}},{\"record\":\"uctqhjfbe\",\"alert\":\"jcxerfuwu\",\"enabled\":true,\"expression\":\"xfvjrbirp\",\"severity\":684290279,\"for\":\"c\",\"labels\":{\"j\":\"hfnljkyq\"},\"annotations\":{\"gidokgjljyoxgvcl\":\"j\",\"jhtxfvgxbfsmxne\":\"bgsncghkjeszzhb\"},\"actions\":[{},{},{}],\"resolveConfiguration\":{}},{\"record\":\"cxgod\",\"alert\":\"fqkkr\",\"enabled\":true,\"expression\":\"ukgri\",\"severity\":390168051,\"for\":\"lfbxzpuzycisp\",\"labels\":{\"y\":\"ahmgkbrp\",\"rgvtqag\":\"hibnuqqkpika\",\"bfs\":\"buynhijggm\",\"rcvpnazzmhjrunmp\":\"arbu\"},\"annotations\":{\"skpbhenbtkcxywn\":\"dbhrbnlankxm\",\"qidybyx\":\"tnrsyn\",\"aaxdbabphlwrq\":\"zfcl\"},\"actions\":[{},{},{},{}],\"resolveConfiguration\":{}},{\"record\":\"thsu\",\"alert\":\"cmnyyazttb\",\"enabled\":false,\"expression\":\"rq\",\"severity\":1833989004,\"for\":\"ckzywbiexzfeyue\",\"labels\":{\"wbhqwal\":\"bxu\"},\"annotations\":{\"pdkzjancuxr\":\"yoxa\",\"bavxbniwdjswzt\":\"d\",\"xbzpfzab\":\"dbpgnxytxhp\",\"ovplw\":\"lcuhxwtctyqiklb\"},\"actions\":[{},{},{}],\"resolveConfiguration\":{}}]},\"location\":\"yuguosvmkfssx\",\"tags\":{\"zkd\":\"kfplgmgsxnk\",\"i\":\"slpvlop\"},\"id\":\"ighxpk\",\"name\":\"wzbaiue\",\"type\":\"baumnyqupedeoj\"}]}")
            .toObject(PrometheusRuleGroupResourceCollection.class);
        Assertions.assertEquals("ithlvmezyvshxm", model.value().get(0).location());
        Assertions.assertEquals("bzoggigrx", model.value().get(0).tags().get("burvjxxjnspy"));
        Assertions.assertEquals("bowsk", model.value().get(0).description());
        Assertions.assertEquals(false, model.value().get(0).enabled());
        Assertions.assertEquals("tzlcuiywgqywgn", model.value().get(0).clusterName());
        Assertions.assertEquals("vynhzgpphrcg", model.value().get(0).scopes().get(0));
        Assertions.assertEquals("zevgb", model.value().get(0).interval());
        Assertions.assertEquals("qabcypm", model.value().get(0).rules().get(0).record());
        Assertions.assertEquals("kwlzuvccfwnfn", model.value().get(0).rules().get(0).alert());
        Assertions.assertEquals(false, model.value().get(0).rules().get(0).enabled());
        Assertions.assertEquals("fionl", model.value().get(0).rules().get(0).expression());
        Assertions.assertEquals(10134075, model.value().get(0).rules().get(0).severity());
        Assertions.assertEquals("tqgtzxdpnqbqq", model.value().get(0).rules().get(0).forProperty());
        Assertions.assertEquals("jfeallnwsub", model.value().get(0).rules().get(0).labels().get("snjampmng"));
        Assertions.assertEquals("asxazjpqyegualhb",
            model.value().get(0).rules().get(0).annotations().get("xhejjzzvdud"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrometheusRuleGroupResourceCollection model
            = new PrometheusRuleGroupResourceCollection().withValue(Arrays.asList(
                new PrometheusRuleGroupResourceInner().withLocation("ithlvmezyvshxm")
                    .withTags(mapOf("burvjxxjnspy", "bzoggigrx", "udwtiukbl", "ptkoenkoukn"))
                    .withDescription("bowsk")
                    .withEnabled(false)
                    .withClusterName("tzlcuiywgqywgn")
                    .withScopes(Arrays.asList("vynhzgpphrcg", "nc", "cpecfvmmcoofs"))
                    .withInterval("zevgb")
                    .withRules(Arrays.asList(
                        new PrometheusRule().withRecord("qabcypm")
                            .withAlert("kwlzuvccfwnfn")
                            .withEnabled(false)
                            .withExpression("fionl")
                            .withSeverity(10134075)
                            .withForProperty("tqgtzxdpnqbqq")
                            .withLabels(mapOf("snjampmng", "jfeallnwsub", "chcbonqvpkvlrxnj", "zscxaqwo", "pheoflokeyy",
                                "fakeTokenPlaceholder", "jp", "enjbdlwtgrhp"))
                            .withAnnotations(mapOf("xhejjzzvdud", "asxazjpqyegualhb", "pwlbjnpg", "wdslfhotwmcy",
                                "nltyfsoppusuesnz", "cftadeh", "xzdmohctb", "dejbavo"))
                            .withActions(Arrays.asList(new PrometheusRuleGroupAction(), new PrometheusRuleGroupAction(),
                                new PrometheusRuleGroupAction(), new PrometheusRuleGroupAction()))
                            .withResolveConfiguration(new PrometheusRuleResolveConfiguration()),
                        new PrometheusRule().withRecord("xdn")
                            .withAlert("vo")
                            .withEnabled(true)
                            .withExpression("jjugwdkcglhslaz")
                            .withSeverity(24046342)
                            .withForProperty("gdtjixhbkuofqwey")
                            .withLabels(
                                mapOf("vyvdcs", "enevfyexfwhybci", "scjeypv", "tynnaamdectehfi", "gm", "ezrkgqhcjrefo"))
                            .withAnnotations(mapOf("qjpkcattpngjcrc", "leyyvx"))
                            .withActions(Arrays.asList(new PrometheusRuleGroupAction(), new PrometheusRuleGroupAction(),
                                new PrometheusRuleGroupAction()))
                            .withResolveConfiguration(new PrometheusRuleResolveConfiguration()),
                        new PrometheusRule().withRecord("jh")
                            .withAlert("daj")
                            .withEnabled(false)
                            .withExpression("sounqecanoaeu")
                            .withSeverity(453736827)
                            .withForProperty("hltrpmopjmcmatuo")
                            .withLabels(
                                mapOf("uaodsfcpk", "fu", "xbezyiuokktwh", "xodpuozmyzydagfu", "o", "dxwzywqsmbsurexi"))
                            .withAnnotations(mapOf("s", "cfsf"))
                            .withActions(Arrays.asList(
                                new PrometheusRuleGroupAction(), new PrometheusRuleGroupAction(),
                                new PrometheusRuleGroupAction(), new PrometheusRuleGroupAction()))
                            .withResolveConfiguration(new PrometheusRuleResolveConfiguration()),
                        new PrometheusRule().withRecord("stkiiuxhqyud")
                            .withAlert("rrqnbpoczvyifqrv")
                            .withEnabled(true)
                            .withExpression("jsllrmv")
                            .withSeverity(146352395)
                            .withForProperty("atkpnp")
                            .withLabels(mapOf("wiqzbqjvsovmyo", "xxbczwtr", "zdobpxjmflbvvnch", "acspkwl", "ajiwkuo",
                                "kcciwwzjuqkhr"))
                            .withAnnotations(mapOf("sauuimj", "kg", "rfbyaosvexcso", "vxieduugidyj", "vleggzfbuhfmvfax",
                                "pclhocohslk"))
                            .withActions(Arrays.asList(new PrometheusRuleGroupAction(), new PrometheusRuleGroupAction(),
                                new PrometheusRuleGroupAction()))
                            .withResolveConfiguration(new PrometheusRuleResolveConfiguration()))),
                new PrometheusRuleGroupResourceInner().withLocation("yuguosvmkfssx")
                    .withTags(mapOf("zkd", "kfplgmgsxnk", "i", "slpvlop"))
                    .withDescription("typmrbpizcdrqjsd")
                    .withEnabled(true)
                    .withClusterName("fyhxde")
                    .withScopes(Arrays.asList("jzicwifsjt", "gzfbishcbk", "ajdeyeamdphaga"))
                    .withInterval("buxwgip")
                    .withRules(Arrays.asList(
                        new PrometheusRule().withRecord("nowkgshw")
                            .withAlert("kix")
                            .withEnabled(false)
                            .withExpression("njeputtmrywn")
                            .withSeverity(1133422967)
                            .withForProperty("ftiyqzrnkcq")
                            .withLabels(mapOf("lsicohoqqnwv", "lwh", "yxzk", "ryavwhheunmmqh", "koklya", "noc"))
                            .withAnnotations(mapOf("zf", "onuq", "vjektcxsenh", "beypewrmjmw", "rzpwvlqdqgbiq", "lrsf",
                                "vf", "lihkaetcktvfc"))
                            .withActions(Arrays.asList(new PrometheusRuleGroupAction(), new PrometheusRuleGroupAction(),
                                new PrometheusRuleGroupAction(), new PrometheusRuleGroupAction()))
                            .withResolveConfiguration(new PrometheusRuleResolveConfiguration()),
                        new PrometheusRule().withRecord("uctqhjfbe")
                            .withAlert("jcxerfuwu")
                            .withEnabled(true)
                            .withExpression("xfvjrbirp")
                            .withSeverity(684290279)
                            .withForProperty("c")
                            .withLabels(mapOf("j", "hfnljkyq"))
                            .withAnnotations(mapOf("gidokgjljyoxgvcl", "j", "jhtxfvgxbfsmxne", "bgsncghkjeszzhb"))
                            .withActions(Arrays.asList(new PrometheusRuleGroupAction(), new PrometheusRuleGroupAction(),
                                new PrometheusRuleGroupAction()))
                            .withResolveConfiguration(new PrometheusRuleResolveConfiguration()),
                        new PrometheusRule().withRecord("cxgod")
                            .withAlert("fqkkr")
                            .withEnabled(true)
                            .withExpression("ukgri")
                            .withSeverity(390168051)
                            .withForProperty("lfbxzpuzycisp")
                            .withLabels(mapOf("y", "ahmgkbrp", "rgvtqag", "hibnuqqkpika", "bfs", "buynhijggm",
                                "rcvpnazzmhjrunmp", "arbu"))
                            .withAnnotations(
                                mapOf("skpbhenbtkcxywn", "dbhrbnlankxm", "qidybyx", "tnrsyn", "aaxdbabphlwrq", "zfcl"))
                            .withActions(Arrays.asList(new PrometheusRuleGroupAction(), new PrometheusRuleGroupAction(),
                                new PrometheusRuleGroupAction(), new PrometheusRuleGroupAction()))
                            .withResolveConfiguration(new PrometheusRuleResolveConfiguration()),
                        new PrometheusRule().withRecord("thsu")
                            .withAlert("cmnyyazttb")
                            .withEnabled(false)
                            .withExpression("rq")
                            .withSeverity(1833989004)
                            .withForProperty("ckzywbiexzfeyue")
                            .withLabels(mapOf("wbhqwal", "bxu"))
                            .withAnnotations(mapOf("pdkzjancuxr", "yoxa", "bavxbniwdjswzt", "d", "xbzpfzab",
                                "dbpgnxytxhp", "ovplw", "lcuhxwtctyqiklb"))
                            .withActions(Arrays.asList(new PrometheusRuleGroupAction(), new PrometheusRuleGroupAction(),
                                new PrometheusRuleGroupAction()))
                            .withResolveConfiguration(new PrometheusRuleResolveConfiguration())))));
        model = BinaryData.fromObject(model).toObject(PrometheusRuleGroupResourceCollection.class);
        Assertions.assertEquals("ithlvmezyvshxm", model.value().get(0).location());
        Assertions.assertEquals("bzoggigrx", model.value().get(0).tags().get("burvjxxjnspy"));
        Assertions.assertEquals("bowsk", model.value().get(0).description());
        Assertions.assertEquals(false, model.value().get(0).enabled());
        Assertions.assertEquals("tzlcuiywgqywgn", model.value().get(0).clusterName());
        Assertions.assertEquals("vynhzgpphrcg", model.value().get(0).scopes().get(0));
        Assertions.assertEquals("zevgb", model.value().get(0).interval());
        Assertions.assertEquals("qabcypm", model.value().get(0).rules().get(0).record());
        Assertions.assertEquals("kwlzuvccfwnfn", model.value().get(0).rules().get(0).alert());
        Assertions.assertEquals(false, model.value().get(0).rules().get(0).enabled());
        Assertions.assertEquals("fionl", model.value().get(0).rules().get(0).expression());
        Assertions.assertEquals(10134075, model.value().get(0).rules().get(0).severity());
        Assertions.assertEquals("tqgtzxdpnqbqq", model.value().get(0).rules().get(0).forProperty());
        Assertions.assertEquals("jfeallnwsub", model.value().get(0).rules().get(0).labels().get("snjampmng"));
        Assertions.assertEquals("asxazjpqyegualhb",
            model.value().get(0).rules().get(0).annotations().get("xhejjzzvdud"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
