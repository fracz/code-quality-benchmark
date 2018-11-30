// original filename: 00000464.txt
// before
public class Class00000012Worse {
    /**
     * Retrieves a handle to an object identified by the given path.
     *
     * @param path the path to retrieve an object handle for
     * @return the object handle
     */
    private StoredObject getObject(String path) {
        String strippedPath = stripPrefixIfPresent(path);
        Container container = mAccount.getContainer(mContainerName);
        return container.getObject(strippedPath);
    }
}
