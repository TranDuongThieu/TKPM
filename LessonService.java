
import java.util.*;

/**
 * 
 */
public class LessonService {

    /**
     * Default constructor
     */
    public LessonService() {
    }

    /**
     * 
     */
    private LessonDAO lessonDao;

    /**
     * @param lessonId 
     * @return
     */
    public Lesson findOneById(String lessonId) {
        // TODO implement here
        return lessonDao.findOneById(lessonId);
    }

    /**
     * @param courseId 
     * @return
     */
    public List<Lesson> findLessonByCourse(String courseId) {
        // TODO implement here
        return lessonDao.findLessonByCourse(courseId);
    }

}