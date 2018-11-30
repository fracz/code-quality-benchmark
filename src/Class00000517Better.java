// original filename: 00055221.txt
// before
public class Class00000517Better {
    /**
     * This method is broken out so that HtmlDomParserContext can
     * override it.
     */
    protected XmlDocument wrapDocument(ThreadContext context, RubyClass klass, Document doc) {
        return new XmlDocument(context.getRuntime(), klass, doc);
    }
}
