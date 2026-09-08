import java.util.Scanner;

public class Kthbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any intger ");
        int a = sc.nextInt();
        int temp = a;

        int bin = 0;
        int rem = 0;
        int pow = 1;
        System.out.println("enter any number you want to check bit set or not ");

        int k = sc.nextInt();
        while (a > 0) {
            rem = a % 2;
            a = a / 2;

            bin = bin + (rem * pow);
            pow = pow * 10;

        }
        if ((temp & 001 << (k - 1)) != 0) {
            System.out.println("ture");

        } else
            System.out.println("false ");

    }

}
