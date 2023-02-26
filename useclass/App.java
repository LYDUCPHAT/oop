class App{
    public static void main(String[]args){
        Triangle tamgiac = new Triangle();
        tamgiac.nhap();
        System.out.println("Chieu cao = " + tamgiac.getWidth());
        System.out.println("Chieu dai canh day = " + tamgiac.getHeight());
        System.out.println("Tam giac" + tamgiac.toString());
        tamgiac.setWidth(20);
        tamgiac.setHeight(10);
        System.out.println("Tam giac"+tamgiac.toString());
    }
}