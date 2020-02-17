package lv.javaguru.classworks.lesson3;

import java.awt.*;
import java.time.LocalDate;

public class DogTest {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.setName("Jerry");
        myDog.setColor(Color.BLACK);
        myDog.setYearOfBirth(1999);

        String myDogsName = myDog.getName();
        Color myDogsColor = myDog.getColor();

        int myDogsAge = myDog.getAge();



        System.out.println("My name is "+myDogsName);
        System.out.println("and he is "+myDogsColor+ " color ");
        System.out.println("He is "+ myDogsAge + " years old");

        doDogStuff(myDog);


    }

    private static void doDogStuff(Dog myDog) {
        myDog.eat();
        myDog.sleep();
    }
}
