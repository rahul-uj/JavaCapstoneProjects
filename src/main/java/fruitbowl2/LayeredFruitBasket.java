package fruitbowl2;

import java.util.ArrayList;
import java.util.List;

public class LayeredFruitBasket {

    private FruitBowl fruitBowl;
    private List<Layer> layers;

    public List<Layer> getLayers() {
        return layers;
    }

    public LayeredFruitBasket() {
        int distinctFruitsColors = fruitBowl.getCountOfDistinctFruitColors();
        this.layers = new ArrayList<>(fruitBowl.getCountOfColours());
    }

    @Override
    public String toString() {
        return "LayeredFruitBasket{" +
                "layers=" + layers +
                '}';
    }
}
