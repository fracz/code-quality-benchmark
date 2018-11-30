// original filename: 00023890.txt
// before
public class Class00000057Worse {
    public void submit(ColumnFamilyStore columnFamilyStore) {
        executor_.scheduleWithFixedDelay(new HintedHandOff(columnFamilyStore), HintedHandOffManager.intervalInMins_, HintedHandOffManager.intervalInMins_, TimeUnit.MINUTES);
    }
}
