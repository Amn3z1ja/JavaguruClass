package lv.javaguru.classworks.lesson4;

public class PlyWithSwitch {

    public static void main(String[] args) {
        printCode(200);
        printCode(300);
        printCode(500);
        printCode(503);
    }

    public static void printCode(int httpCode) {
        switch (httpCode) {
            case 200:
                System.out.println("OK");
                break;
            case 400:
                System.out.println("Bad request");
                break;
            case 500:
            case 503:
            case 505:
                System.out.println("Server error");
                break;
            default:
                System.out.println();
        }
    }
}
