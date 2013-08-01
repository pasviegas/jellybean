package in.com.tw.jellybean.services;

import in.com.tw.jellybean.models.project.Project;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: indraneel
 * Date: 31/7/13
 * Time: 3:18 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ProjectService {
    public void save(Project project);
    public void save(List<Project> project);
}
