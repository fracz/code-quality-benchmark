// original filename: 00037520.txt
// after
public class Class00000187Better {
    public ServiceTypeRegistry build() {
        IntHashMap<ServiceType> copy = IntHashMapUtils.copy(buildMap);
        return new ServiceTypeRegistry(copy);
    }
}
