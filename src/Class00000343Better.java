// original filename: 00034139.txt
// after
public class Class00000343Better {
    private static void readStuff(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            System.out.println("Read data from statement");
        }
    }
}
