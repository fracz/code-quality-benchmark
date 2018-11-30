// original filename: 00012833.txt
// after
public class Class00000568Worse {
    public <M extends ModuleFixtureBuilder> M addModule(final Class<M> builderClass) {
        final M builder = (M) myModuleFixtureBuilderFactory.get(builderClass);
        myFixture.addModuleFixtureBuilder(builder);
        return builder;
    }
}
