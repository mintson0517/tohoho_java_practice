public class File_043_Score {
    public static void main(String args[]) {
        int score[] = {99, 58, 26, 48, 57, 89, 56, 84, 71, 90};
        int[] degree = new int[10];
        int sum = 0;
        double avg = 0.0;

        for (int i = 0; i < 10; i++) {
            sum += score[i];
            if (score[i] / 10 == 10) {
                degree[9]++;
            } else {
                degree[score[i] / 10]++;
            }
        }
        avg = (double) sum / (double) 10;

        System.out.println("合計点：" + sum + "、平均=" + avg);
        System.out.println("人数分布表");
        System.out.print("点数の範囲\t人\n");
        for (int i = 0; i < 10; i++) {
            System.out.print(i * 10 + " ～ " + (i * 10 + 9) + "\t");
            for (int j = 0; j < degree[i]; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
