// original filename: 00013937.txt
// before
public class Class00000531Better {
    static Collection<PsiElement> suggestCandidates(Project project, final PsiReference reference) {
        if (reference == null) {
            return Collections.emptyList();
        }
        return resolveElements(reference, project);
    }
}
