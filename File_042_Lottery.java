public class File_042_Lottery {
    public static void main(String args[]) {
        int[] intArray = new int[6];
        int intRandCount = 0;
        int intBackCount;
        boolean boolRepeat;

        for (int i = 0; i < 6; i++) {
            intRandCount++;
            intArray[i] = (int) (Math.random() * 42 + 1);
            intBackCount = i - 1;
            boolRepeat = false;
            while (intBackCount >= 0) {
                if (intArray[i] == intArray[intBackCount]) {
                    boolRepeat = true;
                    break;
                }
                intBackCount--;
            }
            if (!boolRepeat) {
                System.out.println("第" + (i + 1) + "この数字は：" + intArray[i]);
            } else {
                i--; // 重複した場合、同じインデックスを再度生成する必要があるためiをデクリメント
            }
        }
        System.out.println("乱数が合計で" + intRandCount + "個出力されました。");
    }
}
