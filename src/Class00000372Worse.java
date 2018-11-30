// original filename: 00029535.txt
// before
public class Class00000372Worse {
    String resolveIfAbsent(String indexOrAlias, IndicesOptions indicesOptions) {
        String concreteIndex = indices.get(indexOrAlias);
        if (concreteIndex == null) {
            concreteIndex = metaData.concreteSingleIndex(indexOrAlias, indicesOptions);
            indices.put(indexOrAlias, concreteIndex);
        }
        return concreteIndex;
    }
}
