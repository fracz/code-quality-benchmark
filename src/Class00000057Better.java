// original filename: 00023890.txt
// after
public class Class00000057Better {
    public void submit(final ColumnFamilyStore columnFamilyStore) {
        Runnable r = new Runnable() {

            public void run() {
                deliverAllHints(columnFamilyStore);
            }
        };
        executor_.scheduleWithFixedDelay(r, HintedHandOffManager.intervalInMins_, HintedHandOffManager.intervalInMins_, TimeUnit.MINUTES);
    }
}
