// original filename: 00018174.txt
// before
public class Class00000219Worse {
    protected File getHistoryDir() {
        // FIXME relies on FileProjectManager
        File dir = new File(((FileProjectManager) ProjectManager.singleton).getProjectDir(projectID), "history");
        dir.mkdirs();
        return dir;
    }
}
