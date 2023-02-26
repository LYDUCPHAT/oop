import java.util.Scanner;
class Point2D{
    private float x;
    private float y;

    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap toa do x: ");
        x = input.nextFloat();
        System.out.println("Nhap toa do y: ");
        y = input.nextFloat();
    }
    public void hienthi(){
        System.out.println( "(" + x + "," + y + ")" );
    }
    public float giatriX(){
        return x;
    }
    public float giatriY(){
        return y;
    }


}