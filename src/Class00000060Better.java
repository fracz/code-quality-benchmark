// original filename: 00032111.txt
// after
public class Class00000060Better {
    public void testExposeExpression15() {
        // TODO(johnlenz): We really want a constant marking pass.
        // The value "goo" should be constant, but it isn't known to be so.
        helperExposeExpression("if (goo(1, goo(2), (1 ? foo() : 0)));", "foo", LINE_JOINER.join("var temp_const$jscomp$1 = goo;", "var temp_const$jscomp$0 = goo(2);", "var temp$jscomp$2;", "if (1) temp$jscomp$2 = foo(); else temp$jscomp$2 = 0;", "if (temp_const$jscomp$1(1, temp_const$jscomp$0, temp$jscomp$2));"));
    }
}
