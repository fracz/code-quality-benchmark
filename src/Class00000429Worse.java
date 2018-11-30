// original filename: 00003904.txt
// before
public class Class00000429Worse {
    @Override
    public void actionPerformed(final AnActionEvent e) {
        final Frame frame = getFrame();
        if (frame instanceof IdeFrameImpl) {
            WindowManagerEx.getInstanceEx().setFullScreen((IdeFrameImpl) frame, !((IdeFrameImpl) frame).isInFullScreen());
        }
    }
}
