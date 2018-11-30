// original filename: 00038645.txt
// before
public class Class00000224Worse {
    public Response<Void> doneCommitting(SlaveContext context, final int eventIdentifier) {
        return sendRequest(RequestType.DONE_COMMITTING, context, new Serializer() {

            public void write(ChannelBuffer buffer) throws IOException {
                buffer.writeInt(eventIdentifier);
            }
        }, VOID_DESERIALIZER);
    }
}
