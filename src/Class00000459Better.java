// original filename: 00012747.txt
// after
public class Class00000459Better {
    public static List<File> getExcludeRoots() {
        try {
            final String classPathFilePath = System.getProperty("exclude.tests.roots.file");
            return classPathFilePath != null ? loadFilesPaths(classPathFilePath) : null;
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }
}
