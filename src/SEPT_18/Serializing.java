package SEPT_18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializing {
    public static void main(String[] args) throws IOException {
        A a1 = new A();
        a1.i = 20;
        FileOutputStream fos = new FileOutputStream("abcd.txt");
        ObjectOutputStream oos  = new ObjectOutputStream(fos);

        oos.writeObject("Hello");
        oos.writeObject(100);
    }
}
