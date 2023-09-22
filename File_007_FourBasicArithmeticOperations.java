public class File_007_FourBasicArithmeticOperations {
    public static void main(String args[]){
        int a = 534;
        int b = 100;

        //四則演算(+,-,*,/,%)
        int sum_plus = a + b;
        int sum_minus = a - b;
        int sum_multiplication = a * b;
        int sum_division = a / b;
        int sum_remainder = a % b;
        // すべての結果を足し合わせる
        int totalSum = sum_plus + sum_minus + sum_multiplication + sum_division + sum_remainder;
        
        //結果をコンソールに追加
        System.out.println("合計は、" + sum_plus + "円");//足し算
        System.out.println("合計は、" + sum_minus + "円");//引き算
        System.out.println("合計は、" + sum_multiplication + "円");//掛け算
        System.out.println("合計は、" + sum_division + "円");//割り算
        //　\nはNew line（改行）
        System.out.println("合計は、" + sum_remainder + "円\n");//剰余

        System.out.println("全ての合計は、" + totalSum + "円");
    }
}
