# Release History

## 1.2.0-beta.1 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.1.0 (2024-12-11)

- Azure Resource Manager Managed Network Fabric client library for Java. This package contains Microsoft Azure SDK for Managed Network Fabric Management SDK. Self service experience for Azure Network Fabric API. Package tag package-2023-06-15. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### Serialization/Deserialization change

- `Jackson` is removed from dependency and no longer supported.

##### Migration Guide

If you are using `Jackson`/`ObjectMapper` for manual serialization/deserialization, configure your `ObjectMapper` for backward compatibility:
```java
objectMapper.registerModule(com.azure.core.serializer.json.jackson.JacksonJsonProvider.getJsonSerializableDatabindModule());
```

#### `models.PollingIntervalInSeconds` was modified

* `fromInt(int)` was removed

#### `models.NetworkFabric` was modified

* `upgrade(models.UpdateVersion)` was removed
* `upgrade(models.UpdateVersion,com.azure.core.util.Context)` was removed

#### `models.NetworkFabrics` was modified

* `upgrade(java.lang.String,java.lang.String,models.UpdateVersion)` was removed
* `upgrade(java.lang.String,java.lang.String,models.UpdateVersion,com.azure.core.util.Context)` was removed

### Features Added

* `models.UpgradeNetworkFabricProperties` was added

* `models.NetworkFabricUpgradeAction` was added

#### `models.AccessControlList` was modified

* `defaultAction()` was added

#### `models.AccessControlListPatchableProperties` was modified

* `defaultAction()` was added
* `withDefaultAction(models.CommunityActionTypes)` was added

#### `models.NetworkToNetworkInterconnect` was modified

* `systemData()` was added

#### `models.NetworkToNetworkInterconnectPatch` was modified

* `systemData()` was added
* `name()` was added
* `type()` was added
* `id()` was added

#### `models.NetworkFabricSku` was modified

* `systemData()` was added

#### `models.NetworkToNetworkInterconnectPropertiesOptionBLayer3Configuration` was modified

* `fabricAsn()` was added

#### `models.RoutePolicy` was modified

* `defaultAction()` was added

#### `models.ExternalNetworkPatch` was modified

* `withNetworkToNetworkInterconnectId(java.lang.String)` was added
* `networkToNetworkInterconnectId()` was added

#### `models.AccessControlList$Definition` was modified

* `withDefaultAction(models.CommunityActionTypes)` was added

#### `models.NetworkInterface` was modified

* `systemData()` was added

#### `models.ExternalNetwork$Update` was modified

* `withNetworkToNetworkInterconnectId(java.lang.String)` was added

#### `models.AccessControlList$Update` was modified

* `withDefaultAction(models.CommunityActionTypes)` was added

#### `models.NetworkDeviceSku` was modified

* `systemData()` was added

#### `models.PollingIntervalInSeconds` was modified

* `fromValue(java.lang.Integer)` was added
* `hashCode()` was added
* `toString()` was added
* `equals(java.lang.Object)` was added
* `getValue()` was added

#### `models.NetworkFabric` was modified

* `upgrade(models.UpgradeNetworkFabricProperties,com.azure.core.util.Context)` was added
* `upgrade(models.UpgradeNetworkFabricProperties)` was added

#### `models.ExternalNetwork` was modified

* `systemData()` was added

#### `models.InternalNetworkPropertiesBgpConfiguration` was modified

* `fabricAsn()` was added

#### `models.RoutePolicyPatch` was modified

* `withDefaultAction(models.CommunityActionTypes)` was added
* `defaultAction()` was added

#### `models.AccessControlListPatch` was modified

* `withDefaultAction(models.CommunityActionTypes)` was added
* `defaultAction()` was added

#### `models.RoutePolicy$Update` was modified

* `withDefaultAction(models.CommunityActionTypes)` was added

#### `models.ExternalNetwork$Definition` was modified

* `withNetworkToNetworkInterconnectId(java.lang.String)` was added

#### `models.NetworkFabric$Definition` was modified

* `withFabricVersion(java.lang.String)` was added

#### `models.NetworkFabrics` was modified

* `upgrade(java.lang.String,java.lang.String,models.UpgradeNetworkFabricProperties)` was added
* `upgrade(java.lang.String,java.lang.String,models.UpgradeNetworkFabricProperties,com.azure.core.util.Context)` was added

#### `models.ExternalNetworkPatchableProperties` was modified

* `networkToNetworkInterconnectId()` was added
* `withNetworkToNetworkInterconnectId(java.lang.String)` was added

#### `models.RoutePolicy$Definition` was modified

* `withDefaultAction(models.CommunityActionTypes)` was added

## 1.0.0 (2023-07-17)

