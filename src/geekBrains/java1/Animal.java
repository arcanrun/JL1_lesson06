package geekBrains.java1;

public class Animal {

    private String type;

    Animal(String type) {
        this.type = type;
    }

    public void run(int distance) {
        System.out.println("The " + type + " is running a distance: " + distance);
    }

    public void swim(int distance) {
        System.out.println("The " + type + " is swimming a distance: " + distance);
    }

    public void jump(int height) {
        System.out.println("The " + type + " is jumping over: " + height);
    }
}
