// original filename: 00034385.txt
// before
public class Class00000209Worse {
    @Test
    public void areMoreMessagesAvailable_withoutAdditionalMessages_shouldIssueSearchCommandsUntilAllMessagesSearched() throws Exception {
        ImapFolder folder = createFolder("Folder");
        prepareImapFolderForOpen(OPEN_MODE_RW);
        folder.open(OPEN_MODE_RW);
        folder.areMoreMessagesAvailable(600, null);
        verify(imapConnection).executeSimpleCommand("SEARCH 100:599 NOT DELETED");
        verify(imapConnection).executeSimpleCommand("SEARCH 1:99 NOT DELETED");
    }
}
