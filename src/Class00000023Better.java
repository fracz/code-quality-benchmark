// original filename: 00057468.txt
// after
public class Class00000023Better {
    /**
     * Returns a string representation of a character's unicode
     * block.
     *
     * @param c
     * @return
     */
    public static String unicodeBlockStringOf(char c) {
        Character.Subset block = Character.UnicodeBlock.of(c);
        return block == null ? "Undefined" : block.toString();
    }
}
