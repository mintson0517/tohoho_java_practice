import java.util.Scanner;

public class File_015_hundred {
    public static void main(String args[]) {
        int num, hundred;
        System.out.print("整数を入力してください(※-2,147,483,648～2,147,483,647):");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        hundred = (num / 100) % 10;
        System.out.printf("%d百の位の数字は%dです",num,hundred);

        scanner.close();
    }

}
