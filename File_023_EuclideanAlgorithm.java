import java.util.Scanner;

public class File_023_EuclideanAlgorithm {
    public static void main(String args[]){
        System.out.println("二つの数の最大公約数を求めます");
        Scanner scanner = new Scanner(System.in);
        System.out.print("aの数を入力してください：");
        int a = scanner.nextInt();
        System.out.print("bの数を入力してください：");
        int b = scanner.nextInt();
        System.out.println("a=" + a + ", b=" + b);
        
        int temp;
        do {
            temp = a % b;
            a = b;
            b = temp;
        } while (b != 0);
        
        System.out.printf("二つの数の最大公約数は%dです。", a);
        scanner.close();
    } 
}
