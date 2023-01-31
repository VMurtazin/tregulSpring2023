package ru.murtazin.spring.springintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {


    private Pet pet;
    //@Value("${person.name}")
    private String name;
    //@Value("${person.age}")
    private int age;

    @Autowired

    public Person(@Qualifier("dog") Pet pet) {
    System.out.println("Person bean created");
    this.pet = pet;
    }

//    public Person() {
//        System.out.println("Person bean created");
//    }

    //@Autowired
    public void setPet(Pet pet) {
    System.out.println("Персоне добавлен питомец");
    this.pet = pet;
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

    public void callYourPet(){
        System.out.println("Hello my Pet");
        pet.say();
    }
}
