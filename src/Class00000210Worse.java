// original filename: 00030055.txt
// before
public class Class00000210Worse {
    public static Operator fromString(String op) {
        for (Operator operator : Operator.values()) {
            if (operator.name().equalsIgnoreCase(op)) {
                return operator;
            }
        }
        throw Operator.newOperatorException(op);
    }
}
