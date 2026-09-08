
import java.util.Scanner;

class fun1 {
    int sum = 0;

    public void count(int i) {
        while (i != 0) {
            i = i / 10;
            sum++;

        }
        System.out.println(sum);

    }

}

public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        fun1 fu = new fun1();
        fu.count(i);

    }

}
