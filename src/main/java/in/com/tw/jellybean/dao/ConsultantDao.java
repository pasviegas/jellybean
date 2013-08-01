package in.com.tw.jellybean.dao;

import in.com.tw.jellybean.models.Consultant;
import in.com.tw.jellybean.models.Project;

import java.util.List;

public class ConsultantDao {
    public boolean save(Consultant consultant){
        System.out.println("Saving...\n " + consultant.toString());
        return  true;
    }

}
