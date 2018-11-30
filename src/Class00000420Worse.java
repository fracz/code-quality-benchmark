// original filename: 00031678.txt
// before
public class Class00000420Worse {
    private void updateZoomableControllerBounds() {
        getPlainBounds(mImageBounds);
        mViewBounds.set(0, 0, getWidth(), getHeight());
        mZoomableController.setImageBounds(mImageBounds);
        mZoomableController.setViewBounds(mViewBounds);
        FLog.v(TAG, "updateZoomableControllerBounds: view %x, view bounds: %s, image bounds: %s", this.hashCode(), mViewBounds, mImageBounds);
    }
}
