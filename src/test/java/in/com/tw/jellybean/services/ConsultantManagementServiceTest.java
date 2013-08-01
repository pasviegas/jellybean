package in.com.tw.jellybean.services;

import in.com.tw.jellybean.dao.ConsultantDao;
import in.com.tw.jellybean.models.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

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
    private Person testPerson;

    @Mock
    ConsultantDao consultantDao;

    @Before
    public void setup(){
        initMocks(this);
        testPerson = new Person("test",23, Gender.MALE);
        consultantManagementService = new ConsultantManagementServiceImpl(consultantDao);
        consultant = new Consultant( testPerson,Department.PS, Role.DEV, Grade.CONSULTANT, BigDecimal.valueOf(3.2f));
    }
    @Test
    public void shouldSaveConsultant(){

        when(consultantDao.save(consultant)).thenReturn(true);

        assertEquals(true, consultantManagementService.save(consultant));

        verify(consultantDao).save(consultant);
    }


}
