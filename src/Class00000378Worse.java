// original filename: 00021162.txt
// before
public class Class00000378Worse {
    private void defineVarLexer(Context context, MethodVisitor mw) {
        mw.visitVarInsn(ALOAD, 1);
        mw.visitFieldInsn(GETFIELD, "com/alibaba/fastjson/parser/DefaultJSONParser", "lexer", "Lcom/alibaba/fastjson/parser/JSONLexer;");
        // cast
        mw.visitTypeInsn(CHECKCAST, "com/alibaba/fastjson/parser/JSONLexerBase");
        mw.visitVarInsn(ASTORE, context.var("lexer"));
    }
}
