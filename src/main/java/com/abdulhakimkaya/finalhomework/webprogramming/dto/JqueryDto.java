package com.abdulhakimkaya.finalhomework.webprogramming.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

//Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//DTO ==> validation
public class JqueryDto implements Serializable {

    //serileştirme
    public static final long serialVersionUID = 1L;

    // ID
    private Long id;

    // FirstName
    @NotNull(message = "ad yazmadınız")
    private String firstName;

    // LastName
    @NotNull(message = "soyad yazmadınız")
    private String lastName;

    // Email
    @NotNull(message = "email addres yazmadınız")
    private String email;

    // Password
    @NotNull(message = "şifreyi girmediniz")
    private String password;

    // Password Confirm
    @NotNull(message = "şifre tekrarı girmediniz")
    private String passwordConfirm;

    // Sistem tarihi almak
    private Date createdDate;
}
