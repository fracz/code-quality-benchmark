// original filename: 00055197.txt
// before
public class Class00000569Better {
    @Override
    protected FragmentMvpDelegate<V, P> getMvpDelegate() {
        if (mvpDelegate == null) {
            mvpDelegate = new FragmentMvpViewStateDelegateImpl<V, P>(this);
        }
        return mvpDelegate;
    }
}
