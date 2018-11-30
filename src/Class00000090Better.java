// original filename: 00014879.txt
// after
public class Class00000090Better {
    private static ItemLatestState createResult(final SVNRevision revision, final boolean exists) {
        return new ItemLatestState(new SvnRevisionNumber(revision), exists);
    }
}
