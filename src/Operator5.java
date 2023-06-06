import java.util.Scanner;

public class Operator5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        int a = scanner.nextInt();
        System.out.println("Nhập số thứ hai");
        int b = scanner.nextInt();
        if (a == b) {
            System.out.println("2 số bằng nhau");
        } else {
            System.out.println("2 số không bằng nhau");
        }
    }
}
