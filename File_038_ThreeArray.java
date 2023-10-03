public class File_038_ThreeArray {
    public static void main(String args[]) {
        int twoDarr[][] = { { 20, 30, 40, 50 },
                            { 15, 29, 82, 91 },
                            { 50, 60, 40, 50 } };
        int threeDarr[][][] = { { { 2, 5, 6, 8 }, 
                                 { 5, 6, 0, 4 }, 
                                 { 5, 4, 8, 9 }, 
                                 { 2, 5, 6, 8 } },
                               { { 5, 6, 0, 4 }, 
                                 { 5, 4, 8, 9 }, 
                                 { 2, 5, 6, 8 }, 
                                 { 5, 6, 0, 4 } } };

        System.out.println("二次元配列");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twoDarr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("三次元配列");
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(threeDarr[k][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
