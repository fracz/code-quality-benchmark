// original filename: 00012741.txt
// after
public class Class00000432Better {
    @Override
    public void show() {
        DumbService.allowStartingDumbModeInside(DumbModePermission.MAY_START_MODAL, () -> {
            try (AccessToken ignored = TransactionGuard.getInstance().acceptNestedTransactions(TransactionKind.TEXT_EDITING)) {
                RefactoringDialog.super.show();
            }
        });
    }
}
