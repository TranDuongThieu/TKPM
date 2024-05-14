
import java.util.*;

/**
 * 
 */
public class UserService {

    public UserService() {
    }

    private UserDAO userDao;

    public boolean findDuplicatePhone(String phoneNumber, String userId) {
        boolean isExisted = userDao.findDuplicatePhone(phoneNumber, userId);
        return isExisted;
    }

    public void update(User user) {
        userDao.update(user);   
    }

    public List<User> findAll() {
        List<User> listUser = userDao.findAll();
        return listUser;
    }

}