// original filename: 00024583.txt
// after
public class Class00000315Better {
    protected void recordLast(DecoratedKey key, Row last) {
        if (last != null) {
            lastReturnedKey = key;
            lastReturnedClustering = last.clustering().takeAlias();
        }
    }
}
