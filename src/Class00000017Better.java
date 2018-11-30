// original filename: 00024119.txt
// after
public class Class00000017Better {
    @BeforeClass
    public static void defineSchema() throws ConfigurationException {
        SchemaLoader.prepareServer();
        cfm = SchemaLoader.standardCFMD(KEYSPACE1, CF);
        SchemaLoader.createKeyspace(KEYSPACE1, SimpleStrategy.class, KSMetaData.optsWithRF(1), cfm);
    }
}
