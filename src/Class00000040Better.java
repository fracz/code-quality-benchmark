// original filename: 00040147.txt
// after
public class Class00000040Better {
    @Override
    public IndexDescriptor indexCreate(KernelStatement state, NodePropertyDescriptor descriptor) {
        IndexDescriptor indexDescriptor = IndexDescriptorFactory.from(descriptor);
        state.txState().indexRuleDoAdd(indexDescriptor);
        return indexDescriptor;
    }
}
