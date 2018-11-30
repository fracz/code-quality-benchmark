// original filename: 00000464.txt
// after
public class Class00000012Better {
    /**
     * Retrieves a handle to an object identified by the given path.
     *
     * @param path the path to retrieve an object handle for
     * @return the object handle
     */
    private StoredObject getObject(final String path) {
        Container container = mAccount.getContainer(mContainerName);
        return container.getObject(stripPrefixIfPresent(path));
    }
}
