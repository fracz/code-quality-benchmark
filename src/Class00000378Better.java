// original filename: 00021162.txt
// after
public class Class00000378Better {
    private void defineVarLexer(Context context, MethodVisitor mw) {
        mw.visitVarInsn(ALOAD, 1);
        mw.visitFieldInsn(GETFIELD, DefaultJSONParser, "lexer", desc(JSONLexer.class));
        // cast
        mw.visitTypeInsn(CHECKCAST, JSONLexerBase);
        mw.visitVarInsn(ASTORE, context.var("lexer"));
    }
}
