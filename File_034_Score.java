public class File_034_Score {
    public static void main(String args[]){
        String [] course = new String[]{"名前", "国語", "数学", "英語", "物理", "化学"}; // 配列の初期化
        int[] score = new int[]{100, 90, 80, 40, 20};

        // 科目の表示
        for (int i = 0; i < course.length; i++){
            System.out.print(course[i] + "\t");
        }
        System.out.println();

        // 成績と総合点の表示
        int sum = 0;
        System.out.print("Mintson\t");
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i] + "点\t");
            sum += score[i];
        }
        System.out.println();
        System.out.println("総合点: " + sum+"点");
        System.out.println("平均: " + (float)sum/score.length+"点");
    }
}
