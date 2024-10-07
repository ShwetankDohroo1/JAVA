package SEPT_17;

class Pen{
    public synchronized void writewithPenandPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to write something.");
        paper.finishWriting();
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}
class Paper{
    public synchronized void writewithPenandPaper(Pen pen){
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to write something.");
        pen.finishWriting();
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using  pen " + this);
    }
}
class Task1 implements Runnable{
    private Pen pen;
    private Paper paper;
    public Task1(Pen pen,Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run(){
        pen.writewithPenandPaper(paper);
    }
}
class Task2 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (pen){
            paper.writewithPenandPaper(pen);
        }
    }
}
public class DeadLock {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen,paper), "Thread1");
        Thread t2 = new Thread(new Task2(pen,paper), "Thread2");

        t1.start();
        t2.start();
    }
}
