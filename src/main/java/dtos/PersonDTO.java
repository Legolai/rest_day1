/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author tha
 */
public class PersonDTO {
    private long id;
    private String name;
    private int age;

    public static List<PersonDTO> getDtos(List<Person> people) {
        return people.stream().map(PersonDTO::new).collect(Collectors.toList());
    }

    public PersonDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonDTO(Person p) {
        if (p.getId() != null)
            this.id = p.getId();
        this.name = p.getName();
        this.age = p.getAge();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
