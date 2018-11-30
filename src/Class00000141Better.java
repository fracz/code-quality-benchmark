// original filename: 00050610.txt
// after
public class Class00000141Better {
    @Override
    public void rejectChanges() {
        try {
            createDataPersister().rejectChanges();
        } catch (DBException e) {
            log.debug(e);
        }
    }
}
