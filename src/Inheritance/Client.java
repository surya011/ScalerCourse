package Inheritance;

public class Client {
    public static void main(String[] args) {
        Ram r = new Ram();
        r.marks = 80;
        r.name = "Ram";
        Shyam s = new Shyam();
        s.marks = 50;
        s.name = "Shyam";
        System.out.print("Stuent name " +s.name +" ");
        s.getresult(s.marks);
        System.out.println("Student Name  " + r.name +" ");
        r.getresult(r.marks);

    }
}