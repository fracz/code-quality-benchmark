// original filename: 00001603.txt
// before
public class Class00000395Worse {
    private boolean isReadOnly(final TextRange textRange, boolean rootIsRightBlock) {
        if (myAffectedRanges == null)
            return false;
        final boolean readOnly = myAffectedRanges.isReadOnly(textRange, rootIsRightBlock);
        // System.out.println("range at " + textRange + (readOnly ? " is read-only" : " is not read-only"));
        return readOnly;
    }
}
