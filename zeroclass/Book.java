import java.util.Scanner;
class Book{
    String boCode = "peo19202020";
    String boTitle = "Peter Pan";
    String boAuthor = "J.M.Barrie";

    public void book(){
        System.out.println("" + boCode);
        System.out.println("" + boTitle);
        System.out.println("" + boAuthor);
    }
    public String getboCode(){
        return boCode;
    }
    public String getboTitle(){
        return boTitle;
    }
    public String getboAuthor(){
        return boAuthor;
    }
    public String toString(){
        return "(" + boCode + "," + boTitle + "," + boAuthor + ")";
    }
}