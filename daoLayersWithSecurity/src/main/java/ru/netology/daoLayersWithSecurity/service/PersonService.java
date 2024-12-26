package ru.netology.daoLayersWithSecurity.service;

import ru.netology.daoLayersWithSecurity.dao.Person;
import ru.netology.daoLayersWithSecurity.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }

    public List<Person> findByAgeLessThanOrderByAgeAsc(int age) {
        return repository.findByAgeLessThanOrderByAgeAsc(age);
    }

    public Optional<Person> findByNameAndSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }
}
