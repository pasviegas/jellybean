package com.tw.jellybean.services;

import com.tw.jellybean.DataStore;
import com.tw.jellybean.model.Consultant;

/**
 * Created with IntelliJ IDEA.
 * User: somisetn
 * Date: 31/07/13
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConsultantManagementService {

    private DataStore dataStore;

    public ConsultantManagementService(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public boolean save(Consultant consultant) {

        return dataStore.saveConsultant(consultant);  //To change body of created methods use File | Settings | File Templates.
    }
}
