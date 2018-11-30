// original filename: 00002237.txt
// before
public class Class00000244Worse {
    @Override
    protected boolean isDirectory() {
        return ((VirtualFile) userObject).isDirectory() && FileStatusManager.getInstance(myProject).getStatus((VirtualFile) userObject) != FileStatus.NOT_CHANGED;
    }
}
