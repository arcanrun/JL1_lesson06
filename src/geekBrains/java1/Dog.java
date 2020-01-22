package geekBrains.java1;

public class Dog extends Animal {
    private String currentType = "Dog";
    private int maxJump;
    private int maxRunDist;
    private int maxSwimDist;

    Dog(){
        super("Dog");
        maxJump = 6 + (int) (Math.random() * 17);
        maxRunDist = 500 + (int) (Math.random() * 700);

    }

    @Override
    public void run(int distance) {

        if (distance > maxRunDist) {
            System.out.println(currentType + " RUN: FALSE");
            return;
        }
        System.out.println("The " + currentType + " is running a distance: " + distance);
    }

    @Override
    public void swim(int distance) {

        if (distance > maxSwimDist) {
            System.out.println(currentType + " SWIM: FALSE");
            return;
        }
        System.out.println("The " + currentType + " is swimming a distance: " + distance);
    }



    @Override
    public void jump(int height) {
        if (height > maxJump){
            System.out.println(currentType + " JUMP: FALSE");
            return;
        }
        System.out.println("The " + currentType + " is jumping over: " + height);
    }



}
