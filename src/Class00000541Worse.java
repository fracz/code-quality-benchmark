// original filename: 00018474.txt
// after
public class Class00000541Worse {
    @Override
    public T getValue() {
        Object o = state.get();
        if (o != null) {
            if (NotificationLite.isComplete(o) || NotificationLite.isError(o)) {
                return null;
            }
            return NotificationLite.getValue(o);
        }
        return null;
    }
}
