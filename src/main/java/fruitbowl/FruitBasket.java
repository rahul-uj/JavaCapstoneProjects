package fruitbowl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FruitBasket implements FruitSorter{
    public static void main(String[] args) {
        FruitBasket fruitBasket = new FruitBasket();
        fruitBasket.sortByColor();
    }

    public List getDistinctColors(List<Fruit> list){
        List<String> collect = list.stream().map(Fruit::getColor).distinct().collect(Collectors.toList());
        return  collect;
    }

    public List<String> getDistinctSize(List<Fruit> list){
        List<String> collect = list.stream().map(Fruit::getSize).distinct().collect(Collectors.toList());
        return  collect;
    }

    @Override
    public void sortByColor() {
        FruitBowl fruitBowl = new FruitBowl();
        List<Fruit> fruitList2 = fruitBowl.addFruits();
        FruitBasket fruitBasket = new FruitBasket();
        List<String> distinctValues = fruitBasket.getDistinctColors(fruitList2);
    }

    @Override
    public void sortBySize() {
        FruitBowl fruitBowl2 = new FruitBowl();
        List<Fruit> fruitList2 = fruitBowl2.addFruits();

        System.out.println("Big Sized Fruits");
        List<Fruit> bigFruits = fruitList2.stream().filter(fruit -> fruit.getSize().equalsIgnoreCase("Big")).collect(Collectors.toList());
        bigFruits.forEach(System.out::println);

        System.out.println("Medium Sized Fruits");
        List<Fruit> mediumFruits = fruitList2.stream().filter(fruit -> fruit.getSize().equalsIgnoreCase("Medium")).collect(Collectors.toList());
        mediumFruits.forEach(System.out::println);
        System.out.println("Small Sized Fruits");
        List<Fruit> smallFruits = fruitList2.stream().filter(fruit -> fruit.getSize().equalsIgnoreCase("Small")).collect(Collectors.toList());
        smallFruits.forEach(System.out::println);


    }
}
