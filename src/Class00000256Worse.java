// original filename: 00035719.txt
// before
public class Class00000256Worse {
    public InternalMockHandler create(MockCreationSettings settings) {
        InternalMockHandler handler = new MockHandlerImpl(settings);
        InternalMockHandler nullResultGuardian = new NullResultGuardian(handler);
        InternalMockHandler notifier = new InvocationNotifierHandler(nullResultGuardian, settings);
        return notifier;
    }
}
