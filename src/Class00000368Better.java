// original filename: 00044524.txt
// after
public class Class00000368Better {
    /**
     * Returns the list of databases on the connected remote server.
     *
     * @throws IOException
     */
    public synchronized Map<String, String> listDatabases() throws IOException {
        OListDatabasesRequest request = new OListDatabasesRequest();
        OListDatabasesReponse response = networkAdminOperation(request, "Cannot retrieve the configuration list");
        return response.getDatabases();
    }
}
