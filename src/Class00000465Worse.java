// original filename: 00055469.txt
// after
public class Class00000465Worse {
    @Override
    public Flux<DataBuffer> getBody() {
        return response.receive().map(buf -> {
            buf.retain();
            return dataBufferFactory.wrap(buf);
        });
    }
}
