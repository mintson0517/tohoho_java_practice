import java.util.Scanner;

public class File_028_factor {
    public static void main(String args[]) {
        int a = 1, n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("数字を一つ入力してください: ");
        n = scanner.nextInt();
        System.out.print(n + "の全ての因数は：");
        while (a <= n) {
            if (n % a == 0) {
                System.out.print(a);
                if (n != a) {
                    System.out.print(", ");
                }
            }
            a++;
        }
        System.out.println();
        scanner.close();
    }
}
