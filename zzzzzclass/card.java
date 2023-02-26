class card{
    long IbCode = 123456789;
    String owner = "Yasuo";
    int borrowCount = 98765;

    public void danhsach(){
        System.out.println("" + IbCode);
        System.out.println("" + owner);
        System.out.println("" + borrowCount);
    }
    public long getIbCode(){
        return IbCode;
    }
    public String getowner(){
        return owner;
    }
    public int getborrowCount(){
        return borrowCount;
    }
    public void checkout(){
        int num = 2;
        System.out.println("Check Out: " + num);
    }
    public String toString(){
        return "(" + IbCode + "," + owner + "," + borrowCount + ")"; 
    }
}