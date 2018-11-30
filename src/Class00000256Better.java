// original filename: 00035719.txt
// after
public class Class00000256Better {
    public InternalMockHandler create(MockCreationSettings settings) {
        InternalMockHandler handler = new MockHandlerImpl(settings);
        InternalMockHandler nullResultGuardian = new NullResultGuardian(handler);
        return new InvocationNotifierHandler(nullResultGuardian, settings);
    }
}
