// original filename: 00028218.txt
// after
public class Class00000450Better {
    public CaOptions addCertPath(String certPath) throws NullPointerException {
        Objects.requireNonNull(certPath, "No null certificate accepted");
        Arguments.require(!certPath.isEmpty(), "No empty certificate path accepted");
        certPaths.add(certPath);
        return this;
    }
}
