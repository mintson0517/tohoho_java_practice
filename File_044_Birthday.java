class HappyBirthday {
    public int day;
    public int month;
    public int year;

    public void printBirthday() {
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}

public class File_044_Birthday {
    public static void main(String args[]) {
        HappyBirthday mintson, huang;
        mintson = new HappyBirthday(); // クラス名を修正しました
        huang = new HappyBirthday();   // クラス名を修正しました
        mintson.year = 2004;
        mintson.month = 5; // 月は0から始まらないので修正しました
        mintson.day = 17;
        huang.year = 2004;
        huang.month = 5; // 月は0から始まらないので修正しました
        huang.day = 17;

        System.out.print("Mintsonの生年月日は=");
        mintson.printBirthday(); // メソッドの呼び出しを修正しました
        System.out.print("Huangの生年月日は=");
        huang.printBirthday(); // メソッドの呼び出しを修正しました
    }
}
