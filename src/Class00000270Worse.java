// original filename: 00040201.txt
// before
public class Class00000270Worse {
    /**
     * We currently only support uniqueness constraints on a single property.
     */
    public static UniquePropertyConstraintRule uniquenessConstraintRule(long id, int labelId, int propertyKeyId, long ownedIndexRule) {
        return new UniquePropertyConstraintRule(id, labelId, new int[]{propertyKeyId}, ownedIndexRule);
    }
}
