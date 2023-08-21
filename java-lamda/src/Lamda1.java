interface Printable { void print(String s); }
class Printer implements  Printable{
    public void print(String s) {
        System.out.println(s);
    }
}

public class Lamda1 {
    public static void main(String[] args) {
        Printable prn = new Printer();
        prn.print("lamda");
    }
}
