package SEPT_30;

public class Custom_sort_student implements Comparable<Custom_sort_student>{
    private int rollNumber;
    private String name;
    private int marks;
    private Custom_sort_student other;

    public Custom_sort_student(int rollNumber, String name, int marks){
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks =  marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    @Override
    public int compareTo(Custom_sort_student other) {
        this.other = other;
        return this.rollNumber - other.rollNumber;
    }
}
