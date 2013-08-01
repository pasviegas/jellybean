package in.com.tw.jellybean.services;

import in.com.tw.jellybean.dao.TimeRecordDao;
import in.com.tw.jellybean.models.Consultant;
import in.com.tw.jellybean.models.TimeRecord;
import in.com.tw.jellybean.test.models.builders.TimeRecordBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created with IntelliJ IDEA.
 * User: pedro
 * Date: 01/08/13
 * Time: 11:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class TimeRecordServiceImplTest {

    private TimeRecordService timeRecordService;

    @Mock
    TimeRecordDao mockTimeRecordDao;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        timeRecordService = new TimeRecordServiceImpl(mockTimeRecordDao);
    }

    @Test
    public void shouldSaveTimeRecord() throws Exception {
        TimeRecord timeRecord = TimeRecordBuilder.build();
        TimeRecord savedTimeRecord = timeRecordService.save(timeRecord);

        when(mockTimeRecordDao.save(timeRecord)).thenReturn(timeRecord);

        assertEquals(timeRecord, savedTimeRecord);

        assertEquals(timeRecord, savedTimeRecord.getConsultant().getTimeRecords().get(0));

        verify(mockTimeRecordDao).save(timeRecord);
    }


}
