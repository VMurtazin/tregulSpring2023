package ru.murtazin.spring.springintro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext2.xml");

//Dog myDog=context.getBean("myPet",Dog.class);
//Dog myDog2=context.getBean("myPet",Dog.class);
//
//        System.out.println(myDog.hashCode());
//        System.out.println(myDog2.hashCode());


        context.close();


    }
}
