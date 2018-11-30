// original filename: 00034981.txt
// before
public class Class00000280Worse {
    /**
     * @return The text of the currently selected item, or null if the list is empty or nothing is selected.
     */
    public String getSelection() {
        if (items.length == 0 || selectedIndex == -1)
            return null;
        return items[selectedIndex];
    }
}
