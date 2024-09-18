package SEPT_18;

import java.io.Serializable;

public class A implements Serializable {
    public int i =10;
    public void funa(){
        System.out.println("Inside funa of A" + i);
    }
}
