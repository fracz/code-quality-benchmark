// original filename: 00034120.txt
// after
public class Class00000457Better {
    @Override
    public void onEvent(UserCreatedEvent event) {
        System.out.println(String.format("User '%s' has been Created!", event.getUser().getUsername()));
    }
}
