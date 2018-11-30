// original filename: 00041316.txt
// after
public class Class00000194Better {
    protected ODatabaseRecord getDatabase() {
        return ODatabaseRecordThreadLocal.INSTANCE.get();
    }
}
