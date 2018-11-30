// original filename: 00045380.txt
// before
public class Class00000248Worse {
    /**
     * Should be used only by console commands
     */
    protected void checkForRemoteServer() {
        if (serverAdmin == null && (currentDatabase == null || !(currentDatabase.getStorage() instanceof OStorageProxy) || currentDatabase.isClosed()))
            throw new OSystemException("Remote server is not connected. Use 'connect remote:<host>[:<port>][/<database-name>]' to connect");
    }
}
