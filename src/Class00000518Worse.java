// original filename: 00012860.txt
// after
public class Class00000518Worse {
    @Override
    protected EmptyIcon createScaledInstance(float scale) {
        TwoColorsIcon icon = new TwoColorsIcon(myColorSize, getIconColor(), mySecondColor);
        icon.setPreScaled(isPreScaled());
        return this;
    }
}
