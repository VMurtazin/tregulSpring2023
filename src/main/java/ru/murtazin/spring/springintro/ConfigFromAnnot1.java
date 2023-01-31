package ru.murtazin.spring.springintro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigFromAnnot1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new
                ClassPathXmlApplicationContext("applicationContext3.xml");
    Person person=context.getBean("personBean",Person.class);
    person.callYourPet();
//        Cat cat=context.getBean("catBean",Cat.class);
//        cat.say();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        context.close();


    }
}
