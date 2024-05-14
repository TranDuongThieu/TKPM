
import java.util.*;

/**
 * 
 */
public class BillDetailService {

    public BillDetailService() {
    }

    private BillDetailDAO billDetailDao;

    public boolean checkIsBought(String userId, String courseId) {
        boolean boughtState = billDetailDao.checkIsBought(userId, courseId);
        return boughtState;
    }

    public void createBillDetail(BillDetail billDetail) {
        billDetailDao.createBillDetail(billDetail);
    }

    public List<BillDetail> findByUserIdAndCourseId(String userId, String courseId) {
        List<BillDetail> userCourseList = billDetailDao.findByUserIdAndCourseId(userId, courseId);
        return userCourseList;
    }

}