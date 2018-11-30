// original filename: 00011501.txt
// after
public class Class00000371Better {
    @NotNull
    private static ASTNode replaceReferenceWithShort(PsiQualifiedReference reference) {
        final ASTNode node = reference.getNode();
        assert node != null;
        SourceUtil.dequalifyImpl((CompositeElement) node);
        return node;
    }
}
