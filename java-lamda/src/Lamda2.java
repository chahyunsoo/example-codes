interface AnonymousPrintable { void print(String s); }

class Lamda2 {
    public static void main(String[] args) {
        AnonymousPrintable prn = new AnonymousPrintable(){
            public void print(String s) {
                System.out.println(s);
            }
        };
        prn.print("lamdaPrinter");
    }
}
