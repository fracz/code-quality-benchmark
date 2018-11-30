// original filename: 00023774.txt
// before
public class Class00000199Worse {
    @Override
    public void onChanged() {
        // TODO(stable-id): This is causing b/22765812
        mSelection.clear();
        // TODO(stable-id): Improve this. It's currently super-inefficient,
        // performing a bunch of lookups and inserting into a List. Maybe just add
        // another method to the SelectionEnvironment to just grab the whole list at
        // once.
        mModelIds.clear();
        for (int i = 0; i < mEnvironment.getItemCount(); ++i) {
            mModelIds.add(mEnvironment.getModelIdFromAdapterPosition(i));
        }
    }
}
