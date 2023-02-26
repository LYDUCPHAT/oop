class Student{
    public static void main(String[]args){
        Project a = new Project();
        a.student();
        System.out.println("ID = " + a.getID());
        System.out.println("Name is " + a.getName());
        System.out.println("Class is " + a.getclass());
        System.out.println("Student " + a.toString());
    }
}