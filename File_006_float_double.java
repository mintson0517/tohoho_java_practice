public class File_006_float_double {
    public static void main(String args[]){
        System.out.println("floatは、32ビット単精度浮動小数点数");
        
        // floatデータ型の最小正の値を取得
        float minPositiveValue_float = Float.MIN_VALUE;
        // floatデータ型の最大正の値を取得
        float maxPositiveValue_float = Float.MAX_VALUE;

        // floatデータ型の最小負の値を取得
        float minNegativeValue_float = -Float.MAX_VALUE;
        // floatデータ型の最大正の値を取得
        float maxNegativeValue_float = Float.MAX_VALUE;

        //結果をコンソールに表示
        System.out.println("最小正の値(float)=" + minPositiveValue_float);
        System.out.println("最大正の値(float)=" + maxPositiveValue_float);
        System.out.println("最小負の値(float)=" + minNegativeValue_float);
        System.out.println("最大負の値(float)=" + maxNegativeValue_float);


        System.out.println("doubleは、64ビット倍精度浮動小数点数");
        // doubleデータ型の最小正の値を取得
        double minPositiveValue_double = Double.MIN_VALUE;
        // doubleデータ型の最大正の値を取得
        double maxPositiveValue_double = Double.MAX_VALUE;

        //doubleデータ型の最小負の値を取得
        double minNegativeValue_double = Double.MIN_VALUE;
        //doubleデータ型の最大負の値を取得
        double maxNegativeValue_double = Double.MAX_VALUE;

        //結果をコンソールに表示
        System.out.println("最小正の値(double)=" + minPositiveValue_double);
        System.out.println("最大正の値(double)=" + maxPositiveValue_double);
        System.out.println("最小負の値(double)=" + minNegativeValue_double);
        System.out.println("最大負の値(double)=" + maxNegativeValue_double);
    }
}
