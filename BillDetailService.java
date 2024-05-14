
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
        // TODO implement here
        return billDetailDao.checkIsBought(userId, courseId);
    }

    /**
     * @param billDetail
     */
    public void createBillDetail(BillDetail billDetail) {
        // TODO implement here
    	billDetailDao.createBillDetail(billDetail);
    }

    /**
     * @param userId 
     * @param courseId 
     * @return
     */
    public List<BillDetail> findByUserIdAndCourseId(String userId, String courseId) {
        // TODO implement here
        return billDetailDao.findByUserIdAndCourseId(userId, courseId);
    }

}