package in.com.tw.jellybean.models;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: pedro
 * Date: 01/08/13
 * Time: 11:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class TimeRecord {

    private Integer id;
    private final String projectCode;
    private final Date date;
    private final BigDecimal timeSpent;
    private final String description;
    private final Consultant consultant;

    public TimeRecord(String projectCode, Date date, BigDecimal timeSpent, String description, Consultant consultant) {
        this.projectCode = projectCode;
        this.date = date;
        this.timeSpent = timeSpent;
        this.description = description;
        this.consultant = consultant;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "timerecord" + id;    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeRecord that = (TimeRecord) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public Consultant getConsultant() {
        return consultant;
    }
}
