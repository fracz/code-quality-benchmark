// original filename: 00024119.txt
// before
public class Class00000017Worse {
    @BeforeClass
    public static void defineSchema() throws ConfigurationException {
        SchemaLoader.prepareServer();
        SchemaLoader.createKeyspace(KEYSPACE1, SimpleStrategy.class, KSMetaData.optsWithRF(1), SchemaLoader.standardCFMD(KEYSPACE1, CF));
    }
}
