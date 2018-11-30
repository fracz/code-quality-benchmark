// original filename: 00025398.txt
// after
public class Class00000430Better {
    private void clearPunctuationState(ProcessorNode processorNode) {
        if (!punctuationState.isEmpty()) {
            Map<String, Integer> state = punctuationState.row(processorNode);
            if (!state.isEmpty()) {
                state.clear();
            }
        }
    }
}
