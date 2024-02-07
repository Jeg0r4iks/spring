package rvt;

class Student extends Person {
    private int credits; 
    @Override
    public String toString() {
        return super.toString(); 
    }

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }
    
    public int credits() {
        return this.credits;
    }
    
    public int study() {
        return this.credits++;
    }

    
    public static void main(String[] args) {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("  " + "Study credits " + ollie.credits());
        System.out.println(ollie);
        ollie.study();
        System.out.println("  " + "Study credits "+ ollie.credits());
    
    }
}
