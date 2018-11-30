// original filename: 00033299.txt
// before
public class Class00000177Worse {
    public void getModel(final Class<? extends ProjectVersion3> type, final BuildOperationParametersVersion1 operationParameters, ResultHandlerVersion1<? super ProjectVersion3> handler) throws UnsupportedOperationException, IllegalStateException {
        runLater(handler, new ConnectionAction<ProjectVersion3>() {

            public ProjectVersion3 run() {
                return connection.getModel(type, operationParameters);
            }
        });
    }
}
