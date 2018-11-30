// original filename: 00020842.txt
// after
public class Class00000201Better {
    public void loadExtend() {
        loadResource(config.getPermitNames(), "META-INF/druid-filter-wall-permit-name-mysql.txt");
        loadResource(config.getPermitSchemas(), "META-INF/druid-filter-wall-permit-schema-mysql.txt");
        loadResource(config.getPermitFunctions(), "META-INF/druid-filter-wall-permit-function-mysql.txt");
        loadResource(config.getPermitTables(), "META-INF/druid-filter-wall-permit-table-mysql.txt");
        loadResource(config.getPermitObjects(), "META-INF/druid-filter-wall-permit-object-mysql.txt");
    }
}
