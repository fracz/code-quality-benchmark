// original filename: 00038864.txt
// before
public class Class00000036Worse {
    @Override
    public void dropIndexRule(long labelId, long propertyKey) throws ConstraintViolationKernelException {
        lockHolder.acquireSchemaWriteLock();
        delegate.dropIndexRule(labelId, propertyKey);
    }
}
