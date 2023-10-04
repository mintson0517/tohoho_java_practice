class Radius {
    double pi = 3.14;
    double r;

    double area() {
        return (pi * r * r);
    }
}

public class File_046_Circle {
    public static void main(String args[]) {
        Radius obj = new Radius(); 

        obj.r = 3.0; 
        System.out.println("半径＝" + obj.r);
        System.out.printf("円の面積＝%.1f\n",obj.area()); 
    }
}
