// original filename: 00039637.txt
// after
public class Class00000158Better {
    public void relationshipType(int id, String label, int... dynamicIds) throws IOException {
        Command.RelationshipTypeTokenCommand command = new Command.RelationshipTypeTokenCommand();
        command.init(withName(new RelationshipTypeTokenRecord(id), dynamicIds, label));
        write(command);
    }
}
