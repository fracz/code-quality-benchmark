// original filename: 00006316.txt
// after
public class Class00000305Better {
    public static Lesson previousLesson(@NotNull final Lesson lesson) {
        int prevLessonIndex = lesson.getIndex() - 2;
        if (prevLessonIndex < 0) {
            return null;
        }
        return lesson.getCourse().getLessons().get(prevLessonIndex);
    }
}
