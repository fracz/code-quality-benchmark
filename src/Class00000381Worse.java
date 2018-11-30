// original filename: 00035437.txt
// before
public class Class00000381Worse {
    @Override
    public void notifyRetry() {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "notify retry %s %d %d %s", task, task.getAutoRetryTimes(), task.getRetryingTimes(), task.getEx());
        }
        task.ing();
        process(FileDownloadStatus.retry);
    }
}
