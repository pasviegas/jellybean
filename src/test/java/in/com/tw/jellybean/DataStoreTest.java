package in.com.tw.jellybean;

import in.com.tw.jellybean.DataStore;
import in.com.tw.jellybean.models.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: somisetn
 * Date: 31/07/13
 * Time: 3:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataStoreTest {
    DataStore dataStore;
    Consultant consultant;
    private Person testPerson;


    @Before
    public void setup() {
        dataStore = new DataStore();
        testPerson = new Person("test", 23, Gender.MALE);
        consultant = new Consultant(testPerson, Department.PS, Role.DEV, Grade.CONSULTANT);
    }

    @Test
    public void shouldSaveConsultant() {
        boolean saveResult = dataStore.saveConsultant(consultant);

        assertEquals(true, saveResult);
        assertEquals(1, dataStore.getConsultants().size());
        assertEquals(consultant, dataStore.getConsultants().get(0));

    }

}
