package lv.javaguru.classworks.lesson3;

public class ClassWithObjectsTest {

    public static void main(String[] args) {

        ClassWithObjects classWithObjects = new ClassWithObjects();

        System.out.println("Byte = " + classWithObjects.byteVariable);

        System.out.println("Short = " + classWithObjects.shortVariable);

        System.out.println("Integer = " + classWithObjects.integerVariable);

        System.out.println("Long = " + classWithObjects.longVariable);

        System.out.println("Float = " + classWithObjects.floatVariable);

        System.out.println("Double = " + classWithObjects.doubleVariable);

        System.out.println("Character = " + classWithObjects.characterVariable);

        System.out.println("Boolean = " + classWithObjects.booleanVariable);

        classWithObjects.byteVariable = 13;

        classWithObjects.shortVariable = 432;

        classWithObjects.integerVariable = 15476;

        classWithObjects.longVariable = 6745654123412L;

        classWithObjects.floatVariable = 341.13F;

        classWithObjects.doubleVariable = 53454.123;

        classWithObjects.characterVariable = 'A';

        classWithObjects.booleanVariable = false;

        System.out.println("Byte = " + classWithObjects.byteVariable);

        System.out.println("Short = " + classWithObjects.shortVariable);

        System.out.println("Integer = " + classWithObjects.integerVariable);

        System.out.println("Long = " + classWithObjects.longVariable);

        System.out.println("Float = " + classWithObjects.floatVariable);

        System.out.println("Double = " + classWithObjects.doubleVariable);

        System.out.println("Character = " + classWithObjects.characterVariable);

        System.out.println("Boolean = " + classWithObjects.booleanVariable);

    }

}