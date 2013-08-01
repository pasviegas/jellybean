package in.com.tw.jellybean.dao;

import in.com.tw.jellybean.models.TimeRecord;

import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: pedro
 * Date: 01/08/13
 * Time: 12:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimeRecordDao {

    public TimeRecord save(TimeRecord timeRecord) {
        System.out.println("Saving...\n " + timeRecord.toString());
        timeRecord.setId(createId());
        return timeRecord;
    }

    public Integer save(List<TimeRecord> timeRecords) {
        System.out.println(timeRecords.toArray().toString());
        return timeRecords.size();
    }

    private Integer createId() {
        return new Random().nextInt(10000);
    }
}
