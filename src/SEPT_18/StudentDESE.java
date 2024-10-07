package SEPT_18;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDESE {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Shwetank", 1));
        students.add(new Student("Shubham", 2));
        students.add(new Student("Sidhant", 3));


        FileOutputStream fos = new FileOutputStream("student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);
        oos.close();
        System.out.println("List of students serialized");

        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        List<Student> stds = (List<Student>)obj;
        for(Student std : stds){
            System.out.println(std);
        }
        ois.close();
    }
}
