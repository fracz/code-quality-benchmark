// original filename: 00015644.txt
// after
public class Class00000245Better {
    @Override
    public JetConstructorCalleeExpression getCalleeExpression() {
        return (JetConstructorCalleeExpression) findChildByType(JetNodeTypes.CONSTRUCTOR_CALLEE);
    }
}
