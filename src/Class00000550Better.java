// original filename: 00054494.txt
// before
public class Class00000550Better {
    private SelectItem parseStarSelectItem() {
        if (!containSubquery) {
            containStarForOutQuery = true;
        }
        sqlParser.getLexer().nextToken();
        selectStatement.setContainStar(true);
        sqlParser.parseAlias();
        return new StarSelectItem(Optional.<String>absent());
    }
}
