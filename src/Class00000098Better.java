// original filename: 00021223.txt
// after
public class Class00000098Better {
    public void writeFieldNullString(char seperator, String name) {
        write(seperator);
        writeFieldName(name);
        writeNull(SerializerFeature.WriteNullStringAsEmpty);
    }
}
