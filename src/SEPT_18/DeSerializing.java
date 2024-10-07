package SEPT_18;

import java.io.*;

public class DeSerializing{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fos = new FileInputStream("abcd.txt");
        ObjectInputStream ois = new ObjectInputStream(fos);
        Object obj = ois.readObject();
        A a1 = (A) obj;
        a1.funa();
        String ss = (String) ois.readObject();
        System.out.println(ss);
        int z = (Integer)ois.readObject();
        System.out.println(z);
        ois.close();
    }
}
