// original filename: 00040062.txt
// before
public class Class00000042Worse {
    public Iterator<RelationshipPropertyConstraint> constraintsForRelationshipTypeAndProperty(final int typeId, final int propertyKeyId) {
        return Iterators.filter(constraint -> constraint.relationshipType() == typeId && constraint.propertyKey() == propertyKeyId, relationshipConstraints.iterator());
    }
}
