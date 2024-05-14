
import java.util.*;

/**
 * 
 */
public class UserCourseController {

    /**
     * Default constructor
     */
    public UserCourseController() {
    }

    /**
     * 
     */
    private BillDetailService billDetailService;

    /**
     * 
     */
    private CommentService commentService;

    /**
     * 
     */
    private CourseService courseService;

    /**
     * 
     */
    private LessonService lessonService;

    /**
     * 
     */
    private ResultLessonService resultLessonService;

    /**
     * 
     */
    private UserService userService;

    /**
     * @param req 
     * @param resp
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        // TODO implement here
        String inputSearch = req.getParameter("inputSearch");
        List<Course> listCourse = courseService.findListCourse(inputSearch);
        
    }

}