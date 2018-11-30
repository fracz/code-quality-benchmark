// original filename: 00056125.txt
// before
public class Class00000357Worse {
    public void defaultConfiguration() {
        ClientCodecConfigurer configurer = new ClientCodecConfigurer();
        configurer.getReaders().forEach(this::messageReader);
        configurer.getWriters().forEach(this::messageWriter);
    }
}
