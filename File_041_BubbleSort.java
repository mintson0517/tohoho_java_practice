public class File_041_BubbleSort {
    public static void main(String[] args) {
        int i, j, temp;
        int data[] = {6, 5, 2, 4, 5, 6};

        System.out.println("バブルソート：");
        System.out.print("最初のデータ：");
        for (i = 0; i < 6; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("\n");

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5 - i; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
            System.out.print("第" + (i + 1) + "回の配列結果は：");
            for (j = 0; j < 6; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("配列後の結果：");
        for (i = 0; i < 6; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("\n");
    }
}
