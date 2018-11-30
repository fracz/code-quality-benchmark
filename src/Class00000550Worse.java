// original filename: 00054494.txt
// after
public class Class00000550Worse {
    private SelectItem parseStarSelectItem() {
        containStar = true;
        if (!containSubquery) {
            containStarForOutQuery = true;
        }
        sqlParser.getLexer().nextToken();
        sqlParser.parseAlias();
        return new StarSelectItem(Optional.<String>absent());
    }
}
