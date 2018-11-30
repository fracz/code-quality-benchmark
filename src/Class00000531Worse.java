// original filename: 00013937.txt
// after
public class Class00000531Worse {
    static Collection<PsiElement> suggestCandidates(final PsiReference reference) {
        if (reference == null) {
            return Collections.emptyList();
        }
        return TargetElementUtilBase.getInstance().getTargetCandidates(reference);
    }
}
