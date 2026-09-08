import java.util.Scanner;

class naive {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    public boolean fun1() {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;

        // if (n <= 0)
        // while (n > 1) {
        // if (n % 2 != 0) {
        // return false;
        // }
        // n = n / 2;

        // }
        // return true;
    }
}

public class poweroftwo {
    public static void main(String[] args) {
        naive n = new naive();
        boolean bo = n.fun1();
        System.out.println(bo);

    }

}
