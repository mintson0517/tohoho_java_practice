public class File_004_Char {
    public static void main(String args[]){
        //char 変数名 = '任意の一文字'；
        //2バイトUNICODE文字。'\u0000'～'\uffff'
        char a = 'あ';//基本データ型変数
        String b = "あ";//クラス方変数
        String c = "Hellow World";//複数文字入力可能

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //char型をString型に変換
        char d = 'あ';
        String s = String.valueOf(d);//valueOfはString型に変換できるメソッド
        System.out.println(s);
        // char 配列を定義して、文字を格納
        char[] e = new char[]{'H','e','l','l','o','w',' ','W','o','r','l','d'};
        // char 配列から文字列を生成
        String f = new String(e);
        System.out.println(f);
    }
}
