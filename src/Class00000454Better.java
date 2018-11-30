// original filename: 00039157.txt
// after
public class Class00000454Better {
    public Master getMaster() {
        int masterId = zooClient.getMaster();
        if (masterId == machineId) {
            throw new RuntimeException("I am master");
        }
        String host = haServers.get(masterId);
        return new MasterClient(host, getHaServerPort(masterId));
    }
}
