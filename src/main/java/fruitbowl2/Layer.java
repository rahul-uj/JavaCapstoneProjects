package fruitbowl2;

public class Layer {

    private int layerNumber;
    public Layer(int layerNumber) {
        this.layerNumber = layerNumber;
    }

    @Override
    public String toString() {
        return "Layer{" +
                "layerNumber=" + layerNumber +
                '}';
    }
}
