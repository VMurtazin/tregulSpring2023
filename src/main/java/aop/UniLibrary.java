package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{


    public void getBook(){
        System.out.println("Мы берём книгу из Unilibrary");
        System.out.println("----------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("Мы добавляем книгу в Unilibrary");
        System.out.println("----------------------------");
    }

    public void returnBook(){
        System.out.println("Мы вернули книгу в Unilibrary");
        System.out.println("----------------------------");
    }

    public void getMagazine(){

        System.out.println("Мы берём magazine из Unilibrary");
        System.out.println("----------------------------");
    }

    public void returnMagazine(){
        System.out.println("Мы вернули magazine в Unilibrary");
        System.out.println("----------------------------");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал в Unilibrary");
        System.out.println("----------------------------");
    }
}
