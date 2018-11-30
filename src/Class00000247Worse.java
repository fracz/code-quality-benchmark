// original filename: 00041667.txt
// before
public class Class00000247Worse {
    public Collection<OStorage> getStorages() {
        engineLock.readLock().lock();
        try {
            return new ArrayList<OStorage>(storages.values());
        } finally {
            engineLock.readLock().unlock();
        }
    }
}
