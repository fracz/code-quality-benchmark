// original filename: 00026446.txt
// after
public class Class00000047Better {
    /**
     * Add a new object to the bag for others to borrow.
     *
     * @param bagEntry an object to add to the bag
     */
    public void add(final T bagEntry) {
        if (closed) {
            throw new IllegalStateException("ConcurrentBag has been closed, ignoring add()");
        }
        sharedList.add(bagEntry);
        synchronizer.releaseShared(sequence.incrementAndGet());
    }
}
