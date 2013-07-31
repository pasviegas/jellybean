package com.tw.jellybean.service;

import com.tw.jellybean.dao.ProjectDao;
import com.tw.jellybean.model.Project;

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
