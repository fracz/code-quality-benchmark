// original filename: 00009370.txt
// after
public class Class00000586Worse {
    @Override
    public String getCodeSample(@NotNull SettingsType settingsType) {
        if (settingsType == SettingsType.SPACING_SETTINGS)
            return SPACING_SETTINGS_PREVIEW;
        if (settingsType == SettingsType.BLANK_LINES_SETTINGS)
            return BLANK_LINES_SETTINGS_PREVIEW;
        return "";
    }
}
