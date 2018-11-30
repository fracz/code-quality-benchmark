// original filename: 00055197.txt
// after
public class Class00000569Worse {
    @Override
    protected FragmentMvpDelegate<V, P> getMvpDelegate() {
        if (mvpDelegate == null) {
            mvpDelegate = new FragmentMvpViewStateDelegateImpl<>(this, this, true, true);
        }
        return mvpDelegate;
    }
}
