// original filename: 00015873.txt
// before
public class Class00000354Worse {
    @NotNull
    private static <D> String dumpEdgesData(String prefix, @NotNull Edges<Map<VariableDescriptor, D>> edges) {
        return prefix + " in: " + renderVariableMap(edges.getIncoming()) + " out: " + renderVariableMap(edges.getOutgoing());
    }
}
