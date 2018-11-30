// original filename: 00021222.txt
// before
public class Class00000328Worse {
    public void writeFieldNullNumber(char seperator, String name) {
        write(seperator);
        writeFieldName(name);
        if (isEnabled(SerializerFeature.WriteNullNumberAsZero)) {
            write('0');
        } else {
            writeNull();
        }
    }
}
