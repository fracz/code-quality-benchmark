// original filename: 00036967.txt
// after
public class Class00000488Worse {
    private static String getExecuteQueryMethodBeforeInsertCode() {
        StringBuilder sb = new StringBuilder();
        if (logger.isDebugEnabled()) {
            sb.append("{");
            sb.append("System.out.println(\"-----JtdsPreparedStatement.execute() method is called\");");
            sb.append("}");
        }
        return sb.toString();
    }
}
