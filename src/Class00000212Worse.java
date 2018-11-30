// original filename: 00049848.txt
// before
public class Class00000212Worse {
    @Override
    @SuppressWarnings("rawtypes")
    public Object getAdapter(Class adapter) {
        if (adapter == DBSStructureAssistant.class) {
            return new DB2StructureAssistant(this);
        }
        return null;
    }
}
