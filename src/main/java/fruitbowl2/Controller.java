package fruitbowl2;
import java.util.ArrayList;
import java.util.List;
public class Controller {

    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Apple","Red","Medium");
        Fruit fruit2 = new Fruit("Grapes","Green","Small");
        Fruit fruit3 = new Fruit("WaterMelon","Green","Big");
        Fruit fruit4 = new Fruit("Cherry" ,"Red","Small");
        Fruit fruit5 = new Fruit("Chikoo" ,"Brown","Small");

        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(fruit1);
        fruitList.add(fruit2);
        fruitList.add(fruit3);
        fruitList.add(fruit4);
        fruitList.add(fruit5);

        FruitBowl fruitBowl = new FruitBowl(fruitList);
        fruitBowl.displayFruitBowl();
        int countOfDistinctFruitColors = fruitBowl.getCountOfDistinctFruitColors();
        System.out.println(countOfDistinctFruitColors);

        LayeredFruitBasket layeredFruitBasket = new LayeredFruitBasket();
        List<Layer> layers = layeredFruitBasket.getLayers();
        System.out.println(layers);


    }
}
