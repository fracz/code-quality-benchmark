// original filename: 00019002.txt
// after
public class Class00000108Better {
    private void stopPreview() {
        if (camera.isPresent()) {
            try {
                camera.get().stopPreview();
            } catch (Exception e) {
                Log.w(TAG, e);
            }
        }
    }
}
