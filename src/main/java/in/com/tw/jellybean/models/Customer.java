package in.com.tw.jellybean.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aasawaree
 * Date: 01/08/13
 * Time: 12:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Customer {
    private String name;

    private List<Project> projects = new ArrayList<Project>();

    public Customer(String name){
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }
    public void addProject(Project project){
      projects.add(project);
    }
}
