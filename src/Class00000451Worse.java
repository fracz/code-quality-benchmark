// original filename: 00049865.txt
// before
public class Class00000451Worse {
    @Nullable
    @Override
    public Object getAdapter(Class adapter) {
        if (adapter == DBSStructureAssistant.class) {
            return new OracleStructureAssistant(this);
        }
        return null;
    }
}
