import java.util.Scanner;
class Fraction{
    private int numeratora;
    private int denominatora;
    private int numeratorb;
    private int denominatorb;

    public Fraction(){
        numeratora = 0;
        denominatora = 1;
        numeratorb = 0;
        denominatorb = 1;
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tu so a: ");
        numeratora = input.nextInt();
        do{
        System.out.println("Nhap mau so a: ");
        denominatora = input.nextInt();
        }
        while(denominatora == 0);
    }
    public void hienthi(){
        if(numeratora == 0){
            System.out.println("Phan so a = 0");
        }
        else if(denominatora == 1){
            System.out.println("Phan so a = " + numeratora);
        }
        else{
            System.out.println("Phan so a = " + numeratora + "/" + denominatora);
        }
    }
    public void nhap1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tu so b: ");
        numeratorb = input.nextInt();
        do{
        System.out.println("Nhap mau so b: ");
        denominatorb = input.nextInt();
        }
        while(denominatorb == 0);
    }
    public void hienthi1(){
        if(numeratorb == 0){
            System.out.println("Phan so b = 0");
        }
        else if(denominatorb == 1){
            System.out.println("Phan so b = " + numeratorb);
        }
        else{
            System.out.println("Phan so b = " + numeratorb + "/" + denominatorb);
        }
    }
    public void phepcong(){
        int y = denominatora*denominatorb;
        int x = (denominatorb*numeratora)+(denominatora*numeratorb);
        System.out.println("Phep cong = " + x + "/" + y);
    }
    public void pheptru(){
        int y = denominatora*denominatorb;
        int x = (denominatorb*numeratora)-(denominatora*numeratorb);
        System.out.println("Phep tru = " + x + "/" + y);
    }
    public void phepnhan(){
        int y = denominatora*denominatorb;
        int x = numeratora*numeratorb;
        System.out.println("Phep nhan = " + x + "/" + y);
    }
    public void phepchia(){
        int y = denominatora*numeratorb;
        int x = denominatorb*numeratora;
        System.out.println("Phep chia = " + x + "/" +y);
    }
    public void reducer(){
        int y = denominatora;
        int x = numeratora;
        int r = x % y;
        while( r != 0){
            x = y;
            y = r;
            r = x % y;
        }
        numeratora /= y;
        denominatora /= y;
        System.out.println("Phan so toi gian = " + numeratora + "/" + denominatora);
    }
    public void reducer1(){
        int y = denominatorb;
        int x = numeratorb;
        int r = x % y;
        while( r != 0){
            x = y;
            y = r;
            r = x % y;
        }
        numeratorb /= y;
        denominatorb /= y;
        System.out.println("Phan so toi gian = " + numeratorb + "/" + denominatorb);
    }
    public String toString(){
        return "(" + numeratora + "," + denominatora + ")";
    }
    public String toString1(){
        return "(" + numeratorb + "," + denominatorb + ")";
    }

}


    
