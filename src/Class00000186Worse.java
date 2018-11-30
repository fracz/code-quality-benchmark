// original filename: 00022723.txt
// before
public class Class00000186Worse {
    /**
     * Return charset String guessed from the source's properties.
     * This method must be called after parsing target file(s).
     *
     * @return Charset String. Null is returned if guessing the source fails.
     */
    public String getEstimatedCharset() {
        if (mSpecifiedCharset != null) {
            return mSpecifiedCharset;
        }
        switch (mType) {
            case VCardConfig.PARSE_TYPE_WINDOWS_MOBILE_JP:
            case VCardConfig.PARSE_TYPE_FOMA:
            case VCardConfig.PARSE_TYPE_MOBILE_PHONE_JP:
                return "SHIFT_JIS";
            case VCardConfig.PARSE_TYPE_APPLE:
                return "UTF-8";
            default:
                return null;
        }
    }
}
