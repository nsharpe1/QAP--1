public class TestTime {
    
    public static void main(String[] args) {

        Time t1 = new Time(21, 10, 15);

        Time t2 = new Time(10, 20, 25);

        System.out.println(t1);
        System.out.println(t2);
        t1 = t1.nextSecond();
        System.out.println(t1);
        t2 = t2.previousSecond();
        System.out.println(t2);
    }
}
