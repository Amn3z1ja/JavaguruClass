package Examples;

import java.awt.*;

public class DogTest2 {

        public static void main(String[] args) {
            Dog2 myDog = new Dog2();

            myDog.setName("Kukii");
            myDog.setColor(Color.GREEN);
            myDog.setAge(10);


            String myDogsName = myDog.getName();
            Color myDogsColor = myDog.getColor();
            int myDogsAge = myDog.getAge();

            System.out.println("Manu suni sauc ,"+ myDogsName);
            System.out.println("viņš ir "+myDogsColor);
            System.out.println("un viņam ir "+ myDogsAge+" gadi");





//        String myDogs2Name = myDog2.getName;
//        String myDogs2Age = myDog2.getAge;

//        System.out.println("My dog name is"+myDog2.setName);

        }
    }


