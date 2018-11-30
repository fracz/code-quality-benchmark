// original filename: 00044542.txt
// after
public class Class00000130Better {
    public long[] getClusterDataRange(final int iClusterId) {
        OGetClusterDataRangeRequest request = new OGetClusterDataRangeRequest(iClusterId);
        OGetClusterDataRangeResponse response = networkOperation(request, "Error on getting last entry position count in cluster: " + iClusterId);
        return response.getPos();
    }
}
