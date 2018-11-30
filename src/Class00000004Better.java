// original filename: 00021585.txt
// after
public class Class00000004Better {
    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = this.layoutInflater.inflate(R.layout.row_user, parent, false);
        return new UserViewHolder(view);
    }
}
