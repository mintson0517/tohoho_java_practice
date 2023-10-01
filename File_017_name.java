import java.util.Scanner;

public class File_017_name {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num, tenThousand, thousand, hundred, fifty, ten;
        
        System.out.print("出金したい金額を記載してください：");
        num = scanner.nextInt();
        
        // 入力値が十万円以内であることを確認
        if (num <= 100000) {
            tenThousand = num / 10000;
            thousand = (num % 10000) / 1000;
            hundred = ((num % 10000) % 1000) / 100;
            fifty = (((num % 10000) % 1000) % 100) / 50;
            ten = ((((num % 10000) % 1000) % 100) % 50) / 10;
            
            System.out.printf("一万円札が%d枚、千円札が%d枚、百円札が%d枚、五十円玉が%d個、十円玉が%d個を引き出し開始します", 
                              tenThousand, thousand, hundred, fifty, ten);
        } else {
            System.out.println("入力した金額は十万円を超えています。出金したい場合は、カウンターまでお越しください。");
        }
        
        scanner.close();
    }
}
