
import java.util.*;

/**
 * 
 */
public class UserOrderController {

    /**
     * Default constructor
     */
    public UserOrderController() {
    }

    /**
     * 
     */
    private CartService cartService;

    /**
     * 
     */
    private BillService billService;

    /**
     * 
     */
    private BillDetailService billDetailService;

    /**
     * 
     */
    private CourseService courseService;

    /**
     * 
     */
    private PaymentService paymentService;

    /**
     * 
     */
    private Bill bill;

    /**
     * 
     */
    private BillDetail billDetail;

    /**
     * @param req 
     * @param resp
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        // TODO implement here
        String userId = req.getParameter("userId");
        String courseId = req.getParameter("courseId");

        boolean boughtState = checkIsBought(userId, courseId);
        Course course = courseService.findOneById(courseId); 
    }

}