// original filename: 00031783.txt
// before
public class Class00000522Better {
    private String assertLabelGroupsMatchingAndReplace(String labelTemplate, String[][] expectedGroups) throws Exception {
        assertLabelGroupsMatching(labelTemplate, expectedGroups);
        return PipelineLabel.replaceRevisionsInLabel(labelTemplate, MATERIAL_REVISIONS);
    }
}
