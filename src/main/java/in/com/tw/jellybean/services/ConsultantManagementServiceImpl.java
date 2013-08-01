package in.com.tw.jellybean.services;

import in.com.tw.jellybean.dao.ConsultantDao;
import in.com.tw.jellybean.models.Consultant;

/**
 * Created with IntelliJ IDEA.
 * User: somisetn
 * Date: 31/07/13
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConsultantManagementServiceImpl implements ConsultantManagementService{

    private ConsultantDao consultantDao;

    public ConsultantManagementServiceImpl(ConsultantDao consultantDao) {
        this.consultantDao = consultantDao;
    }

    public boolean save(Consultant consultant) {

        return consultantDao.save(consultant);  //To change body of created methods use File | Settings | File Templates.
    }
}
