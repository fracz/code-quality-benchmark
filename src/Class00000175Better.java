// original filename: 00031213.txt
// after
public class Class00000175Better {
    /**
     * Test creates the {@link Query} from the {@link QueryBuilder} under test and delegates the
     * assertions being made on the result to the implementing subclass.
     */
    @Test
    public void testToQuery() throws IOException {
        QueryParseContext context = createContext();
        context.setMapUnmappedFieldAsString(true);
        assertLuceneQuery(testQuery, testQuery.toQuery(context), context);
    }
}
