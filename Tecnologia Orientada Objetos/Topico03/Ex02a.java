
import java.util.Scanner;

public class Ex02a {

    public static void main(String[] args) {
        System.out.println("Números Pares:");
        for (int i = 0; i <= 100; i++) {
            if (i == 0 || i % 2 == 0) {
                System.out.print(i);
                if (i < 100) {
                    System.out.print(", ");
                } else {
                    System.out.print(".");
                }
            }
        }
    }
}
