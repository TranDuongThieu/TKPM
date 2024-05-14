
import java.util.*;

/**
 * 
 */
public class LessonService {

    public LessonService() {
    }

    private LessonDAO lessonDao;

    public Lesson findOneById(String lessonId) {
        Lesson lesson = lessonDao.findOneById(lessonId);
        return lesson;
    }

    public List<Lesson> findLessonByCourse(String courseId) {
        // TODO implement here
        return null;
    }

}