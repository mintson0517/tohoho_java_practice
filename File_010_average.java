import java.util.Scanner;

public class File_010_average {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("あなたの成績表を作成します");
        System.out.print("学籍番号を入力してください: ");
        String sid = scanner.next();// String文字

        System.out.print("国語の成績を入力してください: ");
        int a1 = scanner.nextInt();// int数字

        System.out.print("英語の成績を入力してください: ");
        int a2 = scanner.nextInt();

        System.out.print("数学の成績を入力してください: ");
        int a3 = scanner.nextInt();

        double average = (a1 + a2 + a3) / 3.0;// 浮動小数点数

        System.out.printf("My sid: %s%n", sid);// %s: 文字列フォーマット指定子
        System.out.printf("国語の成績: %d点%n", a1);// %d: 整数フォーマット指定子
        System.out.printf("英語の成績: %d点%n", a2);
        System.out.printf("数学の成績: %d点%n", a3);
        System.out.printf("平均成績: %.2f点%n", average); // %.2f: 浮動小数点数フォーマット指定子

        scanner.close();
    }
}
