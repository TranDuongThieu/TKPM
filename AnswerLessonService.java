
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
        AnswerLesson answerLesson = answerLessonDao.findOneById(answerId);
        return answerLesson;
    }

}