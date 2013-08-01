package in.com.tw.jellybean.dao;

import in.com.tw.jellybean.models.Role;
import in.com.tw.jellybean.models.project.Project;
import in.com.tw.jellybean.models.Slot;

import java.util.Arrays;
import java.util.List;

public class ProjectCapacityDao {
    public List<Slot> getOpenSlots(Project project) {
        return Arrays.asList(new Slot[]{new Slot(Role.DEV,new Project()), new Slot(Role.DEV,new Project())});  //To change body of created methods use File | Settings | File Templates.
    }

    public List<Slot> getAllOpenSlots() {
        return Arrays.asList(new Slot[]{new Slot(Role.DEV,new Project()), new Slot(Role.DEV,new Project())});  //To change body of created methods use File | Settings | File Templates.
    }
}
