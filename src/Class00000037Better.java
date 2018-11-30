// original filename: 00003760.txt
// after
public class Class00000037Better {
    protected AbstractTreeUpdater createUpdater() {
        AbstractTreeUpdater updater = new AbstractTreeUpdater(this);
        updater.setModalityStateComponent(MergingUpdateQueue.ANY_COMPONENT);
        return updater;
    }
}
