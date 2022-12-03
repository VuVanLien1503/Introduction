import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input weight");
        double weight = scanner.nextDouble();
        System.out.println(" input Height");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.println("BMI = " + bmi + " UnderWeight");
        }
        if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI = " + bmi + " Normal");
        }
        if (bmi >= 25 && bmi < 30) {
            System.out.println("BMI= " + bmi + " OverWeight");
        }
        if (bmi >= 30) {
            System.out.println("BMI="+ bmi+ "Obese");
        }
    }
}