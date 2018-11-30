// original filename: 00011485.txt
// after
public class Class00000236Better {
    public TailType getTailType() {
        final TailType tailType = (TailType) getAttribute(CompletionUtil.TAIL_TYPE_ATTR);
        return tailType != null ? tailType : TailType.UNKNOWN;
    }
}
