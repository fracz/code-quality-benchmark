// original filename: 00034140.txt
// after
public class Class00000366Better {
    private static void useOfLoggedMute() throws SQLException {
        Connection connection = null;
        try {
            connection = openConnection();
            readStuff(connection);
        } finally {
            closeConnection(connection);
        }
    }
}
