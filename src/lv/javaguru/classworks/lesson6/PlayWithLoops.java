package lv.javaguru.classworks.lesson6;

public class PlayWithLoops {
    public static void main(String[] args) {
        playWithWhile();
//        ctrl +enter
        System.out.println();
        playWithForLoop();
        System.out.println();
        playWithDoWhile();
        System.out.println();
        playWithForLoopBranching();
    }

    private static void playWithForLoopBranching() {
        for (int i = 0; i <= 5; i++) {
            if (i == 4) {
                System.out.print("Break");
                break;
            }
            if (i == 2) {
                System.out.print("Continue ");
                continue;
            }
            System.out.print(i + " ");
        }
    }

    private static void playWithDoWhile() {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
    }

    private static void playWithForLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
    }

    private static void playWithWhile() {
        int i = 0;
        while (i <= 5) {
            System.out.print(i + "");
            i++;
        }
    }
}
