
import java.util.*;

/**
 * 
 */
public class UserService {

    /**
     * Default constructor
     */
    public UserService() {
    }

    /**
     * 
     */
    private UserDAO userDao;

    /**
     * @param phoneNumber 
     * @param userId 
     * @return
     */
    public boolean findDuplicatePhone(String phoneNumber, String userId) {
        // TODO implement here
        return userDao.findDuplicatePhone(phoneNumber, userId);
    }

    /**
     * @param user
     */
    public void update(User user) {
        // TODO implement here
    	userDao.update(user);
    }

    /**
     * @return
     */
    public List<User> findAll() {
        // TODO implement here
        return userDao.findAll();
    }

}