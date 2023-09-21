public class File_005_byte_short_int_long {
    public static void main(String args[]){
        System.out.println("intの最小値="+ Integer.MIN_VALUE);//-2147483648
        System.out.println("intの最大値="+Integer.MAX_VALUE);//2147483647

        System.out.println("byteの最小値="+Byte.MIN_VALUE);//-128
        System.out.println("byteの最大値="+Byte.MAX_VALUE);//127

        System.out.println("shortの最小値="+Short.MIN_VALUE);//-32768
        System.out.println("shortの最大値="+Short.MAX_VALUE);//32767

        System.out.println("longの最小値="+Long.MIN_VALUE);//-9223372036854775808
        System.out.println("longの最大値="+Long.MIN_VALUE);//9223372036854775807

        byte a = 123;//8ビット整数　-128～127
        System.out.println(a);

        short b = 12345;//１６ビット整数　-32768～32767
        System.out.println(b);

        int c = 1234567890;//32ビット整数　-2147483648～2147483647
        System.out.println(c);

        long d = 1234567890123456789L;//64ビット整数　-9223372036854775808～9223372036854775807
        System.out.println(d);
    }
}
