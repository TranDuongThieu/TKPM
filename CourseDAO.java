
import java.util.*;

/**
 * 
 */
public class CourseDAO {

    /**
     * Default constructor
     */
    public CourseDAO() {
    }

    /**
     * @param courseId 
     * @return
     */
    public Course findOneById(String courseId) {
        // TODO implement here
        return null;
    }

    /**
     * @param inputSearch 
     * @return
     */
    public List<Course> findListCourse(String inputSearch) {
        // TODO implement here
        return null;
    }

    /**
     * @param courseName 
     * @param price 
     * @param startDate 
     * @return
     */
    public boolean checkIsEmpty(String courseName, double price, Date startDate) {
        // TODO implement here
        return false;
    }

    /**
     * @param course
     */
    public void update(Course course) {
        // TODO implement here
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
    }

    /**
     * @return
     */
    public List<Course> findAll() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int countCourses() {
        // TODO implement here
        return 0;
    }

}