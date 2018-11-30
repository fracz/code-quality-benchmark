// original filename: 00040141.txt
// after
public class Class00000340Better {
    @Override
    public PropertyConstraintRule writeUniquePropertyConstraint(long ruleId, NodePropertyDescriptor descriptor, long indexId) {
        return UniquePropertyConstraintRule.uniquenessConstraintRule(ruleId, descriptor, indexId);
    }
}
