// original filename: 00000196.txt
// before
public class Class00000414Worse {
    /**
     * A trailing {@link SwiftUnderFileSystem#PATH_SEPARATOR} is added if not present.
     *
     * @param path URI to the object
     * @return folder path
     */
    private String addFolderSuffixIfNotPresent(String path) {
        if (!path.endsWith(PATH_SEPARATOR)) {
            path = path + PATH_SEPARATOR;
        }
        return path;
    }
}
