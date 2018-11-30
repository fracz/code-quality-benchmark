// original filename: 00052029.txt
// before
public class Class00000026Worse {
    protected Color getHeaderForeground() {
        if (grid.getRowLabelProvider() instanceof IColorProvider) {
            return ((IColorProvider) grid.getRowLabelProvider()).getForeground(getRow());
        } else {
            return null;
        }
    }
}
