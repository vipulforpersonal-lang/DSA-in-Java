import java.util.Scanner;

class LCM1 {
    public int lcm() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int res = Math.max(num1, num2);

        while (true) { // Fixed: was "while (res < 0)"
            if (res % num1 == 0 && res % num2 == 0) {
                return res;
            }
            res++; // Moved outside else block
        }
    }
}

public class vipul {
    public static void main(String[] args) {
        System.out.println("enter any 2 numbers");
        LCM1 l1 = new LCM1();
        int finalresult = l1.lcm();
        System.out.println("LCM: " + finalresult);
    }
}