import com.tw.jellybean.DataStore;
import com.tw.jellybean.model.*;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

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

    @Before
    public void setup(){
        dataStore = new DataStore();
        consultant = new Consultant("test",23, Gender.MALE, Department.PS, Role.DEV, Grade.CONSULTANT);
    }

    @Test
    public void shouldSaveConsultant(){
        boolean saveResult = dataStore.saveConsultant(consultant);

        assertEquals(true,saveResult);
        assertEquals(1, dataStore.getConsultants().size());
        assertEquals(consultant,dataStore.getConsultants().get(0));

    }

}
