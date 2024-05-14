
import java.util.*;

/**
 * 
 */
public class ResultLessonService {

    /**
     * Default constructor
     */
    public ResultLessonService() {
    }

    /**
     * 
     */
    private ResultLessonDAO resultLessonDao;

    /**
     * @param userId 
     * @param lessonId 
     * @return
     */
    public List<ResultLesson> findByUserIdAndLessonId(String userId, String lessonId) {
        // TODO implement here
        return resultLessonDao.findByUserIdAndLessonId(userId, lessonId);
    }

    /**
     * @param resultLessonId 
     * @return
     */
    public ResultLesson findOneById(String resultLessonId) {
        // TODO implement here
        return resultLessonDao.findOneById(resultLessonId);
    }

    /**
     * @param resultLessonId
     */
    public void completeTest(String resultLessonId) {
        // TODO implement here

    }

}