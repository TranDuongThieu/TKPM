
import java.util.*;

/**
 * 
 */
public class BillDetailService {

    /**
     * Default constructor
     */
    public BillDetailService() {
    }

    /**
     * 
     */
    private BillDetailDAO billDetailDao;

    /**
     * @param userId 
     * @param courseId 
     * @return
     */
    public boolean checkIsBought(String userId, String courseId) {
        boolean boughtState = billDetailDao.checkIsBought(userId, courseId);
        return boughtState;
    }

    /**
     * @param billDetail
     */
    public void createBillDetail(BillDetail billDetail) {
        // TODO implement here
    }

    /**
     * @param userId 
     * @param courseId 
     * @return
     */
    public List<BillDetail> findByUserIdAndCourseId(String userId, String courseId) {
        // TODO implement here
        return null;
    }

}