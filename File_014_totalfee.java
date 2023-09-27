import java.util.Scanner;

public class File_014_totalfee {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("購入した商品の値段を3つ入力して:");
        int cost_1 = scanner.nextInt();
        int cost_2 = scanner.nextInt();
        int cost_3 = scanner.nextInt();

        double sum = cost_1 + cost_2 + cost_3;
        System.out.printf("合計金額:%.0f 円", sum);
        scanner.close();
    }
}
