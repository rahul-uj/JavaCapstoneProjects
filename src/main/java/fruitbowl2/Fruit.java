package fruitbowl2;

public class Fruit {
    private String name;
    private String color;
    private String size;

    public Fruit(String name, String color, String size) {
        this.color = color;
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
