package AUG27;

public class thread extends Thread{

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello " + i);
        }
    }

    public static void main(String[] args) {
        thread t = new thread();
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("Inside main Method " + i);
        }
    }
}
