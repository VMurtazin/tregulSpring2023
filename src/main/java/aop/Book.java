package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Prestuplenie")
    private String name;

    @Value("Dostor")
    private String avtor;

    @Value("1999")
    private int god;

    public String getName() {
        return name;
    }

    public String getAvtor() {
        return avtor;
    }

    public int getGod() {
        return god;
    }
}
