// original filename: 00004625.txt
// before
public class Class00000326Worse {
    @Override
    @Nullable
    public String apply(@NotNull GradleSettings settings) {
        if (myServiceDirectoryPathModifiedByUser) {
            settings.setServiceDirectoryPath(ExternalSystemApiUtil.normalizePath(myServiceDirectoryPathField.getText()));
        }
        settings.setGradleVmOptions(trimIfPossible(myGradleVmOptionsField.getText()));
        return null;
    }
}
