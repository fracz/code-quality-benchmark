// original filename: 00047079.txt
// before
public class Class00000259Worse {
    private long determineNakDelay() {
        /*
         * TODO: This should be 0 for unicast and use FeedbackDelayGenerator for multicast situations.
         */
        return TimeUnit.MILLISECONDS.toNanos(20);
    }
}
