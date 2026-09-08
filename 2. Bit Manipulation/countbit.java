import java.util.Scanner;

class count {
    public int fun1() {
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any integer ");
        int a = sc.nextInt();
        int i = 0;
        int temp = 0;

        while (i < 32) {
            if ((a & (1 << i)) != 0)

            {
                temp++;

            }
            i++;

        }
        return temp;
    }

}

public class countbit {
    public static void main(String[] args) {
        count co = new count();
        int reslut = co.fun1();
        System.out.println(reslut);

    }

}
