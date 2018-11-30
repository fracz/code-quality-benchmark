// original filename: 00039637.txt
// before
public class Class00000158Worse {
    public void relationshipType(int id, String label, int... dynamicIds) throws IOException {
        write(new Command.RelationshipTypeTokenCommand(null, withName(new RelationshipTypeTokenRecord(id), dynamicIds, label)));
    }
}
