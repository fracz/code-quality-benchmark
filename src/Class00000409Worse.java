// original filename: 00033119.txt
// before
public class Class00000409Worse {
    @TaskAction
    void generate() {
        if (domainObject == null) {
            throw new IllegalStateException("Domain object was not configured for this task. See configureDomainObject() method.");
        }
        generator.write(domainObject, getOutputFile());
    }
}
