
import java.util.Scanner;

class fun1 {
    int sum = 0;
    int count;

    public void count(int i) {
        while (i != 0) {
            count = i % 2;

            i = i / 2;
            if (count == 1) {
                sum++;
            }

        }
        System.out.println(sum);

    }

}

public class CountBit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        System.out.println("enter any number ");
        fun1 fu = new fun1();
        fu.count(i);

    }

}
