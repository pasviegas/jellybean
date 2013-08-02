package in.com.tw.jellybean.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: somisetn
 * Date: 31/07/13
 * Time: 3:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Consultant extends Person {
    Role role;
    Grade grade;
    Department department;
    BigDecimal experience;
    List<TimeRecord> timeRecords = new ArrayList<TimeRecord>();
    private List<Position> assignedPositions;

    public Consultant(Person person,Department department, Role role, Grade grade,BigDecimal experience) {
        super(person.getName(),person.getAge(),person.getGender());
        this.department = department;
        this.role = role;
        this.grade = grade;
        this.experience = experience;

    }

    public List<TimeRecord> getTimeRecords() {
        return timeRecords;
    }

}
