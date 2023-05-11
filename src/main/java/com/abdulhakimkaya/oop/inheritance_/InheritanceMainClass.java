package com.abdulhakimkaya.oop.inheritance_;

public class InheritanceMainClass {
    public static void main(String[] args) {

        // Person
        Person person = new Person();
        person.setId(3L);
        person.setFirstName("Ömer Faruk");
        person.setLastName("DOĞAN");

        System.out.println(person);

        // Student
        Student student = new Student();
        student.setId(1L);
        student.setFirstName("Abdulhakim");
        student.setLastName("KAYA");
        student.setAge(20);

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
