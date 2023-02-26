class library{
    public static void main(String[]args){
        card a = new card();
        a.danhsach();
        System.out.println("IbCode: " + a.getIbCode());
        System.out.println("Owner: " + a.getowner());
        System.out.println("BorrowCount: " + a.getborrowCount());
        a.checkout();
        System.out.println("LibraryCard" + a.toString());
    }
}