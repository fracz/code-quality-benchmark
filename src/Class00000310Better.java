// original filename: 00033353.txt
// after
public class Class00000310Better {
    private void addDefaultResolvers(List<PluginResolver> resolvers) {
        resolvers.add(new PluginRegistryPluginResolver(pluginRegistry));
        resolvers.add(jcenterGradleOfficial(instantiator, createDependencyResolutionServices()));
    }
}
