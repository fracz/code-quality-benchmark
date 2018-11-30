// original filename: 00006316.txt
// before
public class Class00000305Worse {
    public static Lesson previousLesson(@NotNull final Lesson lesson) {
        if (lesson.getIndex() - 1 < 0) {
            return null;
        }
        return lesson.getCourse().getLessons().get(lesson.getIndex() - 1);
    }
}
