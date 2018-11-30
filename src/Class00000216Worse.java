// original filename: 00044554.txt
// before
public class Class00000216Worse {
    public void reload() {
        OBinaryRequest request = new OReloadRequest();
        OBinaryResponse<OCluster[]> response = new OReloadResponse();
        OCluster[] res = networkOperation(request, response, "Error on reloading database information");
        updateStorageInformations(res);
    }
}
