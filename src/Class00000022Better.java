// original filename: 00044522.txt
// after
public class Class00000022Better {
    public synchronized Map<String, String> getGlobalConfigurations() throws IOException {
        OGetGlobalConfigurationsRequest request = new OGetGlobalConfigurationsRequest();
        OGetGlobalConfigurationsResponse response = networkAdminOperation(request, "Cannot retrieve the configuration list");
        return response.getConfigs();
    }
}
