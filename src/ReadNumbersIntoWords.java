import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number want to see");
        int number=scanner.nextInt();
        String result="";
        boolean checkHundreds=false;
        if (number/100 !=0){

        }
        if (number/10%10 !=0){

        }
        if (number/1%10 !=0){

        }
        if (number>=0 && number<=999){
            if (number<=12){
                switch (number){
                    case 1:
                        result=" one";
                        break;
                    case 2:
                        result="tow";
                        break;
                    case 3:
                        result="three";
                        break;
                    case 4:
                        result="four";
                        break;
                    case 5:
                        result="five";
                        break;
                    case 6:
                        result="six";
                        break;
                    case 7:
                        result="seven";
                        break;
                    case 8:
                        result="eight";
                        break;
                    case 9:
                        result="nine";
                        break;
                    case 10:
                        result="ten";
                        break;
                    case 11:
                        result="eleven";
                        break;
                    case 12:
                        result="twelve";
                        break;
                }
            }
        }

    }
}
