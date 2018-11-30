// original filename: 00050852.txt
// before
public class Class00000078Worse {
    private Point computeControlSize(GridColumn column) {
        if (column.getHeaderControl() != null) {
            return column.getHeaderControl().computeSize(SWT.DEFAULT, SWT.DEFAULT);
        }
        return new Point(0, 0);
    }
}
