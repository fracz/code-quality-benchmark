// original filename: 00059617.txt
// before
public class Class00000584Better {
    @Override
    public TitanGraphIndex getGraphIndex(String name) {
        return new TitanGraphIndexWrapper(getInternalGraphIndex(name, transaction));
    }
}
