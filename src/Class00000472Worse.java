// original filename: 00002580.txt
// after
public class Class00000472Worse {
    @Override
    public void loadState(JsonSchemaMappingsProjectConfiguration state) {
        synchronized (myLock) {
            XmlSerializerUtil.copyBean(state, this);
        }
    }
}
