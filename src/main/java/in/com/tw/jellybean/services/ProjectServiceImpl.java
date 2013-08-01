package in.com.tw.jellybean.services;



import in.com.tw.jellybean.dao.ProjectDao;
import in.com.tw.jellybean.models.project.Project;

import java.util.List;

public class ProjectServiceImpl implements ProjectService {
    private ProjectDao projectDao;

    public ProjectServiceImpl(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @Override
    public void save(Project project) {
        projectDao.save(project);
    }

    @Override
    public void save(List<Project> projects) {
        projectDao.save(projects);
    }
}
