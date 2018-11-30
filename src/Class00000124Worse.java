// original filename: 00005929.txt
// before
public class Class00000124Worse {
    @Override
    public boolean isCellEditable(int row, int column) {
        if (getValueAt(row, column).equals(EMPTY_CELL_VALUE)) {
            return false;
        }
        return true;
    }
}
