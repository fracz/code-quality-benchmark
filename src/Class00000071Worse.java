// original filename: 00034666.txt
// before
public class Class00000071Worse {
    @Override
    public WritableCallback getWriteableCallback() {
        Assert.fail("BufferingDataSink is always writeable.");
        return null;
    }
}
