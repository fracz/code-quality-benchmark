// original filename: 00034242.txt
// before
public class Class00000327Worse {
    public static boolean isMailTo(Uri uri) {
        if (uri == null) {
            return false;
        }
        return MAILTO_SCHEME.equals(uri.getScheme());
    }
}
