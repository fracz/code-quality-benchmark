// original filename: 00023774.txt
// after
public class Class00000199Better {
    @Override
    public void onChanged() {
        // TODO: This is causing b/22765812
        mSelection.clear();
        mModelIds = mEnvironment.getModelIds();
    }
}
