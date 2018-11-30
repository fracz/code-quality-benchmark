// original filename: 00001296.txt
// after
public class Class00000476Worse {
    @Override
    public synchronized boolean addRule(String ruleSource) {
        log.debug("Adding rule {}", ruleSource);
        liveRules.add(ruleSource);
        if (!commitRules()) {
            // adding rule failed, remove the ruleSource from our list of liveRules again.
            liveRules.remove(ruleSource);
            return false;
        }
        return true;
    }
}
