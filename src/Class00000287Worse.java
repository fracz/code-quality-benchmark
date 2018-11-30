// original filename: 00001628.txt
// before
public class Class00000287Worse {
    public void step(@NotNull JsonSchemaObject parent, @NotNull TransitionResultConsumerI resultConsumer, boolean acceptAdditionalPropertiesSchemas) {
        if (myName != null) {
            propertyStep(parent, resultConsumer, acceptAdditionalPropertiesSchemas);
        } else {
            assert myIdx >= 0;
            arrayElementStep(parent, resultConsumer);
        }
    }
}
