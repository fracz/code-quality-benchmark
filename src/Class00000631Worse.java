// original filename: 00051585.txt
// after
public class Class00000631Worse {
    @Override
    public void setAttributeValue(@NotNull DBSAttributeBase attribute, @Nullable Object value) throws DBCException {
        values[((DBSEntityAttribute) attribute).getOrdinalPosition() - 1] = value;
    }
}
