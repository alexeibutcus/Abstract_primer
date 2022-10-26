import java.util.ArrayList;

public class Car extends Transport {
    public Car(int id, int weight, int nr, String color) {
        super(id, weight, nr, color);
    }

    @Override
    public void move(float speed) {
        float speedcar = (float)(120*0.6+speed);
        System.out.println(speedcar);
    }
}