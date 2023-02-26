import java.util.Scanner;
class Project{
    String stID;
    String stName;
    String stClass;

    public void student(){
    Scanner input = new Scanner(System.in);
    System.out.println("Nhap ID: ");
    stID = input.nextLine();
    System.out.println("Nhap ho ten: ");
    stName = input.nextLine();
    System.out.println("Nhap lop: ");
    stClass = input.nextLine();
    }
    public String getID(){
        return stID;
    }
    public String getName(){
        return stName;
    }
    public String getclass(){
        return stClass;
    }
    public String toString(){
        return "(" + stID + "," + stName + "," + stClass + ")";
    }
}