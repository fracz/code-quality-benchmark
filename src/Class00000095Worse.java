// original filename: 00032118.txt
// before
public class Class00000095Worse {
    public void testExposeYieldExpression2() {
        helperMoveExpression("function *f() { return (yield 1) || (yield 2); }", "yield", "function *f() {" + "  var result$jscomp$0 = yield 1;" + "  return result$jscomp$0 || (yield 2);" + "}");
        helperExposeExpression("function *f(x) {" + "  return x || (yield 2);" + "}", "yield", "function *f(x) {" + "  var temp$jscomp$0;" + "  if (temp$jscomp$0=x); else temp$jscomp$0 = yield 2;" + "  return temp$jscomp$0" + "}");
    }
}
