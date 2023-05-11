package com.abdulhakimkaya.oop.inheritance_;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombok
@Data  // getter setter yapıları oluşturuldu
@NoArgsConstructor  // parametresiz constructor
@AllArgsConstructor  // bütün parametreleri alan constructor
@Builder
public class Person {
    private long id;
    private String firstName;
    private String lastName;

    public void deneme(String name){
        System.out.println(name);
    }
}
