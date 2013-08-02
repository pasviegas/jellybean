package in.com.tw.jellybean.services;

import in.com.tw.jellybean.dao.ProjectCapacityDao;
import in.com.tw.jellybean.models.Position;
import in.com.tw.jellybean.models.project.Project;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;


public class ProjectCapacityTest {
    private ProjectCapacityService projectCapacityService;

    @Mock
    ProjectCapacityDao projectCapacityDao;

    @Before
    public void setup(){
        initMocks(this);
        projectCapacityService = new ProjectCapacityServiceImpl(projectCapacityDao);
    }

    @Test
    public void shouldGetAllTheVacantPositions(){

        List<Position> openPositions = projectCapacityService.getAllOpenPositions();

        verify(projectCapacityDao).getAllOpenPositions();
    }

    @Test
    public void shouldVacantPositionsForProject(){

        Project project =new Project();
        List<Position> openPositions = projectCapacityService.getOpenPositions(project);

        verify(projectCapacityDao).getOpenPositions(project);
    }
}
