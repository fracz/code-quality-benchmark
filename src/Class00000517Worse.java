// original filename: 00055221.txt
// after
public class Class00000517Worse {
    /**
     * This method is broken out so that HtmlDomParserContext can
     * override it.
     */
    protected XmlDocument wrapDocument(ThreadContext context, RubyClass klass, Document doc) {
        XmlDocument xmlDocument = new XmlDocument(context.getRuntime(), klass, doc);
        xmlDocument.setEncoding(ruby_encoding);
        return xmlDocument;
    }
}
