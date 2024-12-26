package ru.netology.daoLayersWithSecurity.dao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PERSONS", schema = "PUBLIC")
@IdClass(Contact.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "surname")
    private String surname;
    @Id
    @Column(name = "age")
    private int age;
    @Column(name = "phone_number", length = 10)
    private String phoneNumber;
    @Column(name = "city_of_living", length = 20)
    private String cityOfLiving;
}
