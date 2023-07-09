package com.abdulhakimkaya.finalhomework.webprogramming.entity;

import com.abdulhakimkaya.data.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//lombok
@Data
@NoArgsConstructor

//Entity
@Entity
@Table(name = "jquery")
public class JqueryEntity extends BaseEntity implements Serializable {
    //serileştirme
    public static final long serialVersionUID = 1L;

    @Column(name = "ad")
    private String firstName;

    @Column(name = "soyad")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password", columnDefinition = "varchar(255) default 'Hm123456@'")
    private String password;

    @Column(name = "password_confirm", columnDefinition = "varchar(255) default 'Hm123456@'")
    private String passwordConfirm;
}
