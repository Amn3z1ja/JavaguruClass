package lv.javaguru.classworks.lesson2;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet vienu trijstūra pamatmalu");
        double mainSide = scanner.nextDouble();

        System.out.println("Ievadiet vienu trijstūra augstumu");
        double height = scanner.nextDouble();

        double area = mainSide * height / 2;
        System.out.println("Trjstūra laukums ir:" + area);
    }
}
