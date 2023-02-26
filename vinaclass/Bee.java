class Bee{
    public static void main(String[]args){
        Fraction phanso = new Fraction();
        phanso.nhap();
        phanso.hienthi();
        phanso.reducer();
        System.out.println("Fraction a" + phanso.toString());
        phanso.nhap1();
        phanso.hienthi1();
        phanso.reducer1();
        System.out.println("Fraction b" + phanso.toString1());
        phanso.phepcong();
        phanso.pheptru();
        phanso.phepnhan();
        phanso.phepchia();
    }
}