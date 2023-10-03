import java.util.Arrays;

public class File_040_equals {
    public static void main(String args[]){
        int A[]={55,24,31,98};
        int B[]={55,24,31,98};
        int C[]={42,2,3,88,77};

        System.out.println("AとBは同じなのか？"+Arrays.equals(A,B));
        System.out.println("AとCは同じなのか？"+Arrays.equals(A,C));
        System.out.println("BとCは同じなのか？"+Arrays.equals(B,C));
    }
}
