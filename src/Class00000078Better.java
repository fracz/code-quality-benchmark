// original filename: 00050852.txt
// after
public class Class00000078Better {
    private Point computeControlSize(GridColumn column) {
        Control headerControl = column.getHeaderControl();
        if (headerControl != null) {
            return headerControl.computeSize(SWT.DEFAULT, SWT.DEFAULT);
        }
        return new Point(0, 0);
    }
}
