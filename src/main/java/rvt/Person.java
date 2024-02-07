package rvt;

public class Person {
    private String name;
    private String address;

    public Person (String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.name + "\n  " + this.address;
    }

    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 Maddox Street, London"); 
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
        
    }

    
}


