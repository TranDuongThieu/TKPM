
import java.util.*;

/**
 * 
 */
public class ResultLessonService {

    public ResultLessonService() {
    }

    private ResultLessonDAO resultLessonDao;

    public List<ResultLesson> findByUserIdAndLessonId(String userId, String lessonId) {
        List<ResultLesson> resultLesson = resultLessonDao.findByUserIdAndLessonId(userId, lessonId);
        return resultLesson;
    }

    public ResultLesson findOneById(String resultLessonId) {
        // TODO implement here
        return null;
    }

    public void completeTest(String resultLessonId) {
        
    }

}