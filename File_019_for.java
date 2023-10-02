public class File_019_for {
    public static void main(String args[]) {
        System.out.println("1から10の間の奇数の和を計算します");
        int sum = 0;
        System.out.println("この間の奇数をすべて表示します。");
        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 != 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("回答=" + sum);
    }
}
