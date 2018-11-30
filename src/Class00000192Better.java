// original filename: 00024977.txt
// after
public class Class00000192Better {
    @Override
    void setClosed() {
        super.setClosed();
        for (int i = 0; i < numAllBlocks; i++) {
            streamers.get(i).release();
        }
        cellBuffers.release();
    }
}
