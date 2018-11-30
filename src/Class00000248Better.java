// original filename: 00045380.txt
// after
public class Class00000248Better {
    /**
     * Should be used only by console commands
     */
    protected void checkForRemoteServer() {
        if (orientDB == null || OrientDBInternal.extract(orientDB).isEmbedded())
            throw new OSystemException("Remote server is not connected. Use 'connect remote:<host>[:<port>][/<database-name>]' to connect");
    }
}
