// original filename: 00000935.txt
// before
public class Class00000145Worse {
    @Override
    public String getUrl() {
        if (getMethod() == Method.GET && !mParams.isEmpty()) {
            return getUrlWithParams();
        } else {
            return mUrl;
        }
    }
}
