// original filename: 00015910.txt
// before
public class Class00000087Worse {
    private PsiClass findClass(Project project, String qualifiedName) {
        JavaPsiFacade javaFacade = JavaPsiFacade.getInstance(project);
        GlobalSearchScope javaSearchScope = GlobalSearchScope.allScope(project);
        return javaFacade.findClass(qualifiedName, javaSearchScope);
    }
}
