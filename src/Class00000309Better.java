// original filename: 00030083.txt
// after
public class Class00000309Better {
    public void close() {
        cache.remove();
        rootObjectMapper.close();
        idFieldMapper.close();
        for (RootMapper rootMapper : rootMappersOrdered) {
            rootMapper.close();
        }
    }
}
