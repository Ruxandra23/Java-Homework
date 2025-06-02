public class Stack implements Container {
    private Task[] tasks;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        tasks = new Task[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void add(Task task) {
        if (size == tasks.length) {
            resize();
        }
        tasks[size++] = task;
    }

    @Override
    public Task remove() {
        if (isEmpty()) {
            return null;
        }
        Task task = tasks[--size];
        tasks[size] = null; // Evită memory leaks
        return task;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        Task[] newTasks = new Task[tasks.length * 2];
        System.arraycopy(tasks, 0, newTasks, 0, size);
        tasks = newTasks;
    }
}