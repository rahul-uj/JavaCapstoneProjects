package fruitbowl2;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class FruitBowl {

    private List<Fruit> fruits;

    private int countOfColours;

    public int getCountOfColours() {
        return countOfColours;
    }

    public FruitBowl(List<Fruit> fruits) {
        this.fruits = new ArrayList<>();
        this.fruits = fruits;
    }

    public void displayFruitBowl() {
        fruits.stream().forEach(System.out::println);
    }

    public int getCountOfDistinctFruitColors(){
        List<String> distictFruitColors = fruits.stream().map(Fruit::getColor).distinct().collect(Collectors.toList());
        countOfColours = distictFruitColors.size();
        return countOfColours;
    }
}
