
import java.util.*;

public class AnswerLessonUserService {

    public AnswerLessonUserService() {
    }

    private AnswerLessonUserDAO answerLessonUserDao;

    public void saveOrUpdate(AnswerLessonUser answerLessonUser) {
        answerLessonUserDao.saveOrUpdate(answerLessonUser);
    }

}