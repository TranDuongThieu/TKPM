
import java.util.*;

/**
 * 
 */
public class AnswerLessonService {

    public AnswerLessonService() {
    }

    private AnswerLessonDAO answerLessonDao;

    public List<AnswerLesson> findByLessonId(String lessonId) {
        List<AnswerLesson> listAnswerLesson = answerLessonDao.findByLessonId(lessonId);
        return listAnswerLesson;
    }

    public AnswerLesson findOneById(String answerId) {
        // TODO implement here
        return null;
    }

    public void saveOrUpdate(AnswerLessonUser answerLessonUser) {
        // TODO implement here
    }

}