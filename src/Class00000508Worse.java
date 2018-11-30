// original filename: 00036447.txt
// after
public class Class00000508Worse {
    /**
     * human readable string
     */
    public String toString() {
        switch (code) {
            case CODE_OK:
                return "ControlMessage OK";
            case CODE_EOB:
                return "ControlMessage END_OF_BATCH";
            case CODE_FAILURE:
                return "ControlMessage FAILURE";
            case CODE_CLOSE:
                return "ControlMessage CLOSE";
        }
        return null;
    }
}
