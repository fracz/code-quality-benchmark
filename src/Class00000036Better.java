// original filename: 00038864.txt
// after
public class Class00000036Better {
    @Override
    public void dropIndexRule(IndexRule indexRule) throws ConstraintViolationKernelException {
        lockHolder.acquireSchemaWriteLock();
        delegate.dropIndexRule(indexRule);
    }
}
