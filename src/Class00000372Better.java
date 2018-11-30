// original filename: 00029535.txt
// after
public class Class00000372Better {
    String resolveIfAbsent(DocumentRequest request) {
        String concreteIndex = indices.get(request.index());
        if (concreteIndex == null) {
            concreteIndex = indexNameExpressionResolver.concreteSingleIndex(state, request);
            indices.put(request.index(), concreteIndex);
        }
        return concreteIndex;
    }
}
