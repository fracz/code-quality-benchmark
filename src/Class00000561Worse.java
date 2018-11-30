// original filename: 00056558.txt
// after
public class Class00000561Worse {
    /**
     * Show only these channels, as far as downstream handlers are concerned.
     */
    public static LogRecordHandler showOnlyChannels(final Object... channelsToShow) {
        return new VisibilityHandler() {

            {
                hideAll();
                for (Object channel : channelsToShow) {
                    alsoShow(channel);
                }
            }
        };
    }
}
