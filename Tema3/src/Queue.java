public class Queue implements Container {
    private Task[] tasks;
    private int front;
    private int rear;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public Queue() {
        tasks = new Task[DEFAULT_CAPACITY];
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public void add(Task task) {
        if (size == tasks.length) {
            resize();
        }
        tasks[rear] = task;
        rear = (rear + 1) % tasks.length;
        size++;
    }

    @Override
    public Task remove() {
        if (isEmpty()) {
            return null;
        }
        Task task = tasks[front];
        tasks[front] = null;
        front = (front + 1) % tasks.length;
        size--;
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
        for (int i = 0; i < size; i++) {
            newTasks[i] = tasks[(front + i) % tasks.length];
        }
        tasks = newTasks;
        front = 0;
        rear = size;
    }
}