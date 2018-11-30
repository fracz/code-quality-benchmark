// original filename: 00016306.txt
// before
public class Class00000388Worse {
    @Override
    public StackValue visitDotQualifiedExpression(JetDotQualifiedExpression expression, StackValue receiver) {
        StackValue receiverValue = resolvesToClassOrPackage(expression.getReceiverExpression()) ? StackValue.none() : genQualified(receiver, expression.getReceiverExpression());
        return genQualified(receiverValue, expression.getSelectorExpression());
    }
}
