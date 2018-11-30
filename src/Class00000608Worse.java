// original filename: 00038733.txt
// after
public class Class00000608Worse {
    @Override
    public IndexDescriptor addIndexRule(long labelId, long propertyKey) throws ConstraintViolationKernelException {
        IndexDescriptor rule = new IndexDescriptor(labelId, propertyKey);
        state.addIndexRule(rule);
        return rule;
    }
}
