// original filename: 00059901.txt
// before
public class Class00000069Worse {
    @Override
    public int compareTo(FaunusElement o) {
        return new Long(this.id).compareTo((Long) o.getId());
    }
}
