// original filename: 00031667.txt
// before
public class Class00000344Worse {
    /**
     * Gets the current scale factor.
     */
    @Override
    public float getScaleFactor() {
        mActiveTransform.getValues(mTempValues);
        return mTempValues[Matrix.MSCALE_X];
    }
}
