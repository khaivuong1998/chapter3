import java.util.Scanner;

public class Operator6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên bất kỳ");
        int a = scanner.nextInt();
        int exponentiation = 0;
        for (int i = 0; i < 5; i++) {
            exponentiation = a * a;
        }
        System.out.println(exponentiation);
    }
}
