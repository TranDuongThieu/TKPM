
import java.util.*;

/**
 * 
 */
public class CartController {

    public CartController() {
    }

    private BillDetailService billDetailService;

    private CartService cartService;

    private CourseService courseService;

    private Cart cart;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String cartId = req.getParameter("cartId");
        User user = (User) req.getSession().getAttribute("user");
        String userId = user.getUserId();

        cartService.delete(cartId);
        List<Cart> cartUpdated = cartService.findByUserId(userId);

        int cartQuantity = cartUpdated.size();

        req.setAttribute("cart", cartUpdated);
        req.setAttribute("cartQuantity", cartQuantity);
        req.setAttribute("successMessage", "Xóa thành công");

        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath + "user/mycart");
    }

}