// original filename: 00034120.txt
// before
public class Class00000457Worse {
    @Override
    public void onEvent(Event message) {
        UserCreatedEvent userCreatedEvent = (UserCreatedEvent) message;
        System.out.printf("User with %s has been Created!", userCreatedEvent.getUser().getUsername());
    }
}
