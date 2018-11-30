// original filename: 00011121.txt
// before
public class Class00000001Worse {
    protected boolean checkTemplateKey(String key, CustomTemplateCallback callback) {
        List<Token> tokens = parse(key, callback);
        if (tokens != null && check(tokens)) {
            return true;
        }
        return false;
    }
}
