package in.com.tw.jellybean.services;


import in.com.tw.jellybean.dao.ProjectDao;
import in.com.tw.jellybean.models.Project;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class ProjectServiceImplTest {

    @Mock
    ProjectDao mockProjectDao;

    @Before
    public void setup(){
        initMocks(this);
    }

    @org.junit.Test
    public void shouldSaveProject() throws Exception {
        ProjectService projectService =  new ProjectServiceImpl(mockProjectDao);
        Project project = new Project();
        projectService.save(project);
        verify(mockProjectDao).save(project);
    }

    @org.junit.Test
    public void shouldSaveAllProjects() throws Exception {
        ProjectService projectService =  new ProjectServiceImpl(mockProjectDao);
        List<Project> projectList = new ArrayList<Project>();
        projectService.save(projectList);
        verify(mockProjectDao).save(projectList);
    }
}
