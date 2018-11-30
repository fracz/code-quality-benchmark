// original filename: 00022723.txt
// after
public class Class00000186Better {
    /**
     * <p>
     * Returns charset String guessed from the source's properties.
     * This method must be called after parsing target file(s).
     * </p>
     *
     * @return Charset String. Null is returned if guessing the source fails.
     */
    public String getEstimatedCharset() {
        if (TextUtils.isEmpty(mSpecifiedCharset)) {
            return mSpecifiedCharset;
        }
        switch (mParseType) {
            case PARSE_TYPE_WINDOWS_MOBILE_V65_JP:
            case PARSE_TYPE_DOCOMO_TORELATE_NEST:
            case PARSE_TYPE_MOBILE_PHONE_JP:
                return "SHIFT_JIS";
            case PARSE_TYPE_APPLE:
                return "UTF-8";
            default:
                return null;
        }
    }
}
