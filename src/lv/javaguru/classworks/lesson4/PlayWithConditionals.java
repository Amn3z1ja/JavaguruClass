package lv.javaguru.classworks.lesson4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class PlayWithConditionals {

    public static void main(String[] args) {

        int x = 10;

        if (x > 5 && x < 15) {
            System.out.println("X is within bounds");
        }

        if (x < 5 || x >= 10) {
            System.out.println("X is correct");
        }
        if (x > 5 && x < 10 || (x <= 20 && x > 10)) {
            System.out.println("X is correct 2nf time");
        }

        if (x != 20) {
            System.out.println("X is not 20");
        }

        if (isNotInBounds(x)) {
            System.out.println();
        }
        if (x == 10)
            System.out.println();
        else if (x == 11)
            System.out.println();
        else
            System.out.println();


        String message = x == 10 ? "x is 10" : " x is NOT  ten";
        System.out.println("x is:" + message);

        System.out.println("x is:" + (x ==10 ? "10" : "NOT ten"));

    }





    private static boolean isNotInBounds(int x) {
        return x < 5 && x > 15 || x == 10;
    }
}
