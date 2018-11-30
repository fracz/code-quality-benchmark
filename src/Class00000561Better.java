// original filename: 00056558.txt
// before
public class Class00000561Better {
    /**
     * Show only the following channels.
     *
     * @param channels The names of the channels to show.
     * @return this
     */
    public RedwoodConfiguration showOnlyChannels(final Object[] channels) {
        tasks.add(new Runnable() {

            public void run() {
                Redwood.showOnlyChannels(channels);
            }
        });
        return this;
    }
}
