
import java.util.*;

/**
 * 
 */
public class CommentService {

    /**
     * Default constructor
     */
    public CommentService() {
    }

    /**
     * 
     */
    private CommentDAO commentDao;

    /**
     * @return
     */
    public List<Comment> findAll() {
        // TODO implement here
        return commentDao.findAll();
    }

}