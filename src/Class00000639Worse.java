// original filename: 00052263.txt
// after
public class Class00000639Worse {
    @Override
    public final Object getCell(final int columnIndex) {
        Preconditions.checkArgument(columnIndex > 0 && columnIndex < data.length + 1);
        return data[columnIndex - 1];
    }
}
