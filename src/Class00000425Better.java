// original filename: 00010531.txt
// after
public class Class00000425Better {
    public void updatePeriod() {
        myPeriod++;
        myPeriod %= 12;
        myModel.nodeChanged(this);
    }
}
