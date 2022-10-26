public abstract class Transport {
    protected int id, weight, nr;
    protected String color;

    public Transport() {

    }

    @Override
    public String toString() {
        return "id=" + id +
                ", weight=" + weight +
                ", nr=" + nr +
                ", color='" + color + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Transport(int id, int weight, int nr, String color) {
        this.id = id;
        this.weight = weight;
        this.nr = nr;
        this.color = color;
    }

    public abstract void move(float speed);
}
