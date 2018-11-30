// original filename: 00000935.txt
// after
public class Class00000145Better {
    @Override
    public String getUrl() {
        int method = getMethod();
        if ((method == Method.GET || method == Method.DELETE) && !mParams.isEmpty()) {
            return getUrlWithParams();
        } else {
            return mUrl;
        }
    }
}
