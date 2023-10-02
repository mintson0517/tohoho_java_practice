public class File_024_break {
    public static void main(String args[]) {
        int i, j;
        System.out.println("階段");
        out1:
        for (i = 1; i < 100; i++) {
            for (j = 1; j <= i; j++) {
                if (j == 90) break out1;
                System.out.print(j);
            }
            System.out.println();
        }
    }
}