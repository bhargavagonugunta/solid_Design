package solid.birds;


import solid.Behaviars.flyBehaviar;
import solid.bird.Bird;

public class Sperow extends Bird implements flyBehaviar {
    public Sperow() {
    }

    public Sperow(int age, String name, String color) {
        super(age, name, color);
    }



}
