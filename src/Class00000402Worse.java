// original filename: 00053578.txt
// before
public class Class00000402Worse {
    private void scanAlias() {
        Tokenizer tokenizer = new Tokenizer(input, dictionary, position);
        tokenizer.scanContentUntil('\"', GeneralLiterals.ALIAS);
        setTokenizerResult(tokenizer);
    }
}
