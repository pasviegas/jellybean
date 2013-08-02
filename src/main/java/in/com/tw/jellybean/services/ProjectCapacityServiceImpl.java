package in.com.tw.jellybean.services;

import in.com.tw.jellybean.dao.ProjectCapacityDao;
import in.com.tw.jellybean.models.Position;
import in.com.tw.jellybean.models.project.Project;

import java.util.List;

public class ProjectCapacityServiceImpl implements ProjectCapacityService {
    private ProjectCapacityDao projectCapacityDao;

    public ProjectCapacityServiceImpl(ProjectCapacityDao projectCapacityDao) {
        this.projectCapacityDao = projectCapacityDao;
    }

    @Override
    public List<Position> getOpenPositions(Project project) {
        return projectCapacityDao.getOpenPositions(project);
    }

    @Override
    public List<Position> getAllOpenPositions() {
        return projectCapacityDao.getAllOpenPositions();
    }
}
