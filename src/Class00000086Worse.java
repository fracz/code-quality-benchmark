// original filename: 00033204.txt
// before
public class Class00000086Worse {
    private void startLockReleaseAsLockHolder(ContendedAction contendedAction) {
        unlockActionExecutor.execute(contendedAction.action);
        contendedAction.running = true;
    }
}
