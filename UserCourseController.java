
import java.util.*;

/**
 * 
 */
public class UserCourseController {

    public UserCourseController() {
    }

    private BillDetailService billDetailService;

    private CommentService commentService;

    private CourseService courseService;

    private LessonService lessonService;

    private ResultLessonService resultLessonService;

    private UserService userService;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String inputSearch = getParameter("inputSearch");
        List<Course> listCourse = courseService.findListCourse(inputSearch);
    }

}