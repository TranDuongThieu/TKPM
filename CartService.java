
import java.util.*;

/**
 * 
 */
public class CartService {

    public CartService() {
    }

    private CartDAO cartDao;

    public List<Cart> findByUserId (String userId) {
        List<Cart> cartUpdated = cartDao.findByUserId(userId);
        return cartUpdated;
    }

    public void insert(Cart cart) {
        cartDao.insert(cart);
    }

    public void delete(String cartId) {
        cartDao.delete(cartId);
    }

}