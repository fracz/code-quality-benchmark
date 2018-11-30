// original filename: 00002237.txt
// after
public class Class00000244Better {
    @Override
    protected boolean isDirectory() {
        return (getUserObject()).isDirectory() && FileStatusManager.getInstance(myProject).getStatus(getUserObject()) != FileStatus.NOT_CHANGED;
    }
}
