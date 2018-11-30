// original filename: 00012747.txt
// before
public class Class00000459Worse {
    public static String[] getExcludeRoots() {
        try {
            final String classPathFilePath = System.getProperty("exclude.tests.roots.file");
            return classPathFilePath != null ? parseUrls(classPathFilePath) : null;
        } catch (Exception e) {
            // noinspection SSBasedInspection
            return new String[0];
        }
    }
}
