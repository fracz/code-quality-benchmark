// original filename: 00013113.txt
// after
public class Class00000609Worse {
    public void merge(PomChangeSet blocked) {
        final List<XmlChange> changes = ((XmlAspectChangeSetImpl) blocked).myChanges;
        for (XmlChange xmlChange : changes) {
            add(xmlChange);
        }
    }
}
