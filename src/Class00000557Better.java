// original filename: 00004796.txt
// before
public class Class00000557Better {
    public void clearCaches() {
        if (myChildren != null) {
            myChildren = null;
            myProject.subtreeChanged();
        }
    }
}
