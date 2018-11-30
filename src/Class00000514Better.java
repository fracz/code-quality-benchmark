// original filename: 00026573.txt
// before
public class Class00000514Better {
    private ObjectFormatter initFormatter(Class<? extends ObjectFormatter> formatterClazz) {
        try {
            return formatterClazz.newInstance();
        } catch (InstantiationException e) {
            logger.error("init ObjectFormatter fail", e);
        } catch (IllegalAccessException e) {
            logger.error("init ObjectFormatter fail", e);
        }
        return null;
    }
}
