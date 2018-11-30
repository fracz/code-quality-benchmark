// original filename: 00029415.txt
// after
public class Class00000581Worse {
    /**
     * After the store has been recovered, we need to start the engine in order to apply operations
     */
    public void performTranslogRecovery(boolean indexExists) {
        internalPerformTranslogRecovery(false, indexExists);
        assert recoveryState.getStage() == RecoveryState.Stage.TRANSLOG : "TRANSLOG stage expected but was: " + recoveryState.getStage();
    }
}
