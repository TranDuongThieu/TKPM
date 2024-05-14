
import java.util.*;

/**
 * 
 */
public class CommentService {

    public CommentService() {
    }

    private CommentDAO commentDao;

    public List<Comment> findAll() {
        List<Comment> listCmt = commentDao.findAll();
        return listCmt;
    }

}