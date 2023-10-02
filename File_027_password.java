import java.util.Scanner;

public class File_027_password {
    public static void main(String args[]) {
        int i = 1, new_pw, password = 1234;
        Scanner input_obj; // Scanner インスタンスの変数を宣言
        while (i <= 3) {
            System.out.print("パスワードを入力してください: ");
            input_obj = new Scanner(System.in);
            new_pw = input_obj.nextInt();
            if (new_pw != password) {
                System.out.println("パスワードは間違っています。");
                i++;
                continue;
            }
            System.out.println("ログインが完了しました。");
            break;
        }
        if (i > 3) {
            System.out.println("パスワードを三回入力失敗したので１分間のタイムアウト....");
        }
    }
}
