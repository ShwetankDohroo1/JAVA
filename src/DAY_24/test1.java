package DAY_24;

public class test1 {
    int id;
    String name;

    test1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", Name: " + this.name;
    }
}
