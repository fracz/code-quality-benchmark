// original filename: 00004625.txt
// after
public class Class00000326Better {
    @Override
    public void apply(@NotNull GradleSettings settings) {
        if (myServiceDirectoryPathModifiedByUser) {
            settings.setServiceDirectoryPath(ExternalSystemApiUtil.normalizePath(myServiceDirectoryPathField.getText()));
        }
        settings.setGradleVmOptions(trimIfPossible(myGradleVmOptionsField.getText()));
    }
}
