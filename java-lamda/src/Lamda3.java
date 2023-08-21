interface LamdaPrintable { void print(String s); }

class Lamda3 {
    public static void main(String[] args) {
        LamdaPrintable lp= (s -> { System.out.println(s);}
        );
        lp.print("람다식으로 변환");
    }
}
