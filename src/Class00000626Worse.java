// original filename: 00051590.txt
// after
public class Class00000626Worse {
    @Override
    public void setAttributeValue(@NotNull DBSAttributeBase attribute, @Nullable Object value) throws DBCException {
        values[attribute.getOrdinalPosition() - 1] = value;
    }
}
