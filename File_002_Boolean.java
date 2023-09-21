import java.util.Scanner;//java.util.Scannerをインポート

public class File_002_Boolean{
    public static void main(String[] args) {
        //Scannerクラスのインスタンス作成
        //引数で標準入力System.inを指定する
        Scanner scanner = new Scanner(System.in);

        System.out.print("あなたは170cm以上ありますか？ (はい/いいえ): ");

        // ユーザーの入力を取得し小文字に変換
        //trim空白を削除　toLowerCaseで小文字化
        String userInput = scanner.nextLine().trim().toLowerCase(); 

        boolean isYes = userInput.equals("はい"); // ユーザーが「はい」と入力した場合にtrueになる
        boolean isNo = userInput.equals("いいえ"); // ユーザーが「いいえ」と入力した場合にfalseになる

        if (isYes) {
            System.out.println("あなたは人権があります。");
        } else if(isNo) {
            System.out.println("あなたは人権がない可能性があります。");
            scanner.close();
        }
    }
}
