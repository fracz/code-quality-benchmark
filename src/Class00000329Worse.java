// original filename: 00002948.txt
// before
public class Class00000329Worse {
    private void fillModel(List<CvsRootConfiguration> configurations) {
        for (Iterator each = configurations.iterator(); each.hasNext(); ) {
            CvsRootConfiguration obj = (CvsRootConfiguration) each.next();
            myModel.addElement(obj.getMyCopy());
        }
    }
}
