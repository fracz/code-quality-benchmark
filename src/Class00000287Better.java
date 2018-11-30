// original filename: 00001628.txt
// after
public class Class00000287Better {
    @NotNull
    public Pair<ThreeState, JsonSchemaObject> step(@NotNull JsonSchemaObject parent, boolean acceptAdditionalPropertiesSchemas) {
        if (myName != null) {
            return propertyStep(parent, acceptAdditionalPropertiesSchemas);
        } else {
            assert myIdx >= 0;
            return arrayElementStep(parent, acceptAdditionalPropertiesSchemas);
        }
    }
}
