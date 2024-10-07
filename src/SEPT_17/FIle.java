package SEPT_17;

import java.io.*;

public class FIle {
    public static void main(String[] args) throws IOException {
//        File f = new File("abc.txt");//pointing the file
//        System.out.println(f.exists());//check file is made or not
//        f.createNewFile();//need to throw IOException because what if we have chosen wrong directory or file already exists.
////        f.mkdir(); create a new directory
//        System.out.println(f);


//        File f1 = new File("a1.txt");
//        try{
//            if(f1.createNewFile()){
//                System.out.println("New file is created");
//            }
//            else{
//                System.out.println("File already exisits");
//            }
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        //Writing in file
//        FileWriter fw = new FileWriter("abc.txt");
//        fw.write("Hello");
//        fw.flush();//to update the changes.
//        fw.close();//to close the object so that no resource leakage occurs.

        //reading file
//        FileReader fr = new FileReader("abc.txt");
//        int i;
//        while((i = fr.read()) != -1){
//            System.out.print((char) i);
//        }
//        fr.close();//no need to do this its just a formality.

        //BufferedReader fastest reader because it reads line by line
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        
    }
}
