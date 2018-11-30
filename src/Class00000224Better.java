// original filename: 00038645.txt
// after
public class Class00000224Better {
    public Response<Void> doneCommitting(SlaveContext context) {
        try {
            return sendRequest(RequestType.DONE_COMMITTING, context, new Serializer() {

                public void write(ChannelBuffer buffer) throws IOException {
                }
            }, VOID_DESERIALIZER);
        } finally {
            releaseChannel();
        }
    }
}
