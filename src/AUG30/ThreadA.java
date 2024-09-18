package AUG30;

public class ThreadA implements Runnable {
    String name;
    ThreadA(){};
    ThreadA(String n){
        this.name = n;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " MultiThreading session");
        synchronized(this){
//            System.out.println(Thread.currentThread().getName() + " is running"); when 1 object and 2 or more threads.
            print(this.name);
        }
    }
    //making this static and calling in synchronized makes only 1 thread to get lock at a time{Remaining thread cannot access any other static synchronized method but can access normal-.
    //-static and synchronized non-static methods}.
    static void print(String name){ // make function called in synchronized when 2 objects and 2 threads respectively.
        System.out.println(Thread.currentThread().getName() + " is running");
        System.out.println("Hello " + name);
    }
}
