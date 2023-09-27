public class File_016 {
    public static void main(String args[]) {
        int rice = 20, noodle = 30;
        System.out.print("僕は今日ご飯を20個と麺を30個購入して個数が");
        System.out.println((rice + noodle) + "個です");

        System.out.print("ご飯の値段は、500円で麺の値段は1000円です。なので合計金額は、");
        System.out.println((rice * 500 + noodle * 1000) + "円");

        System.out.print("ご飯を3個、麺を8個で一袋にしてください。合計");
        System.out.println((rice / 3 + noodle / 8) + "袋になります。");

        System.out.print("麺の残りの個数は" + (rice % 3) + "個で、麺の個数が残り" + (noodle % 8) + "個になります。");

    }
}
