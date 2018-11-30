// original filename: 00039730.txt
// before
public class Class00000114Worse {
    @Override
    public DoubleLongRegister indexSample(int labelId, int propertyKeyId, DoubleLongRegister target) {
        counts(indexSampleKey(labelId, propertyKeyId)).copyTo(target);
        return target;
    }
}
