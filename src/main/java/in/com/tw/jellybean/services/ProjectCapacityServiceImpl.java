package in.com.tw.jellybean.services;

import in.com.tw.jellybean.dao.ProjectCapacityDao;
import in.com.tw.jellybean.models.project.Project;
import in.com.tw.jellybean.models.Slot;

import java.util.List;

public class ProjectCapacityServiceImpl implements ProjectCapacityService {
    private ProjectCapacityDao projectCapacityDao;

    public ProjectCapacityServiceImpl(ProjectCapacityDao projectCapacityDao) {
        this.projectCapacityDao = projectCapacityDao;
    }

    @Override
    public List<Slot> getOpenSlots(Project project) {
        return projectCapacityDao.getOpenSlots(project);
    }

    @Override
    public List<Slot> getAllOpenSlots() {
        return projectCapacityDao.getAllOpenSlots();
    }
}
