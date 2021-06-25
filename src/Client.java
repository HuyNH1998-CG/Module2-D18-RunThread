public class Client {
    public static void main(String[] args) {
        System.out.println("Main thread starting");
        RunThread runThread1 = new RunThread("T01");
        runThread1.start();
        RunThread runThread2 = new RunThread("T02");
        runThread2.start();
        RunThread runThread3 = new RunThread("T03");
        runThread3.start();
        RunThread runThread4 = new RunThread("T04");
        runThread4.start();
        RunThread runThread5 = new RunThread("T05");
        runThread5.start();
        System.out.println("Main thread dead");
    }
}
