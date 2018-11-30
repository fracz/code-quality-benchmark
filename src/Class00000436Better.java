// original filename: 00040017.txt
// after
public class Class00000436Better {
    @Override
    public Iterator<RelationshipPropertyConstraint> constraintsGetForRelationshipTypeAndPropertyKey(RelationshipPropertyDescriptor descriptor) {
        statement.assertOpen();
        return schemaRead().constraintsGetForRelationshipTypeAndPropertyKey(statement, descriptor);
    }
}
