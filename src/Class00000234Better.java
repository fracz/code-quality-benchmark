// original filename: 00024950.txt
// after
public class Class00000234Better {
    public DecoratedKey<StringToken> decorateKey(String key) {
        return new DecoratedKey<StringToken>(new StringToken(key), key);
    }
}
