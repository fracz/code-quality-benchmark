// original filename: 00057994.txt
// before
public class Class00000358Worse {
    /**
     * The default Redwood configuration, which prints to the console.
     * This is the usual starting point for new configurations.
     *
     * @return A basic Redwood Configuration.
     */
    public static RedwoodConfiguration standard() {
        return new RedwoodConfiguration().clear().console().loggingClass(Redwood.class);
    }
}
