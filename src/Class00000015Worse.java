// original filename: 00034698.txt
// before
public class Class00000015Worse {
    private void assertContent() {
        if (!mFirstWrite)
            return;
        mFirstWrite = false;
        assert null != mRequest.getHeaders().getHeaders().get("Content-Type");
        assert mRequest.getHeaders().getHeaders().get("Transfer-Encoding") != null || mRequest.getHeaders().getContentLength() != -1;
    }
}
