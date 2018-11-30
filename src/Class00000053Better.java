// original filename: 00036998.txt
// after
public class Class00000053Better {
    private static String getExecuteQueryMethodBeforeInsertCode() {
        StringBuilder sb = new StringBuilder();
        if (logger.isDebugEnabled()) {
            sb.append("{");
            sb.append("System.out.println(\"-----PreparedStatement.executeQuery() method is called\");");
            sb.append("}");
        }
        return sb.toString();
    }
}
