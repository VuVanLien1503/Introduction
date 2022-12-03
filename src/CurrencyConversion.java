import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap $ :");
        double number=scanner.nextDouble();
        double result= number*23000;
        System.out.println(number+"$ = "+result+" VND");
    }
}
