// original filename: 00039730.txt
// after
public class Class00000114Better {
    @Override
    public DoubleLongRegister indexSample(IndexDescriptor descriptor, DoubleLongRegister target) {
        counts(indexSampleKey(descriptor)).copyTo(target);
        return target;
    }
}
