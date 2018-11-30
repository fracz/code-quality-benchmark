// original filename: 00018474.txt
// before
public class Class00000541Better {
    @Override
    @SuppressWarnings("unchecked")
    public T getValue() {
        Object o = state.get();
        if (o != null && !NotificationLite.isError(o)) {
            return (T) o;
        }
        return null;
    }
}
