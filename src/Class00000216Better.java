// original filename: 00044554.txt
// after
public class Class00000216Better {
    public void reload() {
        OReloadRequest request = new OReloadRequest();
        OReloadResponse response = networkOperation(request, "Error on reloading database information");
        updateStorageInformations(response.getClusters());
    }
}
