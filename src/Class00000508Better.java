// original filename: 00036447.txt
// before
public class Class00000508Better {
    public String toString() {
        switch (code) {
            case OK:
                return "OK";
            case EOB:
                return "END_OF_BATCH";
            case FAILURE:
                return "FAILURE";
            case CLOSE:
                return "CLOSE";
            default:
                return "control message w/ code " + code;
        }
    }
}
