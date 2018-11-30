// original filename: 00044524.txt
// before
public class Class00000368Worse {
    /**
     * Returns the list of databases on the connected remote server.
     *
     * @throws IOException
     */
    public synchronized Map<String, String> listDatabases() throws IOException {
        OBinaryRequest request = new OListDatabasesRequest();
        OBinaryResponse<Map<String, String>> response = new OListDatabasesReponse();
        return networkAdminOperation(request, response, "Cannot retrieve the configuration list");
    }
}
