package in.com.tw.jellybean.dao;

import in.com.tw.jellybean.models.Consultant;

public class ConsultantDao {
    public boolean save(Consultant consultant){
        System.out.println("Saving...\n " + consultant.toString());
        return  true;
    }

}
