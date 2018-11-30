// original filename: 00003048.txt
// before
public class Class00000461Worse {
    private RefactoringActionHandler getActionHandler(final DataContext dataContext) {
        final MoveAction.MoveProvider moveProvider = (MoveAction.MoveProvider) dataContext.getData(MoveAction.MOVE_PROVIDER);
        if (moveProvider != null) {
            return moveProvider.getHandler(dataContext);
        } else {
            return RefactoringActionHandlerFactory.getInstance().createMoveHandler();
        }
    }
}
