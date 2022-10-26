public class BUs extends Transport {

    public BUs(int id, int weight, int nr, String color) {
        super(id, weight, nr, color);
    }

    @Override
    public void move(float speed) {
        float speedBus = (float) (60 * 1.2 + speed);
        System.out.println(speedBus);
    }
}
