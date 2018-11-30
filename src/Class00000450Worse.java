// original filename: 00028218.txt
// before
public class Class00000450Worse {
    public CaOptions addCertPath(String certPath) throws NullPointerException {
        if (certPath == null) {
            throw new NullPointerException("No null certificate accepted");
        }
        certPaths.add(certPath);
        return this;
    }
}
