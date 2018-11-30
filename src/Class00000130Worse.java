// original filename: 00044542.txt
// before
public class Class00000130Worse {
    public long[] getClusterDataRange(final int iClusterId) {
        OBinaryRequest request = new OGetClusterDataRangeRequest(iClusterId);
        OBinaryResponse<long[]> response = new OGetClusterDataRangeResponse();
        return networkOperation(request, response, "Error on getting last entry position count in cluster: " + iClusterId);
    }
}
