public class TestTime {
    
    public static void main(String[] args) {

        Time t1 = new Time(21, 10, 15);

        Time t2 = new Time(10, 20, 25);

        System.out.println("Time 1:                    " + t1);
        System.out.println("Time 2:                    " + t2);
        t1 = t1.nextSecond();
        System.out.println("Time 1 (Ahead one second): " + t1);
        t2 = t2.previousSecond();
        System.out.println("Time 2 (Back one second):  " + t2);
    }
}
