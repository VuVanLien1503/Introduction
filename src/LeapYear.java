import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean checkYear = false;
        boolean yearDivisibleBy4 = year % 4 == 0;
        boolean yearDivisibleBy100 = year % 100 == 0;
        boolean yearDivisibleBy400 = year % 400 == 0;
        if (yearDivisibleBy4) {
            if (yearDivisibleBy100) {
                if (yearDivisibleBy400) {
                    checkYear = true;
                }
            } else {
                checkYear = true;
            }
        }
        if (checkYear){
            System.out.println(year+" is a leap year");
        }else {
            System.out.println(year+" is a leap year ");
        }
    }
}
