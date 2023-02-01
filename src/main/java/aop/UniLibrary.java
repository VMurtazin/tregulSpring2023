package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{


    public void getBook(String bookName){
        System.out.println("Мы берём книгу из Unilibrary: "+bookName);
    }

    public void returnBook(){
        System.out.println("Мы vernuli книгу v Unilibrary");
    }

    public void getMagazine(){
        System.out.println("Мы берём magazine из Unilibrary");
    }

    public void returnMagazine(){
        System.out.println("Мы vernuli magazine из Unilibrary");
    }
}
