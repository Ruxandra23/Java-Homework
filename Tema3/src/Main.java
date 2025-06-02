public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testare Task-uri ===");


        Task outTask = new OutTask("Salut din OutTask!");
        outTask.execute();

        Task randomTask = new RandomOutTask();
        randomTask.execute();


        Task counter1 = new CounterOutTask();
        Task counter2 = new CounterOutTask();
        counter1.execute();
        counter2.execute();

        System.out.println("\n=== Testare Stack (LIFO) ===");

        Container stack = new Stack();
        stack.add(new OutTask("Primul in Stack"));
        stack.add(new OutTask("Al doilea in Stack"));
        stack.add(new OutTask("Al treilea in Stack"));

        System.out.println("Dimensiune Stack: " + stack.size());

        while (!stack.isEmpty()) {
            Task task = stack.remove();
            task.execute();
        }

        System.out.println("\n=== Testare Queue (FIFO) ===");

        Container queue = new Queue();
        queue.add(new OutTask("Primul in Queue"));
        queue.add(new OutTask("Al doilea in Queue"));
        queue.add(new OutTask("Al treilea in Queue"));

        System.out.println("Dimensiune Queue: " + queue.size());

        while (!queue.isEmpty()) {
            Task task = queue.remove();
            task.execute();
        }

        System.out.println("\n=== Test Mixt ===");

   
        CounterOutTask.resetCounter();

        Container mixContainer = new Stack();
        mixContainer.add(new RandomOutTask());
        mixContainer.add(new CounterOutTask());
        mixContainer.add(new OutTask("Task mixt"));
        mixContainer.add(new CounterOutTask());

        System.out.println("Execuție tasks din Stack:");
        while (!mixContainer.isEmpty()) {
            mixContainer.remove().execute();
        }
    }
}