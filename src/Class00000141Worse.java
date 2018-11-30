// original filename: 00050610.txt
// before
public class Class00000141Worse {
    @Override
    public void rejectChanges() {
        ResultSetPersister persister = createDataPersister();
        if (persister != null) {
            persister.rejectChanges();
        }
    }
}
