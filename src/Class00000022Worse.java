// original filename: 00044522.txt
// before
public class Class00000022Worse {
    public synchronized Map<String, String> getGlobalConfigurations() throws IOException {
        OBinaryRequest request = new OGetGlobalConfigurationsRequest();
        OBinaryResponse<Map<String, String>> response = new OGetGlobalConfigurationsResponse();
        return networkAdminOperation(request, response, "Cannot retrieve the configuration list");
    }
}
