import java.util.Scanner;

public class File_013_circlearea {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("円の半径を入力してください（単位：CM）: ");
        int r = scanner.nextInt();

        double area = r * r * Math.PI;
        System.out.printf("半径%dの円の面積は%.2f cm^2 です。%n", r, area);

        scanner.close();
    }
}
