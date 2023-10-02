import java.util.Scanner;

public class File_025_return {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1からnの合計を計算します。\n");
        System.out.print("ｎの数字を入力してください: ");
        int n = scanner.nextInt();
        int ans = sum(n);
        System.out.println("数字の足し算");
        System.out.println("1から" + n + "までの合計は: " + ans);
        scanner.close();
    }

    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}