// original filename: 00024977.txt
// before
public class Class00000192Worse {
    @Override
    void setClosed() {
        super.setClosed();
        for (int i = 0; i < numAllBlocks; i++) {
            byteArrayManager.release(cellBuffers[i].array());
            streamers.get(i).release();
        }
    }
}
