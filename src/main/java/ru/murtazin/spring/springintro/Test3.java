package ru.murtazin.spring.springintro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");


        //Pet pet= context.getBean("myPet",Pet.class);
        //Person person=new Person(pet);

        Person person=context.getBean("myPerson",Person.class);
        person.callYourPet();
        System.out.println(person.getName()+", "+person.getAge());
        context.close();
    }
}
