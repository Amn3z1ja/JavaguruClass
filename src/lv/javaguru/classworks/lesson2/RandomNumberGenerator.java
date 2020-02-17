package lv.javaguru.classworks.lesson2;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int generatedValue = random.nextInt(101);
        System.out.println(generatedValue);
    }
}
