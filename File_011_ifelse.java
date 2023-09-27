import java.util.Scanner;

public class File_011_ifelse {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A is what number？（Hint:√6÷√12x√8=?)");
        int a = scanner.nextInt(); // 整数として入力を受け取る

        if (a == 2) {
            System.out.println(" (●´ω｀●)「Correct Answer!!!!」");
        } else {
            System.out.printf("(#ﾟДﾟ)「A is not %s!!」",a);
        }
        scanner.close();
    }
}
