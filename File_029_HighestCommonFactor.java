import java.util.Scanner;

public class File_029 {
    public static void main(String args[]){
        int Num1,Num2,TmpNum;
        System.out.print("2つの整数の最大公因数を求めだします\n\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1つ目の数字を入力してください:");
        Num1 = scanner.nextInt();

        System.out.println("1つ目の数字を入力してください:");
        Num2 = scanner.nextInt();
        if(Num1<Num2)
        {/*ユークリッドの互除法は常に大きい数を小さい数で割る操作/なので前後で交代*/
            TmpNum=Num1;
            Num1=Num2;
            Num2=TmpNum;
        }

        while (Num2 != 0)
        {
            TmpNum=Num1 % Num2;
            Num1=Num2;
            Num2=TmpNum;
        }
        System.out.print("最大公約数は、"+Num1);
        scanner.close();
    }
}
