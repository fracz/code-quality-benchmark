// original filename: 00031213.txt
// before
public class Class00000175Worse {
    /**
     * Test creates the {@link Query} from the {@link QueryBuilder} under test and delegates the
     * assertions being made on the result to the implementing subclass.
     */
    @Test
    public void testToQuery() throws IOException {
        QueryParseContext context = new QueryParseContext(index, queryParserService);
        assertLuceneQuery(this.testQuery, this.testQuery.toQuery(context));
    }
}
