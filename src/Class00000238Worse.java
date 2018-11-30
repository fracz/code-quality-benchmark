// original filename: 00039753.txt
// before
public class Class00000238Worse {
    private void assertIsNotUniqueIndex(IndexDescriptor descriptor, Iterator<IndexDescriptor> uniqueIndexes) throws IndexBelongsToConstraintException {
        while (uniqueIndexes.hasNext()) {
            IndexDescriptor uniqueIndex = uniqueIndexes.next();
            if (uniqueIndex.getPropertyKeyId() == descriptor.getPropertyKeyId()) {
                throw new IndexBelongsToConstraintException(descriptor);
            }
        }
    }
}
