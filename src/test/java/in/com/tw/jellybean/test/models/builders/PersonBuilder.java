package in.com.tw.jellybean.test.models.builders;

import in.com.tw.jellybean.models.Consultant;
import in.com.tw.jellybean.models.Gender;
import in.com.tw.jellybean.models.Person;
import in.com.tw.jellybean.models.TimeRecord;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: pedro
 * Date: 01/08/13
 * Time: 12:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersonBuilder {

    public static Person build() {
        return new Person("Pp", 23, Gender.MALE);
    }
}
