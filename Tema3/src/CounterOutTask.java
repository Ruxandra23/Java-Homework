public class CounterOutTask implements Task {
    private static int cnt= 0;

    @Override
    public void execute() {
        cnt++;
        System.out.println("Counter value: " + cnt);
    }


    public static void resetCounter() {
        cnt = 0;
    }
}