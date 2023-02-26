class Write{
    public static void main(String[]args){
        Book a = new Book();
        a.book();
        System.out.println("Ten Ma: " + a.getboCode());
        System.out.println("Ten Sach: " + a.getboTitle());
        System.out.println("Ten Tac Gia: " + a.getboAuthor());
        System.out.println("Book" + a.toString());
    }
}