import java.util.Scanner;

public class File_026_LeapYear {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("うるる年かどうかがわかるコードです\nなんでもいいので年を入力してください");
        int year = scanner.nextInt();
        if (year % 4 != 0) {
            System.out.println(year + "年はうるう年ではありません。");
        } else {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "年はうるう年です。");
                } else {
                    System.out.println(year + "年はうるう年ではありません。");
                }
            } else {
                System.out.println(year + "年はうるう年です。");
            }
        }
        scanner.close();
    }
}