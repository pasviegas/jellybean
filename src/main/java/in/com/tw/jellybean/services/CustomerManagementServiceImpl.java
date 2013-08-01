package in.com.tw.jellybean.services;

import in.com.tw.jellybean.dao.CustomerDao;
import in.com.tw.jellybean.models.Customer;
import in.com.tw.jellybean.models.project.Project;

/**
 * Created with IntelliJ IDEA.
 * User: aasawaree
 * Date: 01/08/13
 * Time: 12:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerManagementServiceImpl  implements CustomerManagementService{

    private CustomerDao customerDao;

    public CustomerManagementServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }


    @Override
    public boolean save(Customer customer) {
        return customerDao.save(customer);
    }

}
