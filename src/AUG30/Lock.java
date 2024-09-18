package AUG30;
//if we make 1 object and 2 threads, only synchronized method in overridden run(){} is enough as in ThreadA.
//if we make 2 objects and 2 threads respectively, we need to make the print() method static and then there SOUT the name of thread.
public class Lock {
    public static void main(String[] args) {
        ThreadA ta = new ThreadA("Shwetank");
        ThreadA tb = new ThreadA("Siddhant");
        Thread t1 = new Thread(ta,"ThreadA");
        Thread t2 = new Thread(tb,"ThreadB");

        t1.start();
        t2.start();
    }
}
