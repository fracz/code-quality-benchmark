// original filename: 00034121.txt
// after
public class Class00000314Better {
    @Override
    public void onEvent(UserUpdatedEvent event) {
        System.out.println(String.format("User '%s' has been Updated!", event.getUser().getUsername()));
    }
}
