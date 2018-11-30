// original filename: 00012833.txt
// before
public class Class00000568Better {
    public <M extends ModuleFixtureBuilder> M addModule(final Class<M> builderClass) {
        return (M) myModuleFixtureBuilderFactory.get(builderClass);
    }
}
