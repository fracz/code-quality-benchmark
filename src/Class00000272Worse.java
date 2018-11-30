// original filename: 00003598.txt
// before
public class Class00000272Worse {
    public Lesson next() {
        if (myIndex + 1 >= myCourse.getLessons().size()) {
            return null;
        }
        return myCourse.getLessons().get(myIndex + 1);
    }
}
