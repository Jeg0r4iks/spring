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

        System.out.println(a); //10.00e
        System.out.println(b); //5.00e
        System.out.println(c); //15.00e

        a = a.plus(c); 

        System.out.println(a);//25.00e
        System.out.println(b);//5.00e
        System.out.println(c);//15.00e

        //LessThan
        b = new Money(3, 0);
        c = new Money(5, 0);

        System.out.println(a.lessThan(b));//false  
        System.out.println(b.lessThan(c));//true
        
        //Minus 
        a = new Money(10, 0);
        b = new Money(3, 50); 

        c = a.minus(b); 

        System.out.println(a);//10.00e
        System.out.println(b);//3.50e
        System.out.println(c);//6.50e

        c = c.minus(a);

        System.out.println(a);//10.00e
        System.out.println(b);//3.50e
        System.out.println(c);//0.00e
        
    }
}
