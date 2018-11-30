// original filename: 00034242.txt
// after
public class Class00000327Better {
    public static boolean isMailTo(Uri uri) {
        return uri != null && MAILTO_SCHEME.equals(uri.getScheme());
    }
}
