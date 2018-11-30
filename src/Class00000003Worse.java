// original filename: 00001813.txt
// before
public class Class00000003Worse {
    private void doTest(final String[] packageNames, final String newPackageName) throws Exception {
        doTest(new PerformAction() {

            @Override
            public void performAction(VirtualFile rootDir, VirtualFile rootAfter) throws Exception {
                MovePackageTest.this.performAction(packageNames, newPackageName);
            }
        });
    }
}
