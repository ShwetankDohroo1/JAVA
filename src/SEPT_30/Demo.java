package SEPT_30;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Custom_sort_student[] students = new Custom_sort_student[2]; // Adjust size as needed
        students[0] = new Custom_sort_student(2373, "Shwetank", 90);
        students[1] = new Custom_sort_student(2350, "Shrija", 100);
        Arrays.sort(students);
        System.out.println("Students sorted by Roll Number:");
        for(Custom_sort_student student:students){
            System.out.println("Roll Number: " + student.getRollNumber() + ", Name: " + student.getName() + ", Marks: " + student.getMarks());
        }

    }
}
