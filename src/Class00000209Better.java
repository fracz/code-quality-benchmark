// original filename: 00034385.txt
// after
public class Class00000209Better {
    @Test
    public void areMoreMessagesAvailable_withoutAdditionalMessages_shouldIssueSearchCommandsUntilAllMessagesSearched() throws Exception {
        ImapFolder folder = createFolder("Folder");
        prepareImapFolderForOpen(OPEN_MODE_RW);
        setupSearchResponse("1 OK SEARCH Completed");
        folder.open(OPEN_MODE_RW);
        folder.areMoreMessagesAvailable(600, null);
        assertCommandIssued("UID SEARCH 100:599 NOT DELETED");
        assertCommandIssued("UID SEARCH 1:99 NOT DELETED");
    }
}
