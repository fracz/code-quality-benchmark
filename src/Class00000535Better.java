// original filename: 00026529.txt
// before
public class Class00000535Better {
    // /////////////////////////////// values //////////////////////////
    public static Object setValues(Object... vals) {
        ThreadLocalData.setValues(vals);
        if (vals.length > 0)
            return vals[0];
        return null;
    }
}
