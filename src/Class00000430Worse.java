// original filename: 00025398.txt
// before
public class Class00000430Worse {
    private void clearPunctuationState(ProcessorNode processorNode) {
        Set<String> state = punctuationState.get(processorNode);
        if (state != null) {
            state.clear();
        }
    }
}
