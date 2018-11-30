// original filename: 00033226.txt
// before
public class Class00000191Worse {
    protected void daemonStarted(Long pid, File daemonLog) {
        // directly printing to the stream to avoid log level filtering.
        // TODO SF improve
        originalOut.println(DaemonMessages.ABOUT_TO_CLOSE_STREAMS + ";" + pid + ";" + daemonLog);
        originalOut.close();
        originalErr.close();
// TODO - make this work on windows
// originalIn.close();
    }
}
