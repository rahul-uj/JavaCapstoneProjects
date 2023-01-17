package fruitbowl;

import java.util.List;
import java.util.stream.Collectors;

public class FruitSorter {

    List<Fruit> fruitList2;
    List<String> distinctSizes;
    public void sortBySize() {
        FruitBowl fruitBowl = new FruitBowl();
        fruitList2 = fruitBowl.addFruits();

        FruitBasket fruitBasket = new FruitBasket();
        distinctSizes = fruitBasket.getDistinctSize(fruitList2);

        for (String size : distinctSizes) {
            FruitBasket fruitBasket2 = new FruitBasket(size);
            List<String> collect = fruitList2.stream()
                    .filter(f -> f.getSize().equalsIgnoreCase(size)).map(f -> f.getName()).collect(Collectors.toList());
            System.out.printf("Place %s in %s layer of basket%n", collect, fruitBasket2.getLayer());

        }
    }
    public static void main(String[] args) {
        FruitBasket fruitBasket = new FruitBasket();
        fruitBasket.sortBySize();

        FruitBasket fruitBasket1 = new FruitBasket();
        fruitBasket1.sortBySize();
    }
}
