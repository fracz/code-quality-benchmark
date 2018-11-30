// original filename: 00012743.txt
// before
public class Class00000384Worse {
    public boolean isNameValid(@NotNull PyIntroduceSettings settings) {
        final String name = settings.getName();
        return (name != null) && (myNamesValidator.isIdentifier(name, settings.getProject())) && !(myNamesValidator.isKeyword(name, settings.getProject()));
    }
}
