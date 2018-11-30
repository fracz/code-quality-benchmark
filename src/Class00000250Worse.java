// original filename: 00034567.txt
// before
public class Class00000250Worse {
    @Override
    public Fragment getItem(final int position) {
        final Fragment result = DiscoveryFragment.newInstance(position);
        delegate.discoveryPagerAdapterCreatedPage(this, position);
        return result;
    }
}
