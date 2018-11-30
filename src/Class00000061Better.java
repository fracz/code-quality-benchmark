// original filename: 00034717.txt
// after
public class Class00000061Better {
    public PushParser readInt(TapCallback<Integer> callback) {
        mWaiting.add(new IntWaiter(callback));
        return this;
    }
}
