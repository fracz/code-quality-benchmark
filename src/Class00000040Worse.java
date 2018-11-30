// original filename: 00040147.txt
// before
public class Class00000040Worse {
    @Override
    public IndexDescriptor indexCreate(KernelStatement state, int labelId, int propertyKey) {
        IndexDescriptor rule = new IndexDescriptor(labelId, propertyKey);
        state.txState().indexRuleDoAdd(rule);
        return rule;
    }
}
