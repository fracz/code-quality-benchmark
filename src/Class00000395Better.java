// original filename: 00001603.txt
// after
public class Class00000395Better {
    private boolean isReadOnly(final TextRange textRange, boolean rootIsRightBlock) {
        if (myAffectedRanges == null)
            return false;
        return myAffectedRanges.isReadOnly(textRange, rootIsRightBlock);
    }
}
