// original filename: 00019002.txt
// before
public class Class00000108Worse {
    private void stopPreview() {
        camera.startPreview();
        inPreview = false;
        getHost().autoFocusUnavailable();
        camera.stopPreview();
    }
}
