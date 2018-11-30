// original filename: 00033817.txt
// before
public class Class00000475Better {
    public static <T> void registerDao(Class<T> entityClass, Class<? extends AbstractDao<T, ?>> daoClass) {
        entityToDaoClass.put(entityClass, daoClass);
    }
}
