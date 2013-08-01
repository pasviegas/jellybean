package in.com.tw.jellybean.test.models.builders;

import in.com.tw.jellybean.models.TimeRecord;

import java.math.BigDecimal;
import java.util.Date;

public class TimeRecordBuilder {

    public static TimeRecord build() {
        return new TimeRecord("lala", new Date(), BigDecimal.ONE, "done it", ConsultantBuilder.build());
    }
}