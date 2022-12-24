package Encapsulation;

public class RWOnly {
    private String name;

    public void SetName(String name) {
        this.name = name;

    }

    public  String GetName() {
        return name;
    }

    public static void main(String[] args) {
        // System.out.println(name);
        RWOnly n = new RWOnly();
    }
}