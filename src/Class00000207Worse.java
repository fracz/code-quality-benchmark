// original filename: 00051917.txt
// before
public class Class00000207Worse {
    /**
     * Sets the list of choices for the combo box
     *
     * @param items the list of choices for the combo box
     */
    public void setItems(String[] items) {
        Assert.isNotNull(items);
        this.items = items;
        populateComboBoxItems();
        if (proposalProvider != null) {
            proposalProvider.setProposals(items);
        }
    }
}
