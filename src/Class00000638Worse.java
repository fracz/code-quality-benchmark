// original filename: 00037143.txt
// after
public class Class00000638Worse {
    protected EnhancedDataSender createTcpDataSender() {
        TestTcpDataSender tcpDataSender = new TestTcpDataSender();
        this.tcpDataSender = tcpDataSender;
        return tcpDataSender;
    }
}
