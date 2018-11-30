// original filename: 00031783.txt
// after
public class Class00000522Worse {
    private String assertLabelGroupsMatchingAndReplace(String labelTemplate, String[][] expectedGroups) throws Exception {
        assertLabelGroupsMatching(labelTemplate, expectedGroups);
        PipelineLabel label = new PipelineLabel(labelTemplate);
        label.updateLabel(MATERIAL_REVISIONS);
        return label.toString();
    }
}
