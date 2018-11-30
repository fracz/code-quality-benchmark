// original filename: 00033204.txt
// after
public class Class00000086Better {
    private void startLockReleaseAsLockHolder(ContendedAction contendedAction) {
        contendedAction.running = true;
        unlockActionExecutor.execute(contendedAction.action);
    }
}
