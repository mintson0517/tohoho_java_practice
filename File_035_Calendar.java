import java.io.IOException;
import java.util.Scanner;

public class File_035_Calendar {
    public static void main(String args[]) throws IOException {
        int i, j, w;
        int year, month;
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        System.out.print("西暦何年をお調べしましょうか？");
        try (Scanner scanner = new Scanner(System.in)) {
            year = scanner.nextInt();

            if (year >= 1900) {
                System.out.print("何月をお調べでしょうか？");
                month = scanner.nextInt();
                w = 0;

                for (i = 1900; i < year; i++) {
                    if (leap_year(i) == 1)
                        w = (w + 366) % 7;
                    else
                        w = (w + 365) % 7;
                }

                if (leap_year(year) == 1)
                    days[1] = 29;
                else
                    days[1] = 28;

                for (i = 0; i < month - 1; i++)
                    w = (w + days[i]) % 7;

                System.out.printf("\n\n");
                System.out.printf("\t" + year + "年" + month + "月\n\n");

                for (j = 1; j <= w; j++)
                    System.out.printf("    ");

                for (i = 1; i <= days[month - 1]; i++) {
                    System.out.printf(" %3d", i);
                    if ((i + w) % 7 == 0 || i == days[month - 1])
                        System.out.print("\n");
                }
                System.out.print("\n");
            } else
                System.out.print("1900年以降の西暦を入力してください。");
        }
    }

    public static int leap_year(int x) {
        if (x % 4 == 0 && (x % 100 != 0 || x % 400 == 0))
            return 1;
        else
            return 0;
    }
}