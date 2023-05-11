package com.abdulhakimkaya.oop.abstract_;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombok
@Data  // getter setter yapıları oluşturuldu
@NoArgsConstructor  // parametresiz constructor
@AllArgsConstructor  // bütün parametreleri alan constructor
abstract public class Person {
    private long id;
    private String firstName;
    private String lastName;

    public void deneme(String name){
        System.out.println(name);
    }

    abstract public void govdesizMethod(int age);
}