- Azure Resource Manager Managed Network Fabric client library for Java. This package contains Microsoft Azure SDK for Managed Network Fabric Management SDK. Self service experience for Azure Network Fabric API. Package tag package-2023-06-15. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.NetworkRackRoleName` was removed

* `models.FabricBfdConfiguration` was removed

* `models.NetworkFabricPatchParameters` was removed

* `models.NetworkRackSkus` was removed

* `models.NetworkRackSku` was removed

* `models.GetDeviceStatusProperties` was removed

* `models.IsTestVersion` was removed

* `models.NetworkRackSkusListResult` was removed

* `models.OperationalStatus` was removed

* `models.OptionBPropertiesAutoGenerated` was removed

* `models.PowerCycleState` was removed

* `models.TerminalServerPatchParameters` was removed

* `models.ConditionActionType` was removed

* `models.Layer3OptionAProperties` was removed

* `models.UpdateVersionProperties` was removed

* `models.PowerEnd` was removed

* `models.IsCurrentVersion` was removed

* `models.AddressFamily` was removed

* `models.UpdatePowerCycleProperties` was removed

* `models.NetworkDeviceRoleProperties` was removed

* `models.AccessControlListConditionProperties` was removed

* `models.NetworkRackPatch` was removed

* `models.NetworkFabricControllerOperationalState` was removed

* `models.ArpProperties` was removed

* `models.GetDynamicInterfaceMapsPropertiesItem` was removed

* `models.NetworkFabricOperationalState` was removed

* `models.GetStaticInterfaceMapsPropertiesItem` was removed

* `models.State` was removed

* `models.WorkloadServices` was removed

* `models.NetworkDeviceRoleTypes` was removed

* `models.InfrastructureServices` was removed

* `models.InterfaceStatus` was removed

* `models.IpPrefixPropertiesIpPrefixRulesItem` was removed

* `models.DeviceLimits` was removed

* `models.SupportPackageProperties` was removed

* `models.L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy` was removed

* `models.NetworkDeviceRackRoleType` was removed

* `models.Layer3Configuration` was removed

* `models.EnabledDisabledState` was removed

* `models.ManagementNetworkConfiguration` was removed

#### `models.NetworkRack$DefinitionStages` was modified

* `withNetworkRackSku(java.lang.String)` was removed in stage 3

#### `models.IpExtendedCommunity$DefinitionStages` was modified

* Stage 3 was added

#### `models.NetworkFabric$DefinitionStages` was modified

* Stage 3, 4, 5, 6, 7, 8, 9 was added

#### `models.NetworkToNetworkInterconnect$DefinitionStages` was modified

* Stage 2 was added

#### `models.RoutePolicy$DefinitionStages` was modified

* `withStatements(java.util.List)` was removed in stage 3

#### `models.L3IsolationDomain$DefinitionStages` was modified

* Stage 3 was added

#### `models.L2IsolationDomain$DefinitionStages` was modified

* Stage 3, 4 was added

#### `models.AccessControlList` was modified

* `conditions()` was removed
* `addressFamily()` was removed

#### `models.NetworkFabricControllers` was modified

* `disableWorkloadManagementNetwork(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `enableWorkloadManagementNetwork(java.lang.String,java.lang.String)` was removed
* `enableWorkloadManagementNetwork(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `disableWorkloadManagementNetwork(java.lang.String,java.lang.String)` was removed

#### `models.InternalNetwork$Definition` was modified

* `withBgpConfiguration(models.BgpConfiguration)` was removed
* `withStaticRouteConfiguration(models.StaticRouteConfiguration)` was removed

#### `models.InternalNetworkPatchableProperties` was modified

* `withStaticRouteConfiguration(models.StaticRouteConfiguration)` was removed
* `withBgpConfiguration(models.BgpConfiguration)` was removed
* `staticRouteConfiguration()` was removed
* `bgpConfiguration()` was removed

#### `models.L2IsolationDomains` was modified

* `void updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState)` -> `models.CommonPostActionResponseForDeviceUpdate updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState)`
* `clearArpTable(java.lang.String,java.lang.String,models.EnableDisableOnResources)` was removed
* `clearNeighborTable(java.lang.String,java.lang.String,models.EnableDisableOnResources,com.azure.core.util.Context)` was removed
* `getArpEntries(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `clearNeighborTable(java.lang.String,java.lang.String,models.EnableDisableOnResources)` was removed
* `void updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForDeviceUpdate updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)`
* `getArpEntries(java.lang.String,java.lang.String)` was removed
* `clearArpTable(java.lang.String,java.lang.String,models.EnableDisableOnResources,com.azure.core.util.Context)` was removed

#### `models.L3IsolationDomainPatch` was modified

* `description()` was removed
* `withDescription(java.lang.String)` was removed
* `withConnectedSubnetRoutePolicy(models.L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy)` was removed
* `tags()` was removed
* `models.L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy connectedSubnetRoutePolicy()` -> `models.ConnectedSubnetRoutePolicy connectedSubnetRoutePolicy()`

#### `models.NetworkFabricControllerPatch` was modified

* `tags()` was removed

#### `models.NetworkToNetworkInterconnect` was modified

* `models.BooleanEnumProperty isManagementType()` -> `models.IsManagementType isManagementType()`
* `layer3Configuration()` was removed
* `models.EnabledDisabledState administrativeState()` -> `models.AdministrativeState administrativeState()`
* `systemData()` was removed

#### `models.NetworkFabricSku` was modified

* `maxSupportedVer()` was removed
* `detailsUri()` was removed
* `java.lang.String typePropertiesType()` -> `models.FabricSkuType typePropertiesType()`
* `minSupportedVer()` was removed
* `systemData()` was removed

#### `models.IpCommunity$Definition` was modified

* `withAction(models.CommunityActionTypes)` was removed
* `withCommunityMembers(java.util.List)` was removed
* `withWellKnownCommunities(java.util.List)` was removed

#### `models.L3IsolationDomain$Update` was modified

* `withConnectedSubnetRoutePolicy(models.L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy)` was removed
* `withDescription(java.lang.String)` was removed

#### `models.OptionAProperties` was modified

* `withSecondaryIpv4Prefix(java.lang.String)` was removed
* `java.lang.Integer peerAsn()` -> `java.lang.Long peerAsn()`
* `withBfdConfiguration(models.FabricBfdConfiguration)` was removed
* `withPrimaryIpv4Prefix(java.lang.String)` was removed
* `withPrimaryIpv6Prefix(java.lang.String)` was removed
* `withSecondaryIpv6Prefix(java.lang.String)` was removed
* `withPeerAsn(java.lang.Integer)` was removed
* `models.FabricBfdConfiguration bfdConfiguration()` -> `models.BfdConfiguration bfdConfiguration()`

#### `models.TerminalServerConfiguration` was modified

* `withPrimaryIpv4Prefix(java.lang.String)` was removed
* `password()` was removed
* `withSecondaryIpv4Prefix(java.lang.String)` was removed
* `username()` was removed
* `withPrimaryIpv6Prefix(java.lang.String)` was removed
* `serialNumber()` was removed
* `withSecondaryIpv6Prefix(java.lang.String)` was removed

#### `models.NetworkRack$Definition` was modified

* `withNetworkRackSku(java.lang.String)` was removed

#### `models.IpCommunity` was modified

* `wellKnownCommunities()` was removed
* `action()` was removed
* `communityMembers()` was removed

#### `models.IpExtendedCommunityPatch` was modified

* `tags()` was removed

#### `models.NetworkToNetworkInterconnect$Definition` was modified

* `withIsManagementType(models.BooleanEnumProperty)` was removed
* `withLayer3Configuration(models.Layer3Configuration)` was removed

#### `models.NetworkRack$Update` was modified

* `withProperties(java.lang.Object)` was removed

#### `models.ExternalNetworkPatch` was modified

* `withOptionAProperties(models.Layer3OptionAProperties)` was removed
* `models.OptionBProperties optionBProperties()` -> `models.L3OptionBProperties optionBProperties()`
* `withOptionBProperties(models.OptionBProperties)` was removed
* `models.Layer3OptionAProperties optionAProperties()` -> `models.ExternalNetworkPatchPropertiesOptionAProperties optionAProperties()`

#### `models.SupportedVersionProperties` was modified

* `isTest()` was removed
* `withIsTest(models.IsTestVersion)` was removed
* `withIsCurrent(models.IsCurrentVersion)` was removed
* `isCurrent()` was removed

#### `models.BgpConfiguration` was modified

* `withPeerAsn(int)` was removed
* `java.lang.Integer fabricAsn()` -> `java.lang.Long fabricAsn()`
* `int peerAsn()` -> `java.lang.Long peerAsn()`

#### `models.IpExtendedCommunity` was modified

* `routeTargets()` was removed
* `action()` was removed

#### `models.IpPrefixPatch` was modified

* `tags()` was removed

#### `models.AccessControlList$Definition` was modified

* `withAddressFamily(models.AddressFamily)` was removed
* `withConditions(java.util.List)` was removed

#### `models.NetworkInterface` was modified

* `systemData()` was removed
* `getStatus(com.azure.core.util.Context)` was removed
* `getStatus()` was removed
* `void updateAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForStateUpdate updateAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)`
* `void updateAdministrativeState(models.UpdateAdministrativeState)` -> `models.CommonPostActionResponseForStateUpdate updateAdministrativeState(models.UpdateAdministrativeState)`
* `models.EnabledDisabledState administrativeState()` -> `models.AdministrativeState administrativeState()`

#### `ManagedNetworkFabricManager` was modified

* `networkRackSkus()` was removed

#### `models.ExternalNetworks` was modified

* `clearArpEntries(java.lang.String,java.lang.String,java.lang.String,models.EnableDisableOnResources,com.azure.core.util.Context)` was removed
* `updateBfdForBgpAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` was removed
* `list(java.lang.String,java.lang.String)` was removed
* `updateBfdForBgpAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)` was removed
* `updateBgpAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` was removed
* `clearArpEntries(java.lang.String,java.lang.String,java.lang.String,models.EnableDisableOnResources)` was removed
* `void updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)` -> `models.CommonPostActionResponseForStateUpdate updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)`
* `updateBgpAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)` was removed
* `clearIpv6Neighbors(java.lang.String,java.lang.String,java.lang.String,models.EnableDisableOnResources)` was removed
* `clearIpv6Neighbors(java.lang.String,java.lang.String,java.lang.String,models.EnableDisableOnResources,com.azure.core.util.Context)` was removed
* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `void updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForStateUpdate updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)`

#### `models.ExternalNetwork$Update` was modified

* `withOptionBProperties(models.OptionBProperties)` was removed
* `withOptionAProperties(models.Layer3OptionAProperties)` was removed

#### `models.L3IsolationDomain$Definition` was modified

* `withConnectedSubnetRoutePolicy(models.L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy)` was removed
* `withDescription(java.lang.String)` was removed

#### `models.L3IsolationDomain` was modified

* `clearArpTable(models.EnableDisableOnResources,com.azure.core.util.Context)` was removed
* `clearArpTable(models.EnableDisableOnResources)` was removed
* `optionBDisabledOnResources()` was removed
* `clearNeighborTable(models.EnableDisableOnResources,com.azure.core.util.Context)` was removed
* `models.EnabledDisabledState administrativeState()` -> `models.AdministrativeState administrativeState()`
* `void updateAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForDeviceUpdate updateAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)`
* `models.L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy connectedSubnetRoutePolicy()` -> `models.ConnectedSubnetRoutePolicy connectedSubnetRoutePolicy()`
* `disabledOnResources()` was removed
* `updateOptionBAdministrativeState(models.UpdateAdministrativeState)` was removed
* `clearNeighborTable(models.EnableDisableOnResources)` was removed
* `void updateAdministrativeState(models.UpdateAdministrativeState)` -> `models.CommonPostActionResponseForDeviceUpdate updateAdministrativeState(models.UpdateAdministrativeState)`
* `description()` was removed
* `updateOptionBAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` was removed

#### `models.StatementActionProperties` was modified

* `models.CommunityActionTypes actionType()` -> `models.RoutePolicyActionType actionType()`
* `withActionType(models.CommunityActionTypes)` was removed

#### `models.NeighborAddress` was modified

* `operationalState()` was removed

#### `models.AccessControlList$Update` was modified

* `withAddressFamily(models.AddressFamily)` was removed
* `withConditions(java.util.List)` was removed

#### `models.NetworkDeviceSku` was modified

* `systemData()` was removed
* `limits()` was removed

#### `models.InternalNetworks` was modified

* `clearArpEntries(java.lang.String,java.lang.String,java.lang.String,models.EnableDisableOnResources)` was removed
* `list(java.lang.String,java.lang.String)` was removed
* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `updateBfdForStaticRouteAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)` was removed
* `void updateBgpAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)` -> `models.CommonPostActionResponseForStateUpdate updateBgpAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)`
* `updateBfdForBgpAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` was removed
* `clearIpv6Neighbors(java.lang.String,java.lang.String,java.lang.String,models.EnableDisableOnResources,com.azure.core.util.Context)` was removed
* `updateBfdForStaticRouteAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` was removed
* `clearIpv6Neighbors(java.lang.String,java.lang.String,java.lang.String,models.EnableDisableOnResources)` was removed
* `void updateBgpAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForStateUpdate updateBgpAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)`
* `clearArpEntries(java.lang.String,java.lang.String,java.lang.String,models.EnableDisableOnResources,com.azure.core.util.Context)` was removed
* `void updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForStateUpdate updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)`
* `updateBfdForBgpAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)` was removed
* `void updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)` -> `models.CommonPostActionResponseForStateUpdate updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)`

#### `models.ExternalNetworkPropertiesOptionAProperties` was modified

* `withMtu(java.lang.Integer)` was removed
* `models.Layer3OptionAProperties withSecondaryIpv4Prefix(java.lang.String)` -> `models.Layer3IpPrefixProperties withSecondaryIpv4Prefix(java.lang.String)`
* `models.Layer3OptionAProperties withPrimaryIpv4Prefix(java.lang.String)` -> `models.Layer3IpPrefixProperties withPrimaryIpv4Prefix(java.lang.String)`
* `models.Layer3OptionAProperties withPrimaryIpv6Prefix(java.lang.String)` -> `models.Layer3IpPrefixProperties withPrimaryIpv6Prefix(java.lang.String)`
* `withPrimaryIpv6Prefix(java.lang.String)` was removed
* `withVlanId(java.lang.Integer)` was removed
* `withPeerAsn(java.lang.Integer)` was removed
* `models.Layer3OptionAProperties withSecondaryIpv6Prefix(java.lang.String)` -> `models.Layer3IpPrefixProperties withSecondaryIpv6Prefix(java.lang.String)`
* `withSecondaryIpv6Prefix(java.lang.String)` was removed
* `withBfdConfiguration(models.BfdConfiguration)` was removed
* `withPrimaryIpv4Prefix(java.lang.String)` was removed
* `withSecondaryIpv4Prefix(java.lang.String)` was removed

#### `models.L2IsolationDomain` was modified

* `void updateAdministrativeState(models.UpdateAdministrativeState)` -> `models.CommonPostActionResponseForDeviceUpdate updateAdministrativeState(models.UpdateAdministrativeState)`
* `clearArpTable(models.EnableDisableOnResources)` was removed
* `models.EnabledDisabledState administrativeState()` -> `models.AdministrativeState administrativeState()`
* `getArpEntries(com.azure.core.util.Context)` was removed
* `clearNeighborTable(models.EnableDisableOnResources)` was removed
* `void updateAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForDeviceUpdate updateAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)`
* `getArpEntries()` was removed
* `clearArpTable(models.EnableDisableOnResources,com.azure.core.util.Context)` was removed
* `disabledOnResources()` was removed
* `clearNeighborTable(models.EnableDisableOnResources,com.azure.core.util.Context)` was removed

#### `models.AccessControlLists` was modified

* `com.azure.core.http.rest.Response deleteByIdWithResponse(java.lang.String,com.azure.core.util.Context)` -> `void deleteByIdWithResponse(java.lang.String,com.azure.core.util.Context)`
* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.NetworkDevices` was modified

* `updatePowerCycle(java.lang.String,java.lang.String,models.UpdatePowerCycleProperties)` was removed
* `updateVersion(java.lang.String,java.lang.String,models.UpdateVersionProperties,com.azure.core.util.Context)` was removed
* `reboot(java.lang.String,java.lang.String)` was removed
* `restoreConfig(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `updatePowerCycle(java.lang.String,java.lang.String,models.UpdatePowerCycleProperties,com.azure.core.util.Context)` was removed
* `getStaticInterfaceMaps(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getDynamicInterfaceMaps(java.lang.String,java.lang.String)` was removed
* `generateSupportPackage(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getDynamicInterfaceMaps(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `generateSupportPackage(java.lang.String,java.lang.String)` was removed
* `restoreConfig(java.lang.String,java.lang.String)` was removed
* `updateVersion(java.lang.String,java.lang.String,models.UpdateVersionProperties)` was removed
* `getStaticInterfaceMaps(java.lang.String,java.lang.String)` was removed
* `getStatus(java.lang.String,java.lang.String)` was removed
* `getStatus(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `reboot(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.NetworkFabric` was modified

* `void provision()` -> `models.CommonPostActionResponseForDeviceUpdate provision()`
* `int fabricAsn()` -> `long fabricAsn()`
* `void provision(com.azure.core.util.Context)` -> `models.CommonPostActionResponseForDeviceUpdate provision(com.azure.core.util.Context)`
* `operationalState()` was removed
* `void deprovision(com.azure.core.util.Context)` -> `models.CommonPostActionResponseForDeviceUpdate deprovision(com.azure.core.util.Context)`
* `models.ManagementNetworkConfiguration managementNetworkConfiguration()` -> `models.ManagementNetworkConfigurationProperties managementNetworkConfiguration()`
* `int rackCount()` -> `java.lang.Integer rackCount()`
* `routerId()` was removed
* `void deprovision()` -> `models.CommonPostActionResponseForDeviceUpdate deprovision()`

#### `models.ExternalNetwork` was modified

* `models.OptionBProperties optionBProperties()` -> `models.L3OptionBProperties optionBProperties()`
* `void updateAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForStateUpdate updateAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)`
* `updateBgpAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` was removed
* `clearIpv6Neighbors(models.EnableDisableOnResources)` was removed
* `clearArpEntries(models.EnableDisableOnResources)` was removed
* `updateBgpAdministrativeState(models.UpdateAdministrativeState)` was removed
* `updateBfdForBgpAdministrativeState(models.UpdateAdministrativeState)` was removed
* `clearIpv6Neighbors(models.EnableDisableOnResources,com.azure.core.util.Context)` was removed
* `disabledOnResources()` was removed
* `systemData()` was removed
* `models.EnabledDisabledState administrativeState()` -> `models.AdministrativeState administrativeState()`
* `updateBfdForBgpAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` was removed
* `void updateAdministrativeState(models.UpdateAdministrativeState)` -> `models.CommonPostActionResponseForStateUpdate updateAdministrativeState(models.UpdateAdministrativeState)`
* `clearArpEntries(models.EnableDisableOnResources,com.azure.core.util.Context)` was removed

#### `models.NetworkFabric$Update` was modified

* `withTerminalServerConfiguration(models.TerminalServerPatchableProperties)` was removed

#### `models.NetworkDevicePatchParameters` was modified

* `tags()` was removed

#### `models.L3IsolationDomains` was modified

* `clearNeighborTable(java.lang.String,java.lang.String,models.EnableDisableOnResources)` was removed
* `void updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForDeviceUpdate updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)`
* `updateOptionBAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` was removed
* `clearArpTable(java.lang.String,java.lang.String,models.EnableDisableOnResources,com.azure.core.util.Context)` was removed
* `clearNeighborTable(java.lang.String,java.lang.String,models.EnableDisableOnResources,com.azure.core.util.Context)` was removed
* `updateOptionBAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState)` was removed
* `void updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState)` -> `models.CommonPostActionResponseForDeviceUpdate updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState)`
* `clearArpTable(java.lang.String,java.lang.String,models.EnableDisableOnResources)` was removed

#### `models.NetworkToNetworkInterconnects` was modified

* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `list(java.lang.String,java.lang.String)` was removed

#### `models.RoutePolicyPatch` was modified

* `tags()` was removed

#### `models.AccessControlListPatch` was modified

* `withConditions(java.util.List)` was removed
* `addressFamily()` was removed
* `withAddressFamily(models.AddressFamily)` was removed
* `conditions()` was removed
* `tags()` was removed

#### `models.InternalNetwork` was modified

* `void updateBgpAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForStateUpdate updateBgpAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)`
* `bfdDisabledOnResources()` was removed
* `bgpDisabledOnResources()` was removed
* `bfdForStaticRoutesDisabledOnResources()` was removed
* `clearArpEntries(models.EnableDisableOnResources,com.azure.core.util.Context)` was removed
* `updateBfdForBgpAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` was removed
* `void updateAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForStateUpdate updateAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)`
* `updateBfdForBgpAdministrativeState(models.UpdateAdministrativeState)` was removed
* `clearIpv6Neighbors(models.EnableDisableOnResources)` was removed
* `disabledOnResources()` was removed
* `models.StaticRouteConfiguration staticRouteConfiguration()` -> `models.InternalNetworkPropertiesStaticRouteConfiguration staticRouteConfiguration()`
* `updateBfdForStaticRouteAdministrativeState(models.UpdateAdministrativeState)` was removed
* `clearIpv6Neighbors(models.EnableDisableOnResources,com.azure.core.util.Context)` was removed
* `void updateBgpAdministrativeState(models.UpdateAdministrativeState)` -> `models.CommonPostActionResponseForStateUpdate updateBgpAdministrativeState(models.UpdateAdministrativeState)`
* `void updateAdministrativeState(models.UpdateAdministrativeState)` -> `models.CommonPostActionResponseForStateUpdate updateAdministrativeState(models.UpdateAdministrativeState)`
* `models.EnabledDisabledState administrativeState()` -> `models.AdministrativeState administrativeState()`
* `models.BgpConfiguration bgpConfiguration()` -> `models.InternalNetworkPropertiesBgpConfiguration bgpConfiguration()`
* `clearArpEntries(models.EnableDisableOnResources)` was removed
* `updateBfdForStaticRouteAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` was removed

#### `models.NetworkFabricPatchableProperties` was modified

* `l3IsolationDomains()` was removed
* `l2IsolationDomains()` was removed
* `racks()` was removed

#### `models.IpExtendedCommunity$Definition` was modified

* `withAction(models.CommunityActionTypes)` was removed
* `withRouteTargets(java.util.List)` was removed

#### `models.NetworkRack` was modified

* `networkRackSku()` was removed

#### `models.ExternalNetwork$Definition` was modified

* `withOptionBProperties(models.OptionBProperties)` was removed

#### `models.NetworkDevice$Definition` was modified

* `withNetworkDeviceRole(models.NetworkDeviceRoleTypes)` was removed

#### `models.Layer2Configuration` was modified

* `withPortCount(java.lang.Integer)` was removed
* `withMtu(int)` was removed
* `portCount()` was removed
* `int mtu()` -> `java.lang.Integer mtu()`

#### `models.L2IsolationDomainPatch` was modified

* `tags()` was removed

#### `models.NetworkFabric$Definition` was modified

* `withRackCount(int)` was removed
* `withManagementNetworkConfiguration(models.ManagementNetworkConfiguration)` was removed
* `withFabricAsn(int)` was removed

#### `models.NetworkFabrics` was modified

* `void deprovision(java.lang.String,java.lang.String)` -> `models.CommonPostActionResponseForDeviceUpdate deprovision(java.lang.String,java.lang.String)`
* `void provision(java.lang.String,java.lang.String)` -> `models.CommonPostActionResponseForDeviceUpdate provision(java.lang.String,java.lang.String)`
* `void provision(java.lang.String,java.lang.String,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForDeviceUpdate provision(java.lang.String,java.lang.String,com.azure.core.util.Context)`
* `void deprovision(java.lang.String,java.lang.String,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForDeviceUpdate deprovision(java.lang.String,java.lang.String,com.azure.core.util.Context)`

#### `models.NetworkDevice` was modified

* `reboot()` was removed
* `getStaticInterfaceMaps()` was removed
* `getStatus(com.azure.core.util.Context)` was removed
* `models.NetworkDeviceRoleTypes networkDeviceRole()` -> `models.NetworkDeviceRole networkDeviceRole()`
* `reboot(com.azure.core.util.Context)` was removed
* `updatePowerCycle(models.UpdatePowerCycleProperties,com.azure.core.util.Context)` was removed
* `getStatus()` was removed
* `updateVersion(models.UpdateVersionProperties,com.azure.core.util.Context)` was removed
* `generateSupportPackage(com.azure.core.util.Context)` was removed
* `getStaticInterfaceMaps(com.azure.core.util.Context)` was removed
* `getDynamicInterfaceMaps(com.azure.core.util.Context)` was removed
* `restoreConfig(com.azure.core.util.Context)` was removed
* `getDynamicInterfaceMaps()` was removed
* `updateVersion(models.UpdateVersionProperties)` was removed
* `restoreConfig()` was removed
* `generateSupportPackage()` was removed
* `updatePowerCycle(models.UpdatePowerCycleProperties)` was removed

#### `models.NetworkFabricController` was modified

* `operationalState()` was removed
* `disableWorkloadManagementNetwork()` was removed
* `enableWorkloadManagementNetwork(com.azure.core.util.Context)` was removed
* `models.InfrastructureServices infrastructureServices()` -> `models.ControllerServices infrastructureServices()`
* `models.WorkloadServices workloadServices()` -> `models.ControllerServices workloadServices()`
* `enableWorkloadManagementNetwork()` was removed
* `disableWorkloadManagementNetwork(com.azure.core.util.Context)` was removed

#### `models.BfdConfiguration` was modified

* `models.EnabledDisabledState administrativeState()` -> `models.BfdAdministrativeState administrativeState()`
* `interval()` was removed

#### `models.IpCommunityPatch` was modified

* `tags()` was removed

#### `models.ExternalNetworkPatchableProperties` was modified

* `withPeeringOption(models.PeeringOption)` was removed
* `peeringOption()` was removed
* `optionAProperties()` was removed
* `withOptionAProperties(models.Layer3OptionAProperties)` was removed
* `optionBProperties()` was removed
* `withOptionBProperties(models.OptionBProperties)` was removed

#### `models.NetworkInterfaces` was modified

* `getStatus(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `void updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)` -> `models.CommonPostActionResponseForStateUpdate updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)`
* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getStatus(java.lang.String,java.lang.String,java.lang.String)` was removed
* `list(java.lang.String,java.lang.String)` was removed
* `void updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` -> `models.CommonPostActionResponseForStateUpdate updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)`

#### `models.UpdateAdministrativeState` was modified

* `models.AdministrativeState state()` -> `models.EnableDisableState state()`
* `withState(models.AdministrativeState)` was removed

#### `models.VpnConfigurationProperties` was modified

* `models.OptionBPropertiesAutoGenerated optionBProperties()` -> `models.OptionBProperties optionBProperties()`
* `models.OptionAProperties optionAProperties()` -> `models.VpnConfigurationPropertiesOptionAProperties optionAProperties()`
* `withOptionAProperties(models.OptionAProperties)` was removed
* `models.EnabledDisabledState administrativeState()` -> `models.AdministrativeState administrativeState()`
* `withOptionBProperties(models.OptionBPropertiesAutoGenerated)` was removed

### Features Added

* `models.UpdateDeviceAdministrativeState` was added

* `models.NetworkRackType` was added

* `models.NetworkPacketBrokersListResult` was added

* `models.InternetGatewayRule$Update` was added

* `models.ImportRoutePolicyInformation` was added

* `models.RebootType` was added

* `models.AccessControlListPatchableProperties` was added

* `models.NetworkTap$Update` was added

* `models.ExportRoutePolicyInformation` was added

* `models.NetworkTapRules` was added

* `models.NetworkTapRule` was added

* `models.NetworkToNetworkInterconnectPatch` was added

* `models.NetworkTapRuleAction` was added

* `models.NeighborGroups` was added

* `models.IpGroupProperties` was added

* `models.NpbStaticRouteConfiguration` was added

* `models.IsMonitoringEnabled` was added

* `models.NetworkToNetworkInterconnectPropertiesOptionBLayer3Configuration` was added

* `models.NetworkPacketBroker$Definition` was added

* `models.DestinationProperties` was added

* `models.GatewayType` was added

* `models.ConnectedSubnetRoutePolicy` was added

* `models.NeighborGroupPatchableProperties` was added

* `models.NetworkTapRuleMatchCondition` was added

* `models.RebootProperties` was added

* `models.NetworkToNetworkInterconnect$UpdateStages` was added

* `models.L3OptionAProperties` was added

* `models.VlanGroupProperties` was added

* `models.TagsUpdate` was added

* `models.VpnConfigurationPatchableProperties` was added

* `models.NetworkTap$Definition` was added

* `models.VpnConfigurationPatchablePropertiesOptionAProperties` was added

* `models.NetworkFabricPatch` was added

* `models.AccessControlListPortCondition` was added

* `models.CommonPostActionResponseForStateUpdate` was added

* `models.PollingType` was added

* `models.IpPrefixRule` was added

* `models.EncapsulationType` was added

* `models.ExtensionEnumProperty` was added

* `models.NetworkTapPropertiesDestinationsItem` was added

* `models.InternetGateway$DefinitionStages` was added

* `models.NeighborGroup$Update` was added

* `models.VpnConfigurationPropertiesOptionAProperties` was added

* `models.Encapsulation` was added

* `models.InternetGatewayRulePatch` was added

* `models.Action` was added

* `models.IpAddressType` was added

* `models.FabricSkuType` was added

* `models.NetworkFabricPatchablePropertiesTerminalServerConfiguration` was added

* `models.NetworkTaps` was added

* `models.PortGroupProperties` was added

* `models.BfdAdministrativeState` was added

* `models.IsolationDomainProperties` was added

* `models.NetworkPacketBroker$DefinitionStages` was added

* `models.Layer4Protocol` was added

* `models.VlanMatchCondition` was added

* `models.NeighborGroup$Definition` was added

* `models.PortCondition` was added

* `models.ControllerServices` was added

* `models.ValidateConfigurationResponse` was added

* `models.RoutePolicyConditionType` was added

* `models.NetworkTapRuleMatchConfiguration` was added

* `models.InternetGateway$UpdateStages` was added

* `models.NeighborGroupsListResult` was added

* `models.InternetGatewayRule$UpdateStages` was added

* `models.AccessControlListMatchCondition` was added

* `models.NetworkTapRulePatchableProperties` was added

* `models.IsWorkloadManagementNetworkEnabled` was added

* `models.PrefixType` was added

* `models.PollingIntervalInSeconds` was added

* `models.InternetGatewayRulesListResult` was added

* `models.ManagementNetworkConfigurationPatchableProperties` was added

* `models.NetworkTapRule$Definition` was added

* `models.TapRuleActionType` was added

* `models.SourceDestinationType` was added

* `models.IpCommunityRule` was added

* `models.L3OptionBProperties` was added

* `models.InternetGatewayRule$Definition` was added

* `models.CommonMatchConditions` was added

* `models.NfcSku` was added

* `models.NetworkTapRule$Update` was added

* `models.ValidateAction` was added

* `models.UpdateVersion` was added

* `models.InternetGateways` was added

* `models.NetworkTapRulesListResult` was added

* `models.IpPrefixPatchableProperties` was added

* `models.L3IsolationDomainPatchableProperties` was added

* `models.InternetGatewaysListResult` was added

* `models.NetworkToNetworkInterconnect$Update` was added

* `models.ConfigurationState` was added

* `models.L3ExportRoutePolicy` was added

* `models.NetworkDeviceRole` was added

* `models.InternetGateway$Definition` was added

* `models.RuleProperties` was added

* `models.ManagementNetworkConfigurationProperties` was added

* `models.NetworkPacketBroker$UpdateStages` was added

* `models.NeighborGroup$UpdateStages` was added

* `models.DeviceAdministrativeState` was added

* `models.NetworkTapRule$DefinitionStages` was added

* `models.NetworkTap` was added

* `models.ExportRoutePolicy` was added

* `models.NeighborGroup` was added

* `models.InternalNetworkPropertiesBgpConfiguration` was added

* `models.InternetGateway` was added

* `models.AccessControlListMatchConfiguration` was added

* `models.Extension` was added

* `models.NetworkTap$DefinitionStages` was added

* `models.AclActionType` was added

* `models.NetworkTap$UpdateStages` was added

* `models.InternalNetworkPropertiesStaticRouteConfiguration` was added

* `models.CommonDynamicMatchConfiguration` was added

* `models.EnableDisableState` was added

* `models.RoutePolicyActionType` was added

* `models.NeighborGroupPatch` was added

* `models.InternetGatewayRules` was added

* `models.NeighborGroupDestination` was added

* `models.InternetGateway$Update` was added

* `models.ValidateConfigurationProperties` was added

* `models.NetworkTapPatchableParametersDestinationsItem` was added

* `models.NetworkPacketBrokers` was added

* `models.RouteTargetInformation` was added

* `models.DestinationType` was added

* `models.NeighborGroup$DefinitionStages` was added

* `models.InternetGatewayRule` was added

* `models.NetworkPacketBrokerPatch` was added

* `models.ImportRoutePolicy` was added

* `models.InternetGatewayRule$DefinitionStages` was added

* `models.NetworkPacketBroker` was added

* `models.IpExtendedCommunityRule` was added

* `models.ExternalNetworkPatchPropertiesOptionAProperties` was added

* `models.NetworkPacketBroker$Update` was added

* `models.ConfigurationType` was added

* `models.AccessControlListAction` was added

* `models.IpExtendedCommunityPatchableProperties` was added

* `models.NetworkTapRulePatch` was added

* `models.CommonPostActionResponseForDeviceUpdate` was added

* `models.NetworkTapPatch` was added

* `models.AddressFamilyType` was added

* `models.IsManagementType` was added

* `models.PortType` was added

* `models.NetworkTapsListResult` was added

* `models.InternetGatewayPatch` was added

* `models.NetworkTapRule$UpdateStages` was added

* `models.OptionBLayer3Configuration` was added

* `models.IpMatchCondition` was added

#### `models.AccessControlList` was modified

* `aclsUrl()` was added
* `dynamicMatchConfigurations()` was added
* `validateConfiguration(com.azure.core.util.Context)` was added
* `resync()` was added
* `updateAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `configurationState()` was added
* `administrativeState()` was added
* `lastSyncedTime()` was added
* `matchConfigurations()` was added
* `updateAdministrativeState(models.UpdateAdministrativeState)` was added
* `validateConfiguration()` was added
* `configurationType()` was added
* `resync(com.azure.core.util.Context)` was added

#### `models.InternalNetwork$Definition` was modified

* `withBgpConfiguration(models.InternalNetworkPropertiesBgpConfiguration)` was added
* `withExtension(models.Extension)` was added
* `withEgressAclId(java.lang.String)` was added
* `withIngressAclId(java.lang.String)` was added
* `withStaticRouteConfiguration(models.InternalNetworkPropertiesStaticRouteConfiguration)` was added
* `withIsMonitoringEnabled(models.IsMonitoringEnabled)` was added
* `withExportRoutePolicy(models.ExportRoutePolicy)` was added
* `withImportRoutePolicy(models.ImportRoutePolicy)` was added

#### `models.InternalNetworkPatchableProperties` was modified

* `withIngressAclId(java.lang.String)` was added
* `importRoutePolicy()` was added
* `withEgressAclId(java.lang.String)` was added
* `isMonitoringEnabled()` was added
* `ingressAclId()` was added
* `withIsMonitoringEnabled(models.IsMonitoringEnabled)` was added
* `withExportRoutePolicy(models.ExportRoutePolicy)` was added
* `egressAclId()` was added
* `exportRoutePolicy()` was added
* `withImportRoutePolicy(models.ImportRoutePolicy)` was added

#### `models.IpPrefix$Update` was modified

* `withIpPrefixRules(java.util.List)` was added
* `withAnnotation(java.lang.String)` was added

#### `models.L2IsolationDomains` was modified

* `validateConfiguration(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `validateConfiguration(java.lang.String,java.lang.String)` was added
* `commitConfiguration(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `commitConfiguration(java.lang.String,java.lang.String)` was added

#### `models.L3IsolationDomainPatch` was modified

* `withConnectedSubnetRoutePolicy(models.ConnectedSubnetRoutePolicy)` was added
* `withAnnotation(java.lang.String)` was added
* `withTags(java.util.Map)` was added
* `annotation()` was added

#### `models.NetworkFabricControllerPatch` was modified

* `withTags(java.util.Map)` was added

#### `models.NetworkToNetworkInterconnect` was modified

* `npbStaticRouteConfiguration()` was added
* `resourceGroupName()` was added
* `updateAdministrativeState(models.UpdateAdministrativeState)` was added
* `updateNpbStaticRouteBfdAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `ingressAclId()` was added
* `importRoutePolicy()` was added
* `optionBLayer3Configuration()` was added
* `updateNpbStaticRouteBfdAdministrativeState(models.UpdateAdministrativeState)` was added
* `exportRoutePolicy()` was added
* `configurationState()` was added
* `egressAclId()` was added
* `updateAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `update()` was added

#### `models.NetworkFabricSku` was modified

* `details()` was added
* `maximumServerCount()` was added
* `supportedVersions()` was added

#### `models.IpCommunity$Definition` was modified

* `withIpCommunityRules(java.util.List)` was added

#### `models.L3IsolationDomain$Update` was modified

* `withConnectedSubnetRoutePolicy(models.ConnectedSubnetRoutePolicy)` was added
* `withAnnotation(java.lang.String)` was added

#### `models.OptionAProperties` was modified

* `withPeerAsn(java.lang.Long)` was added
* `withBfdConfiguration(models.BfdConfiguration)` was added

#### `models.TerminalServerConfiguration` was modified

* `primaryIpv6Prefix()` was added
* `withPassword(java.lang.String)` was added
* `withSerialNumber(java.lang.String)` was added
* `withUsername(java.lang.String)` was added
* `secondaryIpv6Prefix()` was added
* `secondaryIpv4Prefix()` was added
* `primaryIpv4Prefix()` was added

#### `models.NetworkRack$Definition` was modified

* `withNetworkRackType(models.NetworkRackType)` was added

#### `models.IpCommunity` was modified

* `ipCommunityRules()` was added
* `configurationState()` was added
* `administrativeState()` was added

#### `models.IpExtendedCommunityPatch` was modified

* `withAnnotation(java.lang.String)` was added
* `ipExtendedCommunityRules()` was added
* `withTags(java.util.Map)` was added
* `withIpExtendedCommunityRules(java.util.List)` was added
* `annotation()` was added

#### `models.RoutePolicy` was modified

* `networkFabricId()` was added
* `commitConfiguration()` was added
* `updateAdministrativeState(models.UpdateAdministrativeState)` was added
* `updateAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `administrativeState()` was added
* `addressFamilyType()` was added
* `commitConfiguration(com.azure.core.util.Context)` was added
* `configurationState()` was added
* `validateConfiguration()` was added
* `validateConfiguration(com.azure.core.util.Context)` was added

#### `models.NetworkToNetworkInterconnect$Definition` was modified

* `withNpbStaticRouteConfiguration(models.NpbStaticRouteConfiguration)` was added
* `withOptionBLayer3Configuration(models.NetworkToNetworkInterconnectPropertiesOptionBLayer3Configuration)` was added
* `withEgressAclId(java.lang.String)` was added
* `withIsManagementType(models.IsManagementType)` was added
* `withExportRoutePolicy(models.ExportRoutePolicyInformation)` was added
* `withImportRoutePolicy(models.ImportRoutePolicyInformation)` was added
* `withIngressAclId(java.lang.String)` was added

#### `models.ExternalNetworkPatch` was modified

* `withOptionAProperties(models.ExternalNetworkPatchPropertiesOptionAProperties)` was added
* `importRoutePolicy()` was added
* `withOptionBProperties(models.L3OptionBProperties)` was added
* `exportRoutePolicy()` was added
* `withExportRoutePolicy(models.ExportRoutePolicy)` was added
* `withImportRoutePolicy(models.ImportRoutePolicy)` was added

#### `models.SupportedVersionProperties` was modified

* `withIsDefault(models.BooleanEnumProperty)` was added
* `isDefault()` was added

#### `models.BgpConfiguration` was modified

* `withPeerAsn(java.lang.Long)` was added

#### `models.IpExtendedCommunity` was modified

* `ipExtendedCommunityRules()` was added
* `administrativeState()` was added
* `configurationState()` was added

#### `models.RoutePolicies` was modified

* `commitConfiguration(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `validateConfiguration(java.lang.String,java.lang.String)` was added
* `validateConfiguration(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState)` was added
* `commitConfiguration(java.lang.String,java.lang.String)` was added

#### `models.IpPrefixPatch` was modified

* `withAnnotation(java.lang.String)` was added
* `annotation()` was added
* `withTags(java.util.Map)` was added
* `ipPrefixRules()` was added
* `withIpPrefixRules(java.util.List)` was added

#### `models.AccessControlList$Definition` was modified

* `withAclsUrl(java.lang.String)` was added
* `withConfigurationType(models.ConfigurationType)` was added
* `withMatchConfigurations(java.util.List)` was added
* `withDynamicMatchConfigurations(java.util.List)` was added

#### `ManagedNetworkFabricManager` was modified

* `networkPacketBrokers()` was added
* `internetGatewayRules()` was added
* `neighborGroups()` was added
* `networkTapRules()` was added
* `internetGateways()` was added
* `networkTaps()` was added

#### `models.ExternalNetworks` was modified

* `listByL3IsolationDomain(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `updateStaticRouteBfdAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)` was added
* `updateStaticRouteBfdAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `listByL3IsolationDomain(java.lang.String,java.lang.String)` was added

#### `models.ExternalNetwork$Update` was modified

* `withExportRoutePolicy(models.ExportRoutePolicy)` was added
* `withOptionAProperties(models.ExternalNetworkPatchPropertiesOptionAProperties)` was added
* `withImportRoutePolicy(models.ImportRoutePolicy)` was added
* `withOptionBProperties(models.L3OptionBProperties)` was added

#### `models.L3IsolationDomain$Definition` was modified

* `withConnectedSubnetRoutePolicy(models.ConnectedSubnetRoutePolicy)` was added

#### `models.L3IsolationDomain` was modified

* `validateConfiguration()` was added
* `commitConfiguration(com.azure.core.util.Context)` was added
* `validateConfiguration(com.azure.core.util.Context)` was added
* `configurationState()` was added
* `commitConfiguration()` was added

#### `models.StatementActionProperties` was modified

* `withActionType(models.RoutePolicyActionType)` was added

#### `models.NeighborAddress` was modified

* `configurationState()` was added

#### `models.AccessControlList$Update` was modified

* `withDynamicMatchConfigurations(java.util.List)` was added
* `withConfigurationType(models.ConfigurationType)` was added
* `withAclsUrl(java.lang.String)` was added
* `withMatchConfigurations(java.util.List)` was added

#### `models.InternalNetworks` was modified

* `updateStaticRouteBfdAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)` was added
* `updateStaticRouteBfdAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `listByL3IsolationDomain(java.lang.String,java.lang.String)` was added
* `listByL3IsolationDomain(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.ExternalNetworkPropertiesOptionAProperties` was modified

* `peerAsn()` was added
* `withEgressAclId(java.lang.String)` was added
* `fabricAsn()` was added
* `ingressAclId()` was added
* `egressAclId()` was added
* `withIngressAclId(java.lang.String)` was added
* `mtu()` was added
* `bfdConfiguration()` was added
* `withPeerAsn(java.lang.Long)` was added
* `vlanId()` was added

#### `models.L2IsolationDomain` was modified

* `configurationState()` was added
* `commitConfiguration()` was added
* `validateConfiguration()` was added
* `validateConfiguration(com.azure.core.util.Context)` was added
* `commitConfiguration(com.azure.core.util.Context)` was added

#### `models.AccessControlLists` was modified

* `delete(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState)` was added
* `validateConfiguration(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `resync(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `validateConfiguration(java.lang.String,java.lang.String)` was added
* `resync(java.lang.String,java.lang.String)` was added

#### `models.InternalNetwork$Update` was modified

* `withIsMonitoringEnabled(models.IsMonitoringEnabled)` was added
* `withIngressAclId(java.lang.String)` was added
* `withExportRoutePolicy(models.ExportRoutePolicy)` was added
* `withEgressAclId(java.lang.String)` was added
* `withImportRoutePolicy(models.ImportRoutePolicy)` was added

#### `models.NetworkDevices` was modified

* `updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateDeviceAdministrativeState)` was added
* `refreshConfiguration(java.lang.String,java.lang.String)` was added
* `reboot(java.lang.String,java.lang.String,models.RebootProperties)` was added
* `upgrade(java.lang.String,java.lang.String,models.UpdateVersion,com.azure.core.util.Context)` was added
* `upgrade(java.lang.String,java.lang.String,models.UpdateVersion)` was added
* `updateAdministrativeState(java.lang.String,java.lang.String,models.UpdateDeviceAdministrativeState,com.azure.core.util.Context)` was added
* `reboot(java.lang.String,java.lang.String,models.RebootProperties,com.azure.core.util.Context)` was added
* `refreshConfiguration(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.NetworkFabric` was modified

* `upgrade(models.UpdateVersion,com.azure.core.util.Context)` was added
* `getTopology()` was added
* `administrativeState()` was added
* `updateWorkloadManagementBfdConfiguration(models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `fabricVersion()` was added
* `routerIds()` was added
* `refreshConfiguration()` was added
* `getTopology(com.azure.core.util.Context)` was added
* `commitConfiguration(com.azure.core.util.Context)` was added
* `configurationState()` was added
* `commitConfiguration()` was added
* `updateWorkloadManagementBfdConfiguration(models.UpdateAdministrativeState)` was added
* `updateInfraManagementBfdConfiguration(models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `updateInfraManagementBfdConfiguration(models.UpdateAdministrativeState)` was added
* `validateConfiguration(models.ValidateConfigurationProperties)` was added
* `validateConfiguration(models.ValidateConfigurationProperties,com.azure.core.util.Context)` was added
* `refreshConfiguration(com.azure.core.util.Context)` was added
* `upgrade(models.UpdateVersion)` was added

#### `models.ExternalNetwork` was modified

* `updateStaticRouteBfdAdministrativeState(models.UpdateAdministrativeState)` was added
* `importRoutePolicy()` was added
* `updateStaticRouteBfdAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `configurationState()` was added
* `exportRoutePolicy()` was added

#### `models.NetworkFabric$Update` was modified

* `withTerminalServerConfiguration(models.NetworkFabricPatchablePropertiesTerminalServerConfiguration)` was added
* `withManagementNetworkConfiguration(models.ManagementNetworkConfigurationPatchableProperties)` was added
* `withIpv4Prefix(java.lang.String)` was added
* `withRackCount(java.lang.Integer)` was added
* `withIpv6Prefix(java.lang.String)` was added
* `withFabricAsn(java.lang.Long)` was added
* `withServerCountPerRack(java.lang.Integer)` was added

#### `models.IpCommunity$Update` was modified

* `withIpCommunityRules(java.util.List)` was added

#### `models.NetworkDevicePatchParameters` was modified

* `withTags(java.util.Map)` was added

#### `models.L3IsolationDomains` was modified

* `validateConfiguration(java.lang.String,java.lang.String)` was added
* `commitConfiguration(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `validateConfiguration(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `commitConfiguration(java.lang.String,java.lang.String)` was added

#### `models.NetworkToNetworkInterconnects` was modified

* `updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `listByNetworkFabric(java.lang.String,java.lang.String)` was added
* `updateNpbStaticRouteBfdAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)` was added
* `updateNpbStaticRouteBfdAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `listByNetworkFabric(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `updateAdministrativeState(java.lang.String,java.lang.String,java.lang.String,models.UpdateAdministrativeState)` was added

#### `models.InternalNetworkPatch` was modified

* `isMonitoringEnabled()` was added
* `withIngressAclId(java.lang.String)` was added
* `withEgressAclId(java.lang.String)` was added
* `withExportRoutePolicy(models.ExportRoutePolicy)` was added
* `exportRoutePolicy()` was added
* `importRoutePolicy()` was added
* `egressAclId()` was added
* `ingressAclId()` was added
* `withIsMonitoringEnabled(models.IsMonitoringEnabled)` was added
* `withImportRoutePolicy(models.ImportRoutePolicy)` was added

#### `models.RoutePolicyPatch` was modified

* `statements()` was added
* `withTags(java.util.Map)` was added
* `withStatements(java.util.List)` was added

#### `models.AccessControlListPatch` was modified

* `aclsUrl()` was added
* `withMatchConfigurations(java.util.List)` was added
* `configurationType()` was added
* `withDynamicMatchConfigurations(java.util.List)` was added
* `withAclsUrl(java.lang.String)` was added
* `dynamicMatchConfigurations()` was added
* `matchConfigurations()` was added
* `withTags(java.util.Map)` was added
* `withConfigurationType(models.ConfigurationType)` was added

#### `models.IpPrefix` was modified

* `configurationState()` was added
* `administrativeState()` was added

#### `models.OptionBProperties` was modified

* `routeTargets()` was added
* `withRouteTargets(models.RouteTargetInformation)` was added

#### `models.NetworkFabricController$Definition` was modified

* `withNfcSku(models.NfcSku)` was added
* `withIsWorkloadManagementNetworkEnabled(models.IsWorkloadManagementNetworkEnabled)` was added

#### `models.InternalNetwork` was modified

* `extension()` was added
* `egressAclId()` was added
* `exportRoutePolicy()` was added
* `ingressAclId()` was added
* `importRoutePolicy()` was added
* `isMonitoringEnabled()` was added
* `configurationState()` was added
* `updateStaticRouteBfdAdministrativeState(models.UpdateAdministrativeState)` was added
* `updateStaticRouteBfdAdministrativeState(models.UpdateAdministrativeState,com.azure.core.util.Context)` was added

#### `models.NetworkFabricPatchableProperties` was modified

* `withIpv4Prefix(java.lang.String)` was added
* `managementNetworkConfiguration()` was added
* `terminalServerConfiguration()` was added
* `withManagementNetworkConfiguration(models.ManagementNetworkConfigurationPatchableProperties)` was added
* `fabricAsn()` was added
* `withIpv6Prefix(java.lang.String)` was added
* `withRackCount(java.lang.Integer)` was added
* `withTerminalServerConfiguration(models.NetworkFabricPatchablePropertiesTerminalServerConfiguration)` was added
* `withFabricAsn(java.lang.Long)` was added
* `ipv4Prefix()` was added
* `rackCount()` was added
* `withServerCountPerRack(java.lang.Integer)` was added
* `ipv6Prefix()` was added
* `serverCountPerRack()` was added

#### `models.RoutePolicy$Update` was modified

* `withStatements(java.util.List)` was added

#### `models.IpExtendedCommunity$Definition` was modified

* `withIpExtendedCommunityRules(java.util.List)` was added

#### `models.NetworkRack` was modified

* `networkRackType()` was added

#### `models.ExternalNetwork$Definition` was modified

* `withOptionBProperties(models.L3OptionBProperties)` was added
* `withExportRoutePolicy(models.ExportRoutePolicy)` was added
* `withImportRoutePolicy(models.ImportRoutePolicy)` was added

#### `models.Layer2Configuration` was modified

* `withMtu(java.lang.Integer)` was added
* `withInterfaces(java.util.List)` was added

#### `models.L2IsolationDomainPatch` was modified

* `withTags(java.util.Map)` was added

#### `models.NetworkFabric$Definition` was modified

* `withFabricAsn(long)` was added
* `withManagementNetworkConfiguration(models.ManagementNetworkConfigurationProperties)` was added
* `withRackCount(java.lang.Integer)` was added

#### `models.NetworkFabrics` was modified

* `updateInfraManagementBfdConfiguration(java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `refreshConfiguration(java.lang.String,java.lang.String)` was added
* `commitConfiguration(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `commitConfiguration(java.lang.String,java.lang.String)` was added
* `updateWorkloadManagementBfdConfiguration(java.lang.String,java.lang.String,models.UpdateAdministrativeState)` was added
* `updateInfraManagementBfdConfiguration(java.lang.String,java.lang.String,models.UpdateAdministrativeState)` was added
* `refreshConfiguration(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `upgrade(java.lang.String,java.lang.String,models.UpdateVersion,com.azure.core.util.Context)` was added
* `getTopology(java.lang.String,java.lang.String)` was added
* `upgrade(java.lang.String,java.lang.String,models.UpdateVersion)` was added
* `validateConfiguration(java.lang.String,java.lang.String,models.ValidateConfigurationProperties)` was added
* `validateConfiguration(java.lang.String,java.lang.String,models.ValidateConfigurationProperties,com.azure.core.util.Context)` was added
* `updateWorkloadManagementBfdConfiguration(java.lang.String,java.lang.String,models.UpdateAdministrativeState,com.azure.core.util.Context)` was added
* `getTopology(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.NetworkDevice` was modified

* `administrativeState()` was added
* `upgrade(models.UpdateVersion)` was added
* `refreshConfiguration(com.azure.core.util.Context)` was added
* `reboot(models.RebootProperties)` was added
* `reboot(models.RebootProperties,com.azure.core.util.Context)` was added
* `updateAdministrativeState(models.UpdateDeviceAdministrativeState)` was added
* `refreshConfiguration()` was added
* `managementIpv4Address()` was added
* `upgrade(models.UpdateVersion,com.azure.core.util.Context)` was added
* `managementIpv6Address()` was added
* `updateAdministrativeState(models.UpdateDeviceAdministrativeState,com.azure.core.util.Context)` was added
* `configurationState()` was added

#### `models.NetworkFabricController` was modified

* `isWorkloadManagementNetworkEnabled()` was added
* `tenantInternetGatewayIds()` was added
* `nfcSku()` was added

#### `models.BfdConfiguration` was modified

* `intervalInMilliSeconds()` was added
* `withIntervalInMilliSeconds(java.lang.Integer)` was added
* `withMultiplier(java.lang.Integer)` was added

#### `models.IpCommunityPatch` was modified

* `withIpCommunityRules(java.util.List)` was added
* `withTags(java.util.Map)` was added
* `ipCommunityRules()` was added

#### `models.ExternalNetworkPatchableProperties` was modified

* `withExportRoutePolicy(models.ExportRoutePolicy)` was added
* `importRoutePolicy()` was added
* `exportRoutePolicy()` was added
* `withImportRoutePolicy(models.ImportRoutePolicy)` was added

#### `models.NetworkInterfaces` was modified

* `listByNetworkDevice(java.lang.String,java.lang.String)` was added
* `listByNetworkDevice(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.IpExtendedCommunity$Update` was modified

* `withAnnotation(java.lang.String)` was added
* `withIpExtendedCommunityRules(java.util.List)` was added

#### `models.UpdateAdministrativeState` was modified

* `withState(models.EnableDisableState)` was added

#### `models.VpnConfigurationProperties` was modified

* `withOptionAProperties(models.VpnConfigurationPropertiesOptionAProperties)` was added
* `withOptionBProperties(models.OptionBProperties)` was added
* `withNetworkToNetworkInterconnectId(java.lang.String)` was added

#### `models.StatementConditionProperties` was modified

* `type()` was added
* `withType(models.RoutePolicyConditionType)` was added

#### `models.RoutePolicy$Definition` was modified

* `withAddressFamilyType(models.AddressFamilyType)` was added
* `withNetworkFabricId(java.lang.String)` was added

## 1.0.0-beta.1 (2023-06-27)

- Azure Resource Manager Managed Network Fabric client library for Java. This package contains Microsoft Azure SDK for Managed Network Fabric Management SDK. Self service experience for Azure Network Fabric API. Package tag package-2023-02-01-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
