
import java.util.*;

/**
 * 
 */
public class CourseService {

    /**
     * Default constructor
     */
    public CourseService() {
    }

    /**
     * 
     */
    private CourseDAO courseDao;

    /**
     * @param courseId 
     * @return
     */
    public Course findOneById(String courseId) {
        // TODO implement here
        return courseDao.findOneById(courseId);
    }

    /**
     * @param inputSearch 
     * @return
     */
    public List<Course> findListCourse(String inputSearch) {
        // TODO implement here
        return courseDao.findListCourse(inputSearch);
    }

    /**
     * @param courseName 
     * @param price 
     * @param startDate 
     * @return
     */
    public boolean checkIsEmpty(String courseName, double price, Date startDate) {
        // TODO implement here
        return courseDao.checkIsEmpty(courseName, price, startDate);
    }

    /**
     * @param course
     */
    public void update(Course course) {
        // TODO implement here
    	courseDao.update(course);
    }

    /**
     * @param courseId 
     * @param courseName 
     * @param description 
     * @param price 
     * @param startDate 
     * @param coverImg 
     * @param trailer
     */
    public void add(String courseId, String courseName, String description, double price, Date startDate, String coverImg, String trailer) {
        // TODO implement here
    	courseDao.add(courseId, courseName, description, price, startDate, coverImg, trailer);
    }

    /**
     * @return
     */
    public List<Course> findAll() {
        // TODO implement here
        return courseDao.findAll();
    }

    /**
     * @return
     */
    public int countCourses() {
        // TODO implement here
        return courseDao.countCourses();
    }

}