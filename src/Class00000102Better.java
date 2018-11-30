// original filename: 00043308.txt
// after
public class Class00000102Better {
    public boolean addAll(final Collection<? extends Object> c) {
        if (c == null || c.size() == 0)
            return false;
        for (Object o : c) add(o);
        setDirty();
        return true;
    }
}
