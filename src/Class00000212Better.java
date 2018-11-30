// original filename: 00049848.txt
// after
public class Class00000212Better {
    @Override
    @SuppressWarnings("rawtypes")
    public Object getAdapter(Class adapter) {
        if (adapter == DBSStructureAssistant.class) {
            return new DB2StructureAssistant(this);
        }
        return super.getAdapter(adapter);
    }
}
