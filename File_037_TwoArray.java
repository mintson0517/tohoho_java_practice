public class File_037_TwoArray {
    public static void main(String args[]) {
        String[] arr1 = new String[] { "席番号", "国語", "英語", "数学" };

        int[][] arr2 = new int[][] { { 1, 92, 88, 76 }, { 2, 90, 98, 70 }, { 3, 82, 72, 98 } };

        int max = 0, min = 100;

        for (int r = 0; r < arr1.length; r++)
            System.out.print(arr1[r] + "\t"); // "番"を追加
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (j == 0) {//行の一番目
                    System.out.print(arr2[i][j] + "番\t"); // "番"を追加
                } else {
                    System.out.print(arr2[i][j] + "点\t");
                }
                if (arr2[i][j] > max) {
                    max = arr2[i][j];
                }
                if (j > 0) {
                    if (arr2[i][j] < min) {
                        min = arr2[i][j];
                    }
                }
            }
            System.out.println();
        }

        System.out.printf("最高点:%d点", max);
        System.out.printf("最低点:%d点 ", min);
    }
}
