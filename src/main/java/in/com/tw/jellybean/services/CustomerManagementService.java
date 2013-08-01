package in.com.tw.jellybean.services;

import in.com.tw.jellybean.models.Customer;
import in.com.tw.jellybean.models.Project;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aasawaree
 * Date: 01/08/13
 * Time: 12:48 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerManagementService {
    boolean save(Customer customer);
    boolean addProject(Customer customer, Project projects);
}
