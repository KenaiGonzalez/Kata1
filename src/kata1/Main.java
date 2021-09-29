package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    
    

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1949,9,24);
        Person person1 = new Person("Antonio",date);
        System.out.println(person1.getName() + " tiene " + person1.getAge() + " años.");
    }
    
}
    

    
    
