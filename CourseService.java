
import java.util.*;

/**
 * 
 */
public class CourseService {
    public CourseService() {
    }

    private CourseDAO courseDao;

    public Course findOneById(String courseId) {
        Course course = courseDao.findOneById(courseId);
        return course;
    }

    public List<Course> findListCourse(String inputSearch) {
        List<Course> listCourse = courseDao.findListCourse(inputSearch);
        return listCourse;
    }

    public boolean checkIsEmpty(String courseName, double price, Date startDate) {
        boolean emptyCheck = courseDao.checkIsEmpty(courseName, price, startDate);
        return emptyCheck;
    }

    public void update(Course course) {
        courseDao.update(course);
    }

    public void add(String courseId, String courseName, String description, double price, Date startDate, String coverImg, String trailer) {
        courseDao.add(courseId, courseName, description, price, startDate, coverImg, trailer);
    }

    public List<Course> findAll() {
        // TODO implement here
        return null;
    }

    public int countCourses() {
        // TODO implement here
        return 0;
    }

}