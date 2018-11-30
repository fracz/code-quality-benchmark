// original filename: 00040062.txt
// after
public class Class00000042Better {
    public Iterator<RelationshipPropertyConstraint> constraintsForRelationshipTypeAndProperty(RelationshipPropertyDescriptor descriptor) {
        return Iterators.filter(constraint -> constraint.matches(descriptor), relationshipConstraints.iterator());
    }
}
