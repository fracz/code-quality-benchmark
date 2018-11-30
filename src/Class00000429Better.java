// original filename: 00003904.txt
// after
public class Class00000429Better {
    @Override
    public void actionPerformed(final AnActionEvent e) {
        IdeFrameEx frame = getFrame();
        if (frame != null) {
            frame.toggleFullScreen(!frame.isInFullScreen());
        }
    }
}
