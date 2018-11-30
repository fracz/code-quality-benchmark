// original filename: 00011331.txt
// before
public class Class00000185Worse {
    @Override
    public PsiParser createParser(Project project) {
        RegExpParser regExpParser = new RegExpParser();
        regExpParser.setAllowDanglingMetacharacters(true);
        return regExpParser;
    }
}
