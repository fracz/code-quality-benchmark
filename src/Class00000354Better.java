// original filename: 00015873.txt
// after
public class Class00000354Better {
    @NotNull
    private static <S, I extends ControlFlowInfo<S>> String dumpEdgesData(String prefix, @NotNull Edges<I> edges) {
        return prefix + " in: " + renderVariableMap(edges.getIncoming()) + " out: " + renderVariableMap(edges.getOutgoing());
    }
}
