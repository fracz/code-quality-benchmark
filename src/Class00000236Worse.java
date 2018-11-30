// original filename: 00011485.txt
// before
public class Class00000236Worse {
    public int getTailType() {
        final Integer tailType = (Integer) getAttribute(CompletionUtil.TAIL_TYPE_ATTR);
        if (tailType != null)
            return tailType.intValue();
        return -1;
    }
}
