// original filename: 00007391.txt
// before
public class Class00000346Worse {
    public void testClassComment() throws Exception {
        doTextTest("/**\n" + "* @author smbd\n" + "* @param <T> some param\n" + "* @since 1.9\n" + "*/\n" + "class Test<T>{}", "/**\n" + " * @param <T> some param\n" + " * @author smbd\n" + " * @since 1.9\n" + " */\n" + "class Test<T> {\n}");
    }
}
