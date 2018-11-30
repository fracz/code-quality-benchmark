// original filename: 00060032.txt
// before
public class Class00000534Better {
    public Builder lockWait(long wait, TimeUnit unit) {
        this.lockWait = Timestamps.SYSTEM().convert(wait, unit);
        return self();
    }
}
