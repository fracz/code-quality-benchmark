// original filename: 00012743.txt
// after
public class Class00000384Better {
    public boolean isNameValid(final String name, final Project project) {
        return (name != null) && (myNamesValidator.isIdentifier(name, project)) && !(myNamesValidator.isKeyword(name, project));
    }
}
