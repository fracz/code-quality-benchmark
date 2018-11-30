// original filename: 00039744.txt
// after
public class Class00000062Better {
    @Override
    public Register.DoubleLongRegister indexUpdatesAndSize(IndexDescriptor descriptor, Register.DoubleLongRegister target) {
        return get(indexStatisticsKey(descriptor), target);
    }
}
