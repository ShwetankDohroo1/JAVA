package SEPT_05;

import java.util.ArrayList;
import java.util.List;

public class GenericCLass <T>{
    Integer i;
    String str;
    T generic;

    public GenericCLass(){}

    public GenericCLass(int i, String str){
        this.i = i;
        this.str = str;
    }
    public T getGeneric(){
        return generic;
    }
    public void setGeneric(T t){
        this.generic = t;
    }
    public static void main(String[] args){
        List<Object> ls = new ArrayList<>();
        ls.add(3);
        ls.add("abc");
        ls.add(12.23);
        GenericCLass gc = new GenericCLass(123,"abc");
        System.out.println(gc.getGeneric());
    }
}
