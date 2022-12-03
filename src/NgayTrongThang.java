import java.util.Scanner;



public class NgayTrongThang {
    public static void main(String[] args) {
        int result;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap Thang Can Xem");
        int month=scanner.nextInt();
        if (month>0&&month<=12){
            switch (month){
                case 2:
                    System.out.println("Tháng "+month+"Có 28 or 29 Ngày");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng "+month+" Có 30 Ngày");
                    break;
                default:
                    System.out.println("thang "+ month +" Co 31 ngay");

            }
        }else {
            System.out.println("Thang Khong Dung");
        }

    }
}
