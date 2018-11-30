// original filename: 00033299.txt
// after
public class Class00000177Better {
    public <T> void getModel(final Class<T> type, final BuildOperationParametersVersion1 operationParameters, ResultHandlerVersion1<T> handler) throws UnsupportedOperationException, IllegalStateException {
        runLater(handler, new ConnectionAction<T>() {

            public T run() {
                return connection.getModel(type, operationParameters);
            }
        });
    }
}
