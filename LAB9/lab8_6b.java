class Task implements Runnable {//Runnable interface
    public void run() {
        System.out.println("Task is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();
    }
}
