// original filename: 00055469.txt
// before
public class Class00000465Better {
    @Override
    public Flux<DataBuffer> getBody() {
        return channel.receiveByteBuffer().map(dataBufferFactory::wrap);
    }
}
