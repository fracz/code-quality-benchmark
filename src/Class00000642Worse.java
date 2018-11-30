// original filename: 00024555.txt
// after
public class Class00000642Worse {
    @Override
    public UnfilteredPartitionIterator search(ReadCommand filter, ReadOrderGroup orderGroup) {
        return new SingletonUnfilteredPartitionIterator(LAST_INDEXED_PARTITION, false);
    }
}
