package in.com.tw.jellybean.test.models.builders;

import in.com.tw.jellybean.models.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: pedro
 * Date: 01/08/13
 * Time: 12:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConsultantBuilder {

    public static Consultant build() {
        return new Consultant(PersonBuilder.build(), Department.PS, Role.DEV, Grade.CONSULTANT, BigDecimal.ONE);
    }
}
