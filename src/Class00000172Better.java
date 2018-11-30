// original filename: 00025782.txt
// after
public class Class00000172Better {
    private void generateId() {
        // id = "note_"+System.currentTimeMillis()+"_"+new Random(System.currentTimeMillis()).nextInt();
        /**
         * This is actually more humain readable
         */
        id = IdHashes.encode(System.currentTimeMillis() + new Random(System.currentTimeMillis()).nextInt());
    }
}
