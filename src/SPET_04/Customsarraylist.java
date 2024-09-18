package SPET_04;
import java.util.*;
public class Customsarraylist {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    Customsarraylist(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    public Boolean isFull(){
        return size+1 == DEFAULT_SIZE;
    }
    public void resize(){
        DEFAULT_SIZE *=2;
        int[] temp = new int[DEFAULT_SIZE];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }
    @Override
    public String toString(){
        return "Customsarraylist{"+
                "data="+ Arrays.toString(data)+
                ", size=" + size+
                '}';
    }
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        Customsarraylist list = new Customsarraylist();
        list.add(3);
        list.add(9);
        list.add(12);
        System.out.println(list);
    }
}
