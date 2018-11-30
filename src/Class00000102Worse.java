// original filename: 00043308.txt
// before
public class Class00000102Worse {
    public boolean addAll(final Collection<? extends Object> c) {
        if (c.size() == 0)
            return false;
        for (Object o : c) {
            add(o);
        }
        setDirty();
        return true;
    }
}
