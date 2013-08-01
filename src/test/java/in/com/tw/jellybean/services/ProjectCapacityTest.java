package in.com.tw.jellybean.services;

import in.com.tw.jellybean.dao.ProjectCapacityDao;
import in.com.tw.jellybean.models.project.Project;
import in.com.tw.jellybean.models.Slot;
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
    public void shouldGetAllTheVacantSlots(){

        List<Slot> openSlots = projectCapacityService.getAllOpenSlots();

        verify(projectCapacityDao).getAllOpenSlots();
    }

    @Test
    public void shouldVacantSlotsForProject(){

        Project project =new Project();
        List<Slot> openSlots = projectCapacityService.getOpenSlots(project);

        verify(projectCapacityDao).getOpenSlots(project);
    }
}
