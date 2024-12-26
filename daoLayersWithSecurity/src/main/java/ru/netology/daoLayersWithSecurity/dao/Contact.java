package ru.netology.daoLayersWithSecurity.dao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact implements Serializable {
    private String name;
    private String surname;
    private int age;
}