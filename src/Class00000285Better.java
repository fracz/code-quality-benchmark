// original filename: 00010950.txt
// after
public class Class00000285Better {
    public static boolean isColumnEmpty(final RadContainer grid, final int columnIndex) {
        return canDeleteCell(grid, columnIndex, false) == CellStatus.Empty;
    }
}
