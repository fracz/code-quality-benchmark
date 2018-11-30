// original filename: 00021223.txt
// before
public class Class00000098Worse {
    public void writeFieldNullString(char seperator, String name) {
        write(seperator);
        writeFieldName(name);
        if (isEnabled(SerializerFeature.WriteNullStringAsEmpty)) {
            writeString("");
        } else {
            writeNull();
        }
    }
}
