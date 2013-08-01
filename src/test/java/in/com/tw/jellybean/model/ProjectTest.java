package in.com.tw.jellybean.model;

import in.com.tw.jellybean.models.Project;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ProjectTest{

    @Test
    public void shouldCalculateDuration(){
        Project project = new Project();
        Calendar date = Calendar.getInstance();
        date.add(Calendar.DAY_OF_YEAR,-1);
        project.setStartDate(date.getTime());
        project.setEndDate(new Date());
        int durationInDays = project.getDurationInDays();

        assertEquals(1,durationInDays);
    }

}
