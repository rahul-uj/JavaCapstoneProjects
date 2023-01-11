package fruitbowl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
public class FruitBowl {
    public List<Fruit> addFruits(){
        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
        fruitArrayList.add(new Fruit("Apple","Red","Medium"));
        fruitArrayList.add(new Fruit("Banana","Yellow","Small"));
        fruitArrayList.add(new Fruit("Orange","Orange","Medium"));
        fruitArrayList.add(new Fruit("Cherry","Red","Small"));
        fruitArrayList.add(new Fruit("Papaya","Yellow","Medium"));
        fruitArrayList.add(new Fruit("MuskMellon","Orange","Big"));
        return fruitArrayList;
    }
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Fruit{
    public String name;
    public String color;
    public String size;

}
