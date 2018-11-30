// original filename: 00005929.txt
// after
public class Class00000124Better {
    @Override
    public boolean isCellEditable(int row, int column) {
        return !getValueAt(row, column).equals(EMPTY_CELL_VALUE);
    }
}
