import java.util.Scanner;

public class File_008_password {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("新規作成したいパスワードを入力してください");
        System.out.print("パスワードを入力してください: ");
        int a1 = scanner.nextInt(); // ユーザーからの入力を a1 に格納

        System.out.print("再確認用にもう一度入力してください: ");
        int a2 = scanner.nextInt(); // ユーザーからの入力を a2 に格納

        if (a1 == a2) {
            System.out.println("パスワードが作成されました。");
        } else {
            System.out.println("パスワードの再確認が一致しません。もう一度入力してください。");
        }

        // Scanner をクローズ
        scanner.close();
    }
}
