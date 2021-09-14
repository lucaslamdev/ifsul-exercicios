
import java.util.Scanner;

public class Ex02b {

    public static void main(String[] args) {
        int i = 0;
        System.out.println("Números Pares:");
        while (i <= 100) {
            if (i == 0 || i % 2 == 0) {
                System.out.print(i);
                if (i < 100) {
                    System.out.print(", ");
                } else {
                    System.out.print(".");
                }

            }
            i++;
        }
    }
}
