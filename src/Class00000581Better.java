// original filename: 00029415.txt
// before
public class Class00000581Better {
    /**
     * After the store has been recovered, we need to start the engine in order to apply operations
     */
    public Map<String, Mapping> performTranslogRecovery(boolean indexExists) {
        final Map<String, Mapping> recoveredTypes = internalPerformTranslogRecovery(false, indexExists);
        assert recoveryState.getStage() == RecoveryState.Stage.TRANSLOG : "TRANSLOG stage expected but was: " + recoveryState.getStage();
        return recoveredTypes;
    }
}
