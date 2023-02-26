import java.util.Scanner;
class Triangle{
    private float width;
    private float height;

    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu cao: ");
        width = input.nextFloat();
        System.out.println("Nhap chieu dai canh day: ");
        height = input.nextFloat();
    }
    public String toString(){
        return"(" + width + "," + height + ")";
    }
    public float getWidth(){
        return width;
    }
    public float getHeight(){
        return height;
    }
    public void setWidth(float x){
        width = x;
    }
    public void setHeight(float y){
        height = y;
    }

}