package kata1;

import java.time.LocalDate;

public class Main {
    
    

    public static void main(String[] args) {
        Person person1 = new Person("Antonio",LocalDate.of(1949, 9, 24));
        System.out.println(person1.getName() + " tiene " + person1.getAge() + " años.");
        
    }
    
}
    

    
    
