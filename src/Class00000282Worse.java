// original filename: 00058925.txt
// before
public class Class00000282Worse {
    @Override
    public <V> Iterator<VertexProperty<V>> hiddenPropertyIterator(String... strings) {
        return (Iterator) query().keys(strings).system().properties().iterator();
    }
}
