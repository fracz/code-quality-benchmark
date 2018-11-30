// original filename: 00039157.txt
// before
public class Class00000454Worse {
    public Master getMaster() {
        int masterId = zooClient.getMaster();
        if (masterId == machineId) {
            throw new RuntimeException("I am master");
        }
        String host = haServers.get(masterId);
        // return new MasterClient( host );
        return null;
    }
}
