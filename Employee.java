import java.io.*;
import java.util.*;
class Employee
 {
    float salary = 500; 
    Employee() {
        System.out.println("salary of employee is" + salary); 
    }
}

class Programmer extends Employee {
    int Bonus;
    void display() {
        System.out.println("salary of the programmer is " + (salary + Bonus)); 
    }

    public static void main(String args[]) {
        Employee e = new Employee();
        Programmer p = new Programmer(); 
        e.salary = 500;
        p.Bonus = 100;
        System.out.println("Salary of the employee is: " + e.salary);
        System.out.println("Bonus of the programmer is: " + p.Bonus);
        p.display();
    }
}
