// original filename: 00016306.txt
// after
public class Class00000388Better {
    @Override
    public StackValue visitDotQualifiedExpression(JetDotQualifiedExpression expression, StackValue receiver) {
        return genQualified(StackValue.none(), expression.getSelectorExpression());
    }
}
