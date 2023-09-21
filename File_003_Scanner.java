import java.util.Scanner;

public class File_003_Scanner {
    public static void main(String args[]){
        //Scannerクラスのインスタンスを作成する
        //引数で標準入力System.inを指定
        Scanner scanner = new Scanner(System.in);

        //入力するメッセージをインプット
        System.out.print("文字を入力してください>");

        //trimで空白を削除、入力した内容をインスタントから取得
        String input = scanner.nextLine().trim();

        //Scannerクラスのインスタンスをクローズ
        System.out.println("'" + input + "'が入力されました");

        //scannerをクローズする
        scanner.close();
    }
}
