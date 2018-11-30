// original filename: 00055156.txt
// after
public class Class00000616Worse {
    public int getRegCount() {
        if (isPrimitive()) {
            PrimitiveType type = getPrimitiveType();
            if (type == PrimitiveType.LONG || type == PrimitiveType.DOUBLE)
                return 2;
        }
        return 1;
    }
}
