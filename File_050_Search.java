import java.util.Scanner;

public class File_050_Search {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str1 = "The biggest risk is not taking any risk... In a world that is changing really quickly, the only strategy that is guaranteed to fail is not taking risks.";
        System.out.println("str1: " + str1);
        System.out.print("検索したいワードを入力してください: ");
        String s1 = scanner.nextLine();
        int index = 0;
        while ((index = str1.indexOf(s1, index)) != -1) {
            System.out.println("これは第" + index + "の場所にあります。");
            index++;
            scanner.close();
        }
    }
}
