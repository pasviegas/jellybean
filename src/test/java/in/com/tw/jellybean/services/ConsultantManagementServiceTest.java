package in.com.tw.jellybean.services;

import in.com.tw.jellybean.DataStore;
import in.com.tw.jellybean.models.*;
import in.com.tw.jellybean.services.ConsultantManagementService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static junit.framework.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.*;

/**
 * Created with IntelliJ IDEA.
 * User: somisetn
 * Date: 31/07/13
 * Time: 3:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConsultantManagementServiceTest {

    private ConsultantManagementService consultantManagementService;
    private Consultant consultant;

    @Mock
    DataStore mockDataStore;

    @Before
    public void setup(){
        initMocks(this);
        consultantManagementService = new ConsultantManagementService(mockDataStore);
        consultant = new Consultant("test",23, Gender.MALE, Department.PS, Role.DEV, Grade.CONSULTANT);
    }
    @Test
    public void shouldSaveConsultant(){

        when(mockDataStore.saveConsultant(consultant)).thenReturn(true);

        assertEquals(true, consultantManagementService.save(consultant));

        verify(mockDataStore).saveConsultant(consultant);
    }


}
