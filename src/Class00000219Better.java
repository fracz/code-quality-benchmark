// original filename: 00018174.txt
// after
public class Class00000219Better {
    protected File getHistoryDir(HistoryEntry historyEntry) {
        File dir = new File(((FileProjectManager) ProjectManager.singleton).getProjectDir(historyEntry.projectID), "history");
        dir.mkdirs();
        return dir;
    }
}
