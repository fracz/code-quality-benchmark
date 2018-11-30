// original filename: 00040017.txt
// before
public class Class00000436Worse {
    @Override
    public Iterator<RelationshipPropertyConstraint> constraintsGetForRelationshipTypeAndPropertyKey(int typeId, int propertyKeyId) {
        statement.assertOpen();
        return schemaRead().constraintsGetForRelationshipTypeAndPropertyKey(statement, typeId, propertyKeyId);
    }
}
