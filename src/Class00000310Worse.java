// original filename: 00033353.txt
// before
public class Class00000310Worse {
    private void addDefaultResolvers(List<PluginResolver> resolvers) {
        resolvers.add(new PluginRegistryPluginResolver(pluginRegistry));
        resolvers.add(new ModuleMappingPluginResolver("jcenter plugin resolver", createDependencyResolutionServices(), instantiator, new JCenterPluginMapper(), new JCenterRepositoryConfigurer()));
    }
}
