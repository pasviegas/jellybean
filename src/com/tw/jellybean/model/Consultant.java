package com.tw.jellybean.model;

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

    public Consultant(String name,int age,Gender gender,Department department, Role role, Grade grade) {
        super(name,age,gender);
        this.department = department;
        this.role = role;
        this.grade = grade;
    }

    public Department getDepartment() {
        return department;
    }

    public Role getRole() {
        return role;
    }

    public Grade getGrade() {
        return grade;
    }
}
