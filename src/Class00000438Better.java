// original filename: 00036988.txt
// after
public class Class00000438Better {
    private static String getCreateStatementMethodBeforeInsertCode() {
        StringBuilder sb = new StringBuilder();
        if (logger.isDebugEnabled()) {
            sb.append("{");
            sb.append("System.out.println(\"-----ConnectionImpl.createStatement() method is called\");");
            sb.append("}");
        }
        return sb.toString();
    }
}
