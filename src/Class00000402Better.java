// original filename: 00053578.txt
// after
public class Class00000402Better {
    private Token scanAlias() {
        Tokenizer tokenizer = new Tokenizer(input, dictionary, position);
        tokenizer.scanContentUntil('\"', GeneralLiterals.ALIAS);
        return new Token(tokenizer);
    }
}
