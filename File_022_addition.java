public class File_022_addition {
    public static void main(String args[]) {
        int n = 1, sum = 0;
        while (n <= 1000000) {
            System.out.print("n=" + n);
            sum += n;
            System.out.println("\t累計値=" + sum);
            n++;
        }
        System.out.println("ループ終了");
    }
}