import java.util.Scanner;

public class File_018_elseif {
    public static void main(String args[]) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("彼氏の年齢を入力してください: ");
        a = scanner.nextInt();
        System.out.print("彼女の年齢を入力してください: ");
        b = scanner.nextInt();
        
        if (a < b) {
            System.out.println("彼女のほうが年上です");
        } else if (a > b) {
            System.out.println("彼氏のほうが年上です");
        } else {
            System.out.println("彼女と彼氏の年齢は同じです");
        }
        scanner.close();
    }
}