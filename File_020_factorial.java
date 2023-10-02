import java.math.BigInteger;

public class File_020_factorial {
    public static void main(String[] args) {
        BigInteger factorial = BigInteger.ONE;
        
        for (int i = 1; i <= 100000; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println("階乗: " + factorial);
    }
}
