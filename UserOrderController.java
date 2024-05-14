
import java.util.*;

public class UserOrderController {

    public UserOrderController() {
    }

    private CartService cartService;

    private BillService billService;

    private BillDetailService billDetailService;

    private CourseService courseService;

    private PaymentService paymentService;

    private Bill bill;

    private BillDetail billDetail;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String userId = req.getParameter("userId");
        String courseId = req.getParameter("courseId");

        boolean boughtState = billDetailService.checkIsBought(userId, courseId);

        if(boughtState == true) {
            req.setAttribute("messError", "Khóa học đã được mua!");
            req.getRequestDispatcher("view/user/LessonList.jsp").forward(req, resp);
        } else {
            Course course = courseService.findOneById(courseId);
            req.setAttribute("course", course);
            req.getRequestDispatcher("courseOrder.jsp").forward(req, resp);
        }
    }

}