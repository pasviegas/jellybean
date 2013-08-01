package in.com.tw.jellybean.services;


import in.com.tw.jellybean.dao.CustomerDao;
import in.com.tw.jellybean.models.Customer;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static junit.framework.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;


/**
 * Created with IntelliJ IDEA.
 * User: aasawaree
 * Date: 01/08/13
 * Time: 12:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerManagementServiceTest {

    private CustomerManagementServiceImpl customerManagementService;
    private Customer testCustomer;
    @Mock
    CustomerDao customerDao;

    @Before
    public void setup(){
        initMocks(this);
        customerManagementService = new CustomerManagementServiceImpl(customerDao);
        testCustomer = new Customer("testCustomer");

    }
    @Test
    public void shouldAddCustomer(){

        when(customerDao.add(testCustomer)).thenReturn(true);

        assertEquals(true, customerManagementService.add(testCustomer));

        verify(customerDao).add(testCustomer);
    }


}
