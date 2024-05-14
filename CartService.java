
import java.util.*;

/**
 * 
 */
public class CartService {

    /**
     * Default constructor
     */
    public CartService() {
    }

    /**
     * 
     */
    private CartDAO cartDao;

    /**
     * @param userId 
     * @return
     */
    public List<Cart> findByUserId (String userId) {
        // TODO implement here
        return cartDao.findByUserId(userId);
    }

    /**
     * @param cart
     */
    public void insert(Cart cart) {
        // TODO implement here
    	cartDao.insert(cart);
    }

    /**
     * @param cartId
     */
    public void delete(String cartId) {
    	cartDao.delete(cartId);
        // TODO implement here
    }

}