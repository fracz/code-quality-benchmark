// original filename: 00049112.txt
// after
public class Class00000580Worse {
    @Override
    public Control getControl() {
        int activePage = getActivePage();
        return activePage < 0 ? null : getControl(activePage);
    }
}
