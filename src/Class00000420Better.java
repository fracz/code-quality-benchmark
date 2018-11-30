// original filename: 00031678.txt
// after
public class Class00000420Better {
    private void updateZoomableControllerBounds() {
        getPlainBounds(mImageBounds);
        getLimitBounds(mViewBounds);
        mZoomableController.setImageBounds(mImageBounds);
        mZoomableController.setViewBounds(mViewBounds);
        FLog.v(TAG, "updateZoomableControllerBounds: view %x, view bounds: %s, image bounds: %s", this.hashCode(), mViewBounds, mImageBounds);
    }
}
