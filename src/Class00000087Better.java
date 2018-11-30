// original filename: 00015910.txt
// after
public class Class00000087Better {
    private PsiClass findClass(String qualifiedName) {
        Project project = getProject();
        JavaPsiFacade javaFacade = JavaPsiFacade.getInstance(project);
        GlobalSearchScope javaSearchScope = GlobalSearchScope.allScope(project);
        return javaFacade.findClass(qualifiedName, javaSearchScope);
    }
}
