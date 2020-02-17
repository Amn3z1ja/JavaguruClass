package lv.javaguru.classworks.lesson3;

import java.awt.*;
import java.time.LocalDate;

public class Dog {
    private int yearOfBirth;
    private String name;
    private Color color;



    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public void voice() {
        System.out.println("vau, vau");
    }

    public void eat() {
        System.out.println("nom, nom");
    }

    public void sleep() {
        System.out.println("zzzzzz....");
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearOfBirth;
    }


}







