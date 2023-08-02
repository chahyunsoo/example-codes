enum Week1 {
    SUN, MON, TUE, WED, THU, FRI, SAT
}

enum Week2 {
    SUN("일"), MON("월"), TUE("화"), WED("수"), THU("목"), FRI("금"), SAT("토");
    final private String day;

    Week2(String day) {
        this.day = day;
    }

    String getDay() {
        return day;
    }
}

public class Weather {
    public static void main(String[] args) {

        String s = "MON";
        Week1 w1 = Week1.SUN;
        Week2 w2 = Week2.valueOf(s);

        System.out.println(w1);
        System.out.println(w2);

        Week1[] arrayWeek1 = Week1.values();

        for (Week1 w: arrayWeek1) {
            switch (w) {
                case SAT:
                    System.out.print("토요일" + ", ");  break;
                case SUN:
                    System.out.print("일요일" + ", ");  break;
                default:
                    System.out.print("평일 " + ", ");  break;
            }
        }

        Week2[] arrayWeek2 = Week2.values();

        for (Week2 w: arrayWeek2) {
            if (w == Week2.WED) {
                System.out.println();
                System.out.println(w.ordinal() + "번째 요일은 => " + w.getDay());
            }
        }

    }
}