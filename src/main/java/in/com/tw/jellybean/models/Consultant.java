package in.com.tw.jellybean.models;

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
    float experience;

    public Consultant(Person person,Department department, Role role, Grade grade,float experience) {
        super(person.getName(),person.getAge(),person.getGender());
        this.department = department;
        this.role = role;
        this.grade = grade;
        this.experience = experience;

    }

}
