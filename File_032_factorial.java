import java.util.Scanner;
import java.math.BigInteger;

public class File_032_factorial {
    static BigInteger factorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("階乗を計算したい数字を入力してください：");
        int n = scanner.nextInt();
        System.out.println(n + "! = " + factorial(n));
        scanner.close();
    }
}
