// original filename: 00033226.txt
// after
public class Class00000191Better {
    protected void daemonStarted(Long pid, File daemonLog) {
        // directly printing to the stream to avoid log level filtering.
        new DaemonStartupCommunication().printDaemonStarted(originalOut, pid, daemonLog);
        originalOut.close();
        originalErr.close();
// TODO - make this work on windows
// originalIn.close();
    }
}
