// original filename: 00049865.txt
// after
public class Class00000451Better {
    @Nullable
    @Override
    public Object getAdapter(Class adapter) {
        if (adapter == DBSStructureAssistant.class) {
            return new OracleStructureAssistant(this);
        }
        return super.getAdapter(adapter);
    }
}
