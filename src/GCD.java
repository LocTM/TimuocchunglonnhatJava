import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        int gcd = findGCD(a, b);

        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + gcd);
    }

    private static int findGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return (a);
    }
}
