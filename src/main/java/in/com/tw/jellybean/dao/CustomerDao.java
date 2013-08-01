package in.com.tw.jellybean.dao;

import in.com.tw.jellybean.models.Customer;

/**
 * Created with IntelliJ IDEA.
 * User: aasawaree
 * Date: 01/08/13
 * Time: 12:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerDao {

    public boolean save(Customer customer) {
        System.out.println("Saving the customer");
        return true;
    }


}
