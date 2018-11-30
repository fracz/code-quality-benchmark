// original filename: 00001826.txt
// before
public class Class00000118Worse {
    private void doTest(@NonNls final String qClassName) throws Exception {
        doTest(new PerformAction() {

            @Override
            public void performAction(VirtualFile rootDir, VirtualFile rootAfter) throws Exception {
                SafeDeleteTest.this.performAction(qClassName);
            }
        });
    }
}
