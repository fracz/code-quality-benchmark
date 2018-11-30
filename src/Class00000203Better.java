// original filename: 00028225.txt
// after
public class Class00000203Better {
    @Override
    public HttpClientOptions addCrlPath(String crlPath) throws NullPointerException {
        Objects.requireNonNull(crlPath, "No null crl accepted");
        crlPaths.add(crlPath);
        return this;
    }
}
