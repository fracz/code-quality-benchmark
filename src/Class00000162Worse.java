// original filename: 00006501.txt
// before
public class Class00000162Worse {
    public void setActiveKeymap(Keymap activeKeymap) {
        myActiveKeymap = (KeymapImpl) activeKeymap;
        fireActiveKeymapChanged();
    }
}
