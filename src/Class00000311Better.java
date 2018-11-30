// original filename: 00055069.txt
// after
public class Class00000311Better {
    private NClass addClass(ClassNode cls) {
        String rawName = cls.getRawName();
        NClass nClass = new NClass(rawName, -1);
        nameMap.put(rawName, nClass);
        return nClass;
    }
}
