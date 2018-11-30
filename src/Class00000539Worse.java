// original filename: 00012323.txt
// after
public class Class00000539Worse {
    public InspectionGadgetsFix buildFix(Object... infos) {
        final Boolean noArguments = (Boolean) infos[0];
        return new StringConstructorFix(noArguments.booleanValue());
    }
}
