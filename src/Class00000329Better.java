// original filename: 00002948.txt
// after
public class Class00000329Better {
    private void fillModel(List<CvsRootConfiguration> configurations) {
        for (final CvsRootConfiguration configuration : configurations) {
            myModel.addElement(configuration.getMyCopy());
        }
    }
}
