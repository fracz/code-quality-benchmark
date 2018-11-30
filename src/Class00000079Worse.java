// original filename: 00019019.txt
// before
public class Class00000079Worse {
    @Override
    public void draw(Canvas canvas) {
        if (mBitmap != null && !mBitmap.isRecycled()) {
            final Rect r = getBounds();
            canvas.drawBitmap(mBitmap, null, r, mPaint);
        }
    }
}
