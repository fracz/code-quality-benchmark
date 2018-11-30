// original filename: 00038841.txt
// before
public class Class00000153Worse {
    @Override
    public Long apply(SchemaRule from) {
        IndexRule rule = (IndexRule) from;
        return rule.getPropertyKeys()[0];
    }
}
