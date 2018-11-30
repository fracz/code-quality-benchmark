// original filename: 00007391.txt
// after
public class Class00000346Better {
    public void testClassComment() throws Exception {
        String before = "/**\n" + "* @author smbd\n" + "* @param <T> some param\n" + "* @since 1.9\n" + "*/\n" + "class Test<T>{}";
        String after = "/**\n" + " * @param <T> some param\n" + " * @author smbd\n" + " * @since 1.9\n" + " */\n" + "class Test<T> {\n" + "}";
        doTextTest(before, after);
    }
}
