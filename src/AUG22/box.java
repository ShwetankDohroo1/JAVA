package AUG22;

public class box implements Comparable<box> {
    int length,width,height;
    public box(){

    }
    public box(int l, int w, int h){
        length = l;
        width = w;
        height = h;
    }
    public int volume(){
        return length * width * height;
    }
    public int surfacearea(){
        return 2 * (length * width) + (width * height) + (length * height);
    }
    @Override
    public int compareTo(box b){
        int v1 = this.volume();
        int v2 = b.volume();
        if(v1>v2){
            return 1;
        }
        else if(v1<v2){
            return -1;
        }
        else{
            return 0;
        }
    }
}
