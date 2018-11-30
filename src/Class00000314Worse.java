// original filename: 00034121.txt
// before
public class Class00000314Worse {
    @Override
    public void onEvent(Event message) {
        UserUpdatedEvent userUpdatedEvent = (UserUpdatedEvent) message;
        System.out.printf("User with %s has been Updated!", userUpdatedEvent.getUser().getUsername());
    }
}
