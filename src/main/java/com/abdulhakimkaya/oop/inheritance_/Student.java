package com.abdulhakimkaya.oop.inheritance_;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // getter setter yapıları oluşturuldu
@NoArgsConstructor  // parametresiz constructor
public class Student extends Person {

    // global variable
    private int age;

    public Student(long id, String firstName, String lastName, int age) {
        super(id, firstName, lastName);
        this.age = age;
    }

    @Override
    public void deneme(String name) {
        super.deneme(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                "} " + super.toString();
    }
}
