
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex06 {

    public static void main(String[] args) {
        int num1 = 1, num2 = 0, i = 0;
        String fibonacci = "Fibonacci: " + num1 + ", " ;
        while (true) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            if(num1 < 100){
                fibonacci += num1 + ", ";  
            }
            else
            {
            fibonacci = fibonacci.substring(0,fibonacci.length() - 2);
            fibonacci += "..."; 
            break;
            }
        }
        JOptionPane.showMessageDialog(null, fibonacci);
    }
}
