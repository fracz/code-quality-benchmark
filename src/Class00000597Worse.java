// original filename: 00051230.txt
// after
public class Class00000597Worse {
    @Nullable
    @Override
    public String getDescription() {
        final DBSEntityAttribute attribute = getAttribute();
        return attribute == null ? null : attribute.getDescription();
    }
}
