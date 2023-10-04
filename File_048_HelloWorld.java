public class File_048_HelloWorld {
    public static void main(String[] args) {
        char[] ch = {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
        String str1 = new String(ch, 0, 5); // 0から5番目の文字までを指定しています
        System.out.println(str1);
    }
}
