public class File_012_HelloWorld {
    public static void main(String args[]) {
        System.out.println("\"Hello World!\""); // エスケープシーケンスを使用
        System.out.println("\"\110\145\154\154\157 \127\157\162\154\144\""); // 8進数のASCIIコードを使用
        System.out.println("\"\u0048\u0065\u006c\u006c\u006f \u0057\u006f\u0072\u006c\u0064\""); // 16進数のUnicodeエスケープシーケンスを使用
    }
}
