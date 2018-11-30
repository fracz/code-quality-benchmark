// original filename: 00002347.txt
// before
public class Class00000183Worse {
    @NotNull
    @Override
    public LanguageFileType[] getFileTypes() {
        LanguageFileType jsFileType = JavaScriptSupportLoader.JAVASCRIPT;
        if (jsFileType != null) {
            return new LanguageFileType[]{jsFileType};
        }
        return new LanguageFileType[0];
    }
}
