public class File_031_myprint {
    static void myprint(char ch,int num){
        int i;
        for(i=1;i<=num;i++){
            System.out.print(ch);
        }
        System.out.println();
    }
    public static void main(String args[]){
        myprint('*',10);
        myprint('%',10);
        myprint('#',10);
    }
}
