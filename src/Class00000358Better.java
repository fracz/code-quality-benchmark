// original filename: 00057994.txt
// after
public class Class00000358Better {
    /**
     * The default Redwood configuration, which prints to the console.
     * This is the usual starting point for new configurations.
     *
     * @return A basic Redwood Configuration.
     */
    public static RedwoodConfiguration standard() {
        return new RedwoodConfiguration().clear().handlers(Handlers.stdout);
    }
}
