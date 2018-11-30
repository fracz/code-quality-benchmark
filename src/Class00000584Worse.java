// original filename: 00059617.txt
// after
public class Class00000584Worse {
    @Override
    public TitanGraphIndex getGraphIndex(String name) {
        IndexType index = getGraphIndexDirect(name, transaction);
        return index == null ? null : new TitanGraphIndexWrapper(index);
    }
}
