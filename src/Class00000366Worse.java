// original filename: 00034140.txt
// before
public class Class00000366Worse {
    private static void useOfLoggedMute() {
        Connection connection = null;
        try {
            connection = openConnection();
            readStuff(connection);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConnection(connection);
        }
    }
}
