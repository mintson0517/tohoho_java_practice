import java.util.Arrays;

public class File_039_Fill {
    public static void main(String args[]){
        int A[]=new int[5];
        System.out.println("予定初期値");

        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        Arrays.fill(A,5);
        System.out.println("修正後の初期値");

        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}
