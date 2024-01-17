package rvt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        
        //Plus
        Money a = new Money(10, 0);
        Money b = new Money(5, 0);
        
        Money c = a.plus(b); 

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = a.plus(c); 

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //LessThan
        a = new Money(10, 0);
        b = new Money(3, 0);
        c = new Money(5, 0);

        System.out.println(a.lessThan(b));  
        System.out.println(b.lessThan(c));  
        
    }
}
