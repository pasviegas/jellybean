package com.tw.jellybean.service;

import com.tw.jellybean.dao.ProjectDao;
import com.tw.jellybean.model.Project;
import org.junit.Before;
import org.mockito.Mock;

import static org.mockito.MockitoAnnotations.initMocks;

public class ProjectServiceImplTest {

    @Mock
    ProjectDao mockProjectDao;

    @Before
    public void setup(){
        initMocks(mockProjectDao);
    }

    @org.junit.Test
    public void shouldSaveProject() throws Exception {
        ProjectService projectService =  new ProjectServiceImpl(mockProjectDao);
        Project project = new Project();
        projectService.save(project);
    }

    @org.junit.Test
    public void shouldSaveAllProjects() throws Exception {


    }
}
