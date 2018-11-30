// original filename: 00000196.txt
// after
public class Class00000414Better {
    /**
     * A trailing {@link SwiftUnderFileSystem#PATH_SEPARATOR} is added if not present.
     *
     * @param path URI to the object
     * @return folder path
     */
    private String addFolderSuffixIfNotPresent(String path) {
        return PathUtils.normalizePath(path, PATH_SEPARATOR);
    }
}
