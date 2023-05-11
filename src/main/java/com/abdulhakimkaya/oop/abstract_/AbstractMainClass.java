package com.abdulhakimkaya.oop.abstract_;

public class AbstractMainClass {
    public static void main(String[] args) {

        // Person
        Person person = new Student();
        person.setId(3L);
        person.setFirstName("Ömer Faruk");
        person.setLastName("DOĞAN");

        System.out.println(person);

        // Student
        Student student = new Student();
        student.setId(1L);
        student.setFirstName("Abdulhakim");
        student.setLastName("KAYA");

        student.deneme("Öğrenci");

        System.out.println(student);

        // Teacher
        Teacher teacher = new Teacher();
        teacher.setId(2L);
        teacher.setFirstName("Hamit");
        teacher.setLastName("MIZRAK");

        teacher.deneme("Öğretmen");

        System.out.println(teacher);
    }
}
