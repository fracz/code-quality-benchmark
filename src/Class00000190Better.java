// original filename: 00012397.txt
// after
public class Class00000190Better {
    @Override
    protected void onFailure() {
        VcsNotifier.getInstance(myProject).notifyError("", myErrorMessage);
    }
}
