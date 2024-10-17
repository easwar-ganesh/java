import java.io.*;
class Animal {
    String color="White";
    Animal(){
        System.out.println("Animal object is created");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    String color = "Black";
    Dog() {
        super();
        System.out.println("Dog object is created");
    }
    void printcolor(){
        System.out.println("Dog color is " + color);
        System.out.println("Animal color is " + super.color);
        super.eat();
    }
}
public class superDemo3{
    public static void main(String args[]){
        Dog d = new Dog();
        d.printcolor();
    }
}
