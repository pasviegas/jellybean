package in.com.tw.jellybean.services;

import in.com.tw.jellybean.dao.TimeRecordDao;
import in.com.tw.jellybean.models.Consultant;
import in.com.tw.jellybean.models.TimeRecord;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: pedro
 * Date: 01/08/13
 * Time: 11:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class TimeRecordServiceImpl implements TimeRecordService  {

    private final TimeRecordDao timeRecordDao;

    public TimeRecordServiceImpl(TimeRecordDao timeRecordDao) {
        this.timeRecordDao = timeRecordDao;
    }

    public TimeRecord save(TimeRecord timeRecord) {
        timeRecord.getConsultant().getTimeRecords().add(timeRecord);
        timeRecordDao.save(timeRecord);
        return timeRecord;
    }

}
