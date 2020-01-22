package geekBrains.java1;

public class Cat extends Animal {
    private String currentType = "Cat";
    private int maxJump;
    private int maxRunDist;
    Cat(){
        super("CAT");
        maxJump = 1 + (int) (Math.random() * 7);
        maxRunDist = 200 + (int) (Math.random() * 300);

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

            System.out.println(currentType + " SWIM: FALSE");

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
