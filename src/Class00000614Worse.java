// original filename: 00011861.txt
// after
public class Class00000614Worse {
    @NotNull
    public CommitsModel build() {
        ReadOnlyList<Commit> commits1 = new SimpleReadOnlyList<Commit>(commits);
        return CommitsModel.buildModel(commits1);
    }
}
