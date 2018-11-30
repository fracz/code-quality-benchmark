// original filename: 00009370.txt
// before
public class Class00000586Better {
    @Override
    public String getCodeSample(@NotNull SettingsType settingsType) {
        // noinspection EnumSwitchStatementWhichMissesCases
        switch (settingsType) {
            case SPACING_SETTINGS:
                return SPACING_SETTINGS_PREVIEW;
            case BLANK_LINE_SETTINGS:
                return BLANK_LINES_SETTINGS_PREVIEW;
            default:
                return "";
        }
    }
}
