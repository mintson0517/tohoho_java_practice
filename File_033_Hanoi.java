import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class File_033_Hanoi {
    public static void main(String args[]) throws IOException {
        int j;
        String str;
        BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("リングの数を教えてください：");
        str = keyin.readLine();
        j = Integer.parseInt(str);
        hanoi(j, 1, 2, 3);
    }

    public static void hanoi(int n, int p1, int p2, int p3) {
        if (n == 1) {
            System.out.println("リングを" + p1 + "から" + p3 + "に移動");
        } else {
            hanoi(n - 1, p1, p3, p2);
            System.out.println("リングを" + p1 + "から" + p3 + "に移動");
            hanoi(n - 1, p2, p1, p3);
        }
    }
}
