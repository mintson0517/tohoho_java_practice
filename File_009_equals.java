import java.util.Scanner;

public class File_009_equals {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ねぇ、本当に私のことが好きなのかしら？こんな私なんて… \n");
        System.out.print("君が好きな人の名前を教えて：");
        String a1 = scanner.next(); // 文字列として読み取る

        System.out.print("あなたの気持ちが本物なら、もう一度教えて：");
        String a2 = scanner.next(); // 文字列として読み取る

        if (a1.equals(a2)) {
            System.out.println("好きって言ってくれるの？それって、ただの優しさ？");
            System.out.println("けど...私のことが好きでいてくれるなら、私は幸せだけど...");
        } else {
            System.out.println("私よりあの子が好きなんでしょ？\nあたしなんていらないんだよね\nさよなら................");
        }

        // スキャナーをクローズ
        scanner.close();
    }
}
