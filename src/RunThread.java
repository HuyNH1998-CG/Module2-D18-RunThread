public class RunThread implements Runnable {
    private Thread thread;
    private final String threadName;

    public RunThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("ThreadL " + threadName + ", " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            System.out.println("Thread " + threadName + " is interrupted");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
