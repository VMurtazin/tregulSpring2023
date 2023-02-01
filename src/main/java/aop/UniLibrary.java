package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{


    public void getBook(){
        System.out.println("Мы берём книгу из Unilibrary");
    }

    public void addBook(){
        System.out.println("Мы добавляем книгу в Unilibrary");
    }

    public void returnBook(){
        System.out.println("Мы вернули книгу в Unilibrary");
    }

    public void getMagazine(){

        System.out.println("Мы берём magazine из Unilibrary");
    }

    public void returnMagazine(){
        System.out.println("Мы вернули magazine в Unilibrary");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал в Unilibrary");
    }
}
