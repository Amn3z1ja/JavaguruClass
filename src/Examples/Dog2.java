package Examples;

import java.awt.*;

public class Dog2 {

    private int age;
    private Color color;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor(){
        return color;
    }
    public void  setColor(Color color){
        this.color = color ;
    }

    public String getName(){
        return name;
    }
    public void setName( String name){
        this.name = name;
    }

    public void voice(){
        System.out.println("vuff, vuff");
    }public void eat(){
        System.out.println("njom, njom");
    }public void sleep(){
        System.out.println("zzz, zzzz");
    }



}
