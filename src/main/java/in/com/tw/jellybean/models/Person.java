package in.com.tw.jellybean.models;

/**
 * Created with IntelliJ IDEA.
 * User: somisetn
 * Date: 31/07/13
 * Time: 3:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    String name;
    Gender gender;
    int age;

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

