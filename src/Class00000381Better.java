// original filename: 00035437.txt
// after
public class Class00000381Better {
    @Override
    public void notifyRetry(MessageSnapshot snapshot) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "notify retry %s %d %d %s", task, task.getAutoRetryTimes(), task.getRetryingTimes(), task.getEx());
        }
        task.ing();
        process(snapshot);
    }
}
