// original filename: 00052263.txt
// before
public class Class00000639Better {
    @Override
    public final Object getCell(final int columnIndex) {
        Preconditions.checkArgument(inRange(columnIndex));
        return rowData[columnIndex - 1];
    }
}
