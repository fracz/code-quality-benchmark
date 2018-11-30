// original filename: 00032118.txt
// after
public class Class00000095Better {
    public void testExposeYieldExpression2() {
        helperMoveExpression("function *f() { return (yield 1) || (yield 2); }", "yield", LINE_JOINER.join("function *f() {", "  var result$jscomp$0 = yield 1;", "  return result$jscomp$0 || (yield 2);", "}"));
        helperExposeExpression("function *f(x) { return x || (yield 2); }", "yield", LINE_JOINER.join("function *f(x) {", "  var temp$jscomp$0;", "  if (temp$jscomp$0=x); else temp$jscomp$0 = yield 2;", "  return temp$jscomp$0", "}"));
    }
}
