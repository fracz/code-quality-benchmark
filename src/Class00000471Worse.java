// original filename: 00007071.txt
// after
public class Class00000471Worse {
    @Override
    public void run() {
        CodeStyleManagerImpl.setSequentialProcessingAllowed(false);
        try {
            for (Runnable runnable : runnables) runnable.run();
        } finally {
            CodeStyleManagerImpl.setSequentialProcessingAllowed(true);
        }
    }
}
