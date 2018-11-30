// original filename: 00037142.txt
// before
public class Class00000246Worse {
    @Override
    protected StorageFactory createStorageFactory() {
        return new SimpleSpanStorageFactory(super.getSpanDataSender());
    }
}
