
package RegistrationSystemDriver;
import RegistrationSystem.*;


/*
 * @author Ronan Larkin
 */
public class Main {
    
    public static void main(String[] args) {
        Student s1 = new Student("Ronan", "unknown", 23, 16415192);
        s1.setModules(new String[]{"CT4101", "CT561", "CT417"});
        s1.setCourses(new String[]{"Computer Science"});
        s1.getUsername();
        
        Student s2 = new Student("John", "unknown", 22, 18431241);
        s2.setModules(new String[]{"MD4101", "MD561", "MD417"});
        s2.setCourses(new String[]{"Medicine"});
        s2.getUsername();
        
        Student s3 = new Student("Patrick", "unknown", 21, 17942857);
        s3.setModules(new String[]{"EN4101", "EN561", "EN417"});
        s3.setCourses(new String[]{"Engineering"});
        s3.getUsername();
       
        Student s4 = new Student("Sarah", "unknown", 23, 16052958);
        s4.setModules(new String[]{"CM4101", "CM561", "CM417"});
        s4.setCourses(new String[]{"Commerce"});
        s4.getUsername();
        
        Student s5 = new Student("Jane", "unknown", 24, 19374829);
        s5.setModules(new String[]{"PH4101", "PH561", "PH417"});
        s5.setCourses(new String[]{"Physics"});
        s5.getUsername();
        
        Course c1 = new Course("Computer Science");
        c1.setModules(new String[]{"CT4101", "CT561", "CT417"});
        
        Course c2 = new Course("Medicine");
        c2.setModules(new String[]{"MD4101", "MD561", "MD417"});
        
        Course c3 = new Course("Engineering");
        c3.setModules(new String[]{"EN4101", "EN561", "EN417"});
        
        Course c4 = new Course("Commerce");
        c4.setModules(new String[]{"CM4101", "CM561", "CM417"});
        
        Course c5 = new Course("Physics");
        c5.setModules(new String[]{"PH4101", "PH561", "PH417"});
        
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println(c5.toString());
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());
        
    }
    
 
    
}
