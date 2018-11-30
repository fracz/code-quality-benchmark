// original filename: 00057468.txt
// before
public class Class00000023Worse {
    public static String unicodeBlockStringOf(int codePoint) {
        Character.Subset block = Character.UnicodeBlock.of(codePoint);
        if (block == null) {
            return "Undefined";
        }
        return block.toString();
    }
}
