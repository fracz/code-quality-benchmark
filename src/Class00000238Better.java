// original filename: 00039753.txt
// after
public class Class00000238Better {
    private void assertIsNotUniqueIndex(IndexDescriptor index, Iterator<IndexDescriptor> uniqueIndexes) throws IndexBelongsToConstraintException {
        while (uniqueIndexes.hasNext()) {
            IndexDescriptor uniqueIndex = uniqueIndexes.next();
            if (uniqueIndex.equals(index)) {
                throw new IndexBelongsToConstraintException(index.descriptor());
            }
        }
    }
}
