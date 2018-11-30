// original filename: 00001602.txt
// after
public class Class00000300Better {
    private boolean currentWhiteSpaceIsReadOnly() {
        if (myCurrentSpaceProperty != null && myCurrentSpaceProperty.isReadOnly()) {
            return true;
        } else {
            if (myAffectedRanges == null)
                return false;
            return myAffectedRanges.isWhitespaceReadOnly(myCurrentWhiteSpace.getTextRange());
        }
    }
}
