
import java.util.*;

/**
 * 
 */
public class AnswerLessonService {

    /**
     * Default constructor
     */
    public AnswerLessonService() {
    }

    /**
     * 
     */
    private AnswerLessonDAO answerLessonDao;

    /**
     * @param lessonId 
     * @return
     */
    public List<AnswerLesson> findByLessonId(String lessonId) {
        // TODO implement here
        return answerLessonDao.findByLessonId(lessonId);
    }

    /**
     * @param answerId 
     * @return
     */
    public AnswerLesson findOneById(String answerId) {
        // TODO implement here
        return answerLessonDao.findOneById(answerId);
    }

    /**
     * @param answerLessonUser
     */
    public void saveOrUpdate(AnswerLessonUser answerLessonUser) {
        // TODO implement here
    	answerLessonDao.saveOrUpdate(answerLessonUser);
    }

}