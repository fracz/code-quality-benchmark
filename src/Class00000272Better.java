// original filename: 00003598.txt
// after
public class Class00000272Better {
    public Lesson next() {
        List<Lesson> lessons = myCourse.getLessons();
        if (myIndex + 1 >= lessons.size()) {
            return null;
        }
        return lessons.get(myIndex + 1);
    }
}
