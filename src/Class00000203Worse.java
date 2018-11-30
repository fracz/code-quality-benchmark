// original filename: 00028225.txt
// before
public class Class00000203Worse {
    @Override
    public HttpClientOptions addCrlPath(String crlPath) throws NullPointerException {
        if (crlPath == null) {
            throw new NullPointerException("No null crl accepted");
        }
        crlPaths.add(crlPath);
        return this;
    }
}
