// original filename: 00001602.txt
// before
public class Class00000300Worse {
    private boolean currentWhiteSpaceIsReadOnly() {
        if (myCurrentSpaceProperty != null && myCurrentSpaceProperty.isReadOnly()) {
            return true;
        } else {
            if (myAffectedRanges == null)
                return false;
            final boolean readOnly = myAffectedRanges.isWhitespaceReadOnly(myCurrentWhiteSpace.getTextRange());
            // System.out.println("whitespace at " + myCurrentWhiteSpace.getTextRange() + (readOnly ? " is read-only" : " is not read-only"));
            return readOnly;
        }
    }
}
