// original filename: 00006501.txt
// after
public class Class00000162Better {
    public void setActiveKeymap(Keymap activeKeymap) {
        mySchemesManager.setCurrentScheme(activeKeymap);
        fireActiveKeymapChanged();
    }
}
