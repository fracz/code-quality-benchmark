// original filename: 00026573.txt
// after
public class Class00000514Worse {
    private ObjectFormatter initFormatter(Class<? extends ObjectFormatter> formatterClazz) {
        try {
            return formatterClazz.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
